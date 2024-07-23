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

import ista.sistemaClinica.model.entity.AtencionMedica;
import ista.sistemaClinica.model.services.IAtencionMedicaService;


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
		atencioMedicaActual.setInstituto(atencionMedica.getInstituto());
		atencioMedicaActual.setDoctor(atencionMedica.getDoctor());
		atencioMedicaActual.setDiagnostico(atencionMedica.getDiagnostico());
	
		return atencionMedicaService.save(atencioMedicaActual);
		
	}
	
	@DeleteMapping("/atenciones_medicas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		atencionMedicaService.delete(id);
	}
}
