package com.medista.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.medista.api.entity.Doctor;
import com.medista.api.entity.FichaMedica;
import com.medista.api.entity.ReferenciaMedica;
import com.medista.api.service.interfaces.IDoctorService;
import com.medista.api.service.interfaces.IFichaMedicaService;
import com.medista.api.service.interfaces.IReferenciaMedicaService;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:4200"})
public class ReferenciaMedicaRestController {

	@Autowired
	private IReferenciaMedicaService referenciaService;

	@Autowired
	private IFichaMedicaService fichaService;

	@Autowired
	private IDoctorService doctorService;

	// GET todas las referencias
	@GetMapping("/referencias_medicas")
	public ResponseEntity<List<ReferenciaMedica>> getAll() {
		return ResponseEntity.ok(referenciaService.findAll());
	}

	// GET una referencia
	@GetMapping("/referencias_medicas/{id}")
	public ReferenciaMedica getById(@PathVariable Long id) {
		return referenciaService.findById(id);
	}

	// POST crear nueva referencia
	@PostMapping("/referencias_medicas")
	@ResponseStatus(HttpStatus.CREATED)
	public ReferenciaMedica create(@RequestBody ReferenciaMedica referencia) {

		return referenciaService.save(referencia);
	}

	// PUT actualizar referencia
	@PutMapping("/referencias_medicas/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public ReferenciaMedica update(@RequestBody ReferenciaMedica ref, @PathVariable Long id) {
		ReferenciaMedica actual = referenciaService.findById(id);

		actual.setInstitucion(ref.getInstitucion());
		actual.setServicio(ref.getServicio());
		actual.setEntidadSistema(ref.getEntidadSistema());
		actual.setEstablecimiento(ref.getEstablecimiento());
		actual.setServicioDerivado(ref.getServicioDerivado());
		actual.setEspecialidad(ref.getEspecialidad());
		actual.setFecha(ref.getFecha());
		actual.setMotivoLimitada(ref.isMotivoLimitada());
		actual.setMotivoFaltaProfesional(ref.isMotivoFaltaProfesional());
		actual.setMotivoOtros(ref.isMotivoOtros());
		actual.setResumen(ref.getResumen());
		actual.setHallazgos(ref.getHallazgos());
		actual.setDiagnosticos(ref.getDiagnosticos());

		// Puedes permitir actualizar doctor y ficha si quieres, pero con validación

		return referenciaService.save(actual);
	}

	// DELETE eliminar
	@DeleteMapping("/referencias_medicas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		referenciaService.delete(id);
	}
}
