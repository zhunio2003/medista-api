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

import ista.sistemaClinica.model.entity.Instituto;
import ista.sistemaClinica.model.services.IInstitutoService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins= {"http://localhost:4200"})
public class InstitutoRestController {
	@Autowired
	private IInstitutoService institutoService;
	
	@GetMapping("/institutos")
	public List<Instituto> index() {
		return institutoService.findAll();
	}
	
	@GetMapping("/institutos/{id}")
	public Instituto show(@PathVariable Long id) {
		return institutoService.findById(id);
	}
	
	@PostMapping("/institutos")
	@ResponseStatus(HttpStatus.CREATED)
	public Instituto create(@RequestBody Instituto instituto) {
		return institutoService.save(instituto);
	}
	
	@PutMapping("/institutos/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Instituto update(@RequestBody Instituto instituto, @PathVariable Long id) {
		Instituto institutoActual = institutoService.findById(id);
		
		
		institutoActual.setNombre_ins(instituto.getNombre_ins());
		institutoActual.setDireccion_ins(instituto.getDireccion_ins());
		institutoActual.setRector_ins(instituto.getRector_ins());
		institutoActual.setImage_instituto(instituto.getImage_instituto());

	
		return institutoService.save(institutoActual);
		
	}
	
	@DeleteMapping("/institutos/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		institutoService.delete(id);
	}
}
