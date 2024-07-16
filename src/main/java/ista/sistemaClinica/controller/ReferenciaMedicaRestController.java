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

import ista.sistemaClinica.model.entity.ReferenciaMedica;
import ista.sistemaClinica.model.services.IReferenciaMedicaService;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins= {"http://localhost:4200"})
public class ReferenciaMedicaRestController {
	@Autowired
	private IReferenciaMedicaService referenciaMedicaService;
	
	@GetMapping("/referencias_medicas")
	public List<ReferenciaMedica> index() {
		return referenciaMedicaService.findAll();
	}
	
	@GetMapping("/referencias_medicas/{id}")
	public ReferenciaMedica show(@PathVariable Long id) {
		return referenciaMedicaService.findById(id);
	}
	
	@PostMapping("/referencias_medicas")
	@ResponseStatus(HttpStatus.CREATED)
	public ReferenciaMedica create(@RequestBody ReferenciaMedica referenciaMedica) {
		return referenciaMedicaService.save(referenciaMedica);
	}
	
	@PutMapping("/referencias_medicas/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public ReferenciaMedica update(@RequestBody ReferenciaMedica referenciaMedica, @PathVariable Long id) {
		ReferenciaMedica referenciaMedicaActual = referenciaMedicaService.findById(id);
		
		
		referenciaMedicaActual.setInstitucion_ref(referenciaMedica.getInstitucion_ref());
		referenciaMedicaActual.setDepartamento_ref(referenciaMedica.getDepartamento_ref());
		referenciaMedicaActual.setEntidad_sistema_ref(referenciaMedica.getEntidad_sistema_ref());
		referenciaMedicaActual.setEstablecimiento_ref(referenciaMedica.getEstablecimiento_ref());
		referenciaMedicaActual.setServicio_ref(referenciaMedica.getServicio_ref());
		referenciaMedicaActual.setEspecialidad_ref(referenciaMedica.getEspecialidad_ref());
		referenciaMedicaActual.setFecha_ref(referenciaMedica.getFecha_ref());

		referenciaMedicaActual.setMotivo_referencia_ref(referenciaMedica.getMotivo_referencia_ref());
		referenciaMedicaActual.setResumen_ref(referenciaMedica.getResumen_ref());
		referenciaMedicaActual.setHallazgos_ref(referenciaMedica.getHallazgos_ref());
		referenciaMedicaActual.setDiagnostico(referenciaMedica.getDiagnostico());
		referenciaMedicaActual.setAtencionMedica(referenciaMedica.getAtencionMedica());
	
		return referenciaMedicaService.save(referenciaMedicaActual);
		
	}
	
	@DeleteMapping("/referencias_medicas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		referenciaMedicaService.delete(id);
	}
}
