package com.medista.api.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.medista.api.model.entity.AtencionMedica;
import com.medista.api.model.services.IAtencionMedicaService;


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
	public AtencionMedica show(@PathVariable Long id) {
		return atencionMedicaService.findById(id);
	}
	
	@PostMapping("/atenciones_medicas")
	@ResponseStatus(HttpStatus.CREATED)
	public AtencionMedica create(@RequestBody AtencionMedica atencionMedica) {
		return atencionMedicaService.save(atencionMedica);
	}
	
	@PutMapping("/atenciones_medicas/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public AtencionMedica update(@RequestBody AtencionMedica atencionMedica, @PathVariable Long id) {
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
	public void delete(@PathVariable Long id) {
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
	
	@GetMapping("/atenciones_por_ano")
	public ResponseEntity<Map<Integer, Integer>> getAtencionesPorAno() {
	    List<AtencionMedica> atenciones = atencionMedicaService.findAll();
	    Map<Integer, Integer> atencionesPorAno = new HashMap<>();

	    for (AtencionMedica atencion : atenciones) {
	        int ano = atencion.getFechaAtencionAte().toLocalDate().getYear();
	        atencionesPorAno.put(ano, atencionesPorAno.getOrDefault(ano, 0) + 1);
	    }

	    return new ResponseEntity<>(atencionesPorAno, HttpStatus.OK);
	}

}
