package com.medista.api.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.medista.api.entity.AtencionMedica;
import com.medista.api.service.interfaces.IAtencionMedicaService;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins= {"http://localhost:4200"})
public class AtencionMedicaRestController {
	@Autowired
	private IAtencionMedicaService atencionMedicaService;

	@GetMapping("/atenciones_medicas")
	public List<AtencionMedica> index() {
		return atencionMedicaService.findAll();
	}

	@GetMapping("/atenciones_medicas/{id}")
	public AtencionMedica show(@PathVariable String id) {
		return atencionMedicaService.findById(id);
	}

	@PostMapping("/atenciones_medicas")
	@ResponseStatus(HttpStatus.CREATED)
	public AtencionMedica create(@RequestBody AtencionMedica atencionMedica) {
		return atencionMedicaService.save(atencionMedica);
	}

	@PutMapping("/atenciones_medicas/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public AtencionMedica update(@RequestBody AtencionMedica atencionMedica, @PathVariable String id) {
		AtencionMedica atencioMedicaActual = atencionMedicaService.findById(id);

		atencioMedicaActual.setMotivoAte(atencionMedica.getMotivoAte());
		atencioMedicaActual.setEnfermedadActualAte(atencionMedica.getEnfermedadActualAte());
		atencioMedicaActual.setTratamientoAte(atencionMedica.getTratamientoAte());
		atencioMedicaActual.setFichaMedica(atencionMedica.getFichaMedica());
		atencioMedicaActual.setDoctor(atencionMedica.getDoctor());
		atencioMedicaActual.setDiagnosticos(atencionMedica.getDiagnosticos());

		return atencionMedicaService.save(atencioMedicaActual);
	}

	@DeleteMapping("/atenciones_medicas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		atencionMedicaService.delete(id);
	}

	@GetMapping("/enfermedades_actuales")
	public ResponseEntity<Map<String, Integer>> getEnfermedadesActuales() {
		List<AtencionMedica> atenciones = atencionMedicaService.findAll();
		Map<String, Integer> enfermedadesCount = new HashMap<>();

		for (AtencionMedica atencion : atenciones) {
			String enfermedad = atencion.getEnfermedadActualAte();
			enfermedadesCount.put(enfermedad, enfermedadesCount.getOrDefault(enfermedad, 0) + 1);
		}

		return new ResponseEntity<>(enfermedadesCount, HttpStatus.OK);
	}

	@GetMapping("/atenciones_por_anio")
	public ResponseEntity<Map<Integer, Integer>> getAtencionesPorAno() {
		List<AtencionMedica> atenciones = atencionMedicaService.findAll();
		Map<Integer, Integer> atencionesPorAno = new HashMap<>();

		for (AtencionMedica atencion : atenciones) {
			Date fecha = atencion.getFechaAtencionAte();
			LocalDate localDate = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			int ano = localDate.getYear();
			atencionesPorAno.put(ano, atencionesPorAno.getOrDefault(ano, 0) + 1);
		}

		return new ResponseEntity<>(atencionesPorAno, HttpStatus.OK);
	}

	// SUBIR ARCHIVO PDF - MEJORADO
	@PostMapping("/atenciones_medicas/{id}/examen-pdf")
	public ResponseEntity<String> subirArchivoPdf(
			@PathVariable String id,
			@RequestParam("archivo") MultipartFile archivo
	) {
		System.out.println("=== DEBUG POST PDF ===");
		System.out.println("ID recibido: " + id);
		System.out.println("Archivo recibido: " + (archivo != null ? archivo.getOriginalFilename() : "null"));
		System.out.println("Archivo vacío: " + (archivo != null ? archivo.isEmpty() : "archivo es null"));

		// Validaciones
		if (archivo == null || archivo.isEmpty()) {
			return ResponseEntity.badRequest().body("El archivo está vacío o no se recibió");
		}

		AtencionMedica atencion = atencionMedicaService.findById(id);
		if (atencion == null) {
			return ResponseEntity.notFound().build();
		}

		System.out.println("Atención encontrada: " + atencion.getId());
		System.out.println("Exámenes complementarios: " + atencion.getExamenesComplementarios().size());

		try {
			byte[] pdfBytes = archivo.getBytes();
			System.out.println("Bytes del archivo: " + pdfBytes.length);

			if (!atencion.getExamenesComplementarios().isEmpty()) {
				atencion.getExamenesComplementarios().get(0).setArchivoPdf(pdfBytes);
				atencionMedicaService.save(atencion);
				return ResponseEntity.ok("Archivo guardado correctamente. Tamaño: " + pdfBytes.length + " bytes");
			} else {
				return ResponseEntity.badRequest().body("No hay exámenes complementarios para esta atención médica");
			}

		} catch (IOException e) {
			System.err.println("Error al procesar archivo: " + e.getMessage());
			return ResponseEntity.status(500).body("Error al guardar el archivo: " + e.getMessage());
		}
	}

	// DESCARGAR ARCHIVO PDF
	@GetMapping("/atenciones_medicas/{id}/examen-pdf")
	public ResponseEntity<byte[]> obtenerArchivoPdf(@PathVariable String id) {
		AtencionMedica atencion = atencionMedicaService.findById(id);
		if (atencion == null || atencion.getExamenesComplementarios().isEmpty()) {
			return ResponseEntity.notFound().build();
		}

		byte[] archivo = atencion.getExamenesComplementarios().get(0).getArchivoPdf();
		if (archivo == null) {
			return ResponseEntity.noContent().build();
		}

		return ResponseEntity.ok()
				.header("Content-Disposition", "attachment; filename=\"examen.pdf\"")
				.contentType(MediaType.APPLICATION_PDF)
				.body(archivo);
	}
}