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

import ista.sistemaClinica.model.entity.ExamenComplementario;
import ista.sistemaClinica.model.services.IExamenComplementarioService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins= {"http://localhost:4200"})
public class ExamenComplementarioRestController {
	@Autowired
	private IExamenComplementarioService examenComplementarioService;
	
	@GetMapping("/examenes_complementarios")
	public List<ExamenComplementario> index() {
		return examenComplementarioService.findAll();
	}
	
	@GetMapping("/examenes_complementarios/{id}")
	public ExamenComplementario show(@PathVariable Long id) {
		return examenComplementarioService.findById(id);
	}
	
	@PostMapping("/examenes_complementarios")
	@ResponseStatus(HttpStatus.CREATED)
	public ExamenComplementario create(@RequestBody ExamenComplementario examenComplementario) {
		return examenComplementarioService.save(examenComplementario);
	}
	
	@PutMapping("/examenes_complementarios/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public ExamenComplementario update(@RequestBody ExamenComplementario examenComplementario, @PathVariable Long id) {
		ExamenComplementario examenComplementarioActual = examenComplementarioService.findById(id);
		
		
		examenComplementarioActual.setTituloExa(examenComplementario.getTituloExa());
		examenComplementarioActual.setAplicaExa(examenComplementario.getAplicaExa());

		return examenComplementarioService.save(examenComplementarioActual);
		
	}
	
	@DeleteMapping("/examenes_complementarios/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		examenComplementarioService.delete(id);
	}
}
