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

import ista.sistemaClinica.model.entity.Enfermedad;
import ista.sistemaClinica.model.services.IEnfermedadService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins= {"http://localhost:4200"})
public class EnfermedadRestController {
	@Autowired
	private IEnfermedadService enfermedadService;
	
	@GetMapping("/enfermedades")
	public List<Enfermedad> index() {
		return enfermedadService.findAll();
	}
	
	@GetMapping("/enfermedades/{id}")
	public Enfermedad show(@PathVariable Long id) {
		return enfermedadService.findById(id);
	}
	
	@PostMapping("/enfermedades")
	@ResponseStatus(HttpStatus.CREATED)
	public Enfermedad create(@RequestBody Enfermedad enfermedad) {
		return enfermedadService.save(enfermedad);
	}
	
	@PutMapping("/enfermedades/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Enfermedad update(@RequestBody Enfermedad enfermedad, @PathVariable Long id) {
		Enfermedad enfermedadActual = enfermedadService.findById(id);
		
		
		enfermedadActual.setCodigo_enf(enfermedad.getCodigo_enf());
		enfermedadActual.setNombre_enf(enfermedad.getNombre_enf());
		enfermedadActual.setTipo_enf(enfermedad.getTipo_enf());
		enfermedadActual.setDescripcion_enf(enfermedad.getDescripcion_enf());
		enfermedadActual.setSintomas_enf(enfermedad.getSintomas_enf());
	
	
		return enfermedadService.save(enfermedadActual);
		
	}
	
	@DeleteMapping("/enfermedades/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		enfermedadService.delete(id);
	}
}
