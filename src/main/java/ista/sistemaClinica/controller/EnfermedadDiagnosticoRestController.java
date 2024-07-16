package ista.sistemaClinica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

import ista.sistemaClinica.model.entity.EnfermedadDiagnostico;
import ista.sistemaClinica.model.services.IEnfermedadDiagnosticoService;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins= {"http://localhost:4200"})
public class EnfermedadDiagnosticoRestController {
	@Autowired
	private IEnfermedadDiagnosticoService enfermedadDiagnosticoService;
	
	@GetMapping("/enfermedades_diagnosticos")
	public List<EnfermedadDiagnostico> index() {
		return enfermedadDiagnosticoService.findAll();
	}
	
	@GetMapping("/enfermedades_diagnosticos/{id}")
	public EnfermedadDiagnostico show(@PathVariable Long id) {
		return enfermedadDiagnosticoService.findById(id);
	}
	
	@PostMapping("/enfermedades_diagnosticos")
	@ResponseStatus(HttpStatus.CREATED)
	public EnfermedadDiagnostico create(@RequestBody EnfermedadDiagnostico enfermedadDiagnostico) {
		return enfermedadDiagnosticoService.save(enfermedadDiagnostico);
	}
	
	@PutMapping("/enfermedades_diagnosticos/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public EnfermedadDiagnostico update(@RequestBody EnfermedadDiagnostico enfermedadDiagnostico, @PathVariable Long id) {
		EnfermedadDiagnostico enfermedadDiagnosticoActual = enfermedadDiagnosticoService.findById(id);
		
		enfermedadDiagnosticoActual.setEnfermedad_ced(enfermedadDiagnostico.getEnfermedad_ced());
		enfermedadDiagnosticoActual.setEnfermedad_ced(enfermedadDiagnostico.getEnfermedad_ced());
		enfermedadDiagnosticoActual.setDiagnostico_ced(enfermedadDiagnostico.getDiagnostico_ced());

		return enfermedadDiagnosticoService.save(enfermedadDiagnosticoActual);
		
	}
	
	@DeleteMapping("/enfermedades_diagnosticos/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		enfermedadDiagnosticoService.delete(id);
	}
}
