package com.medista.api.controller;

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

import com.medista.api.entity.ExamenFisico;
import com.medista.api.service.interfaces.IExamenFisicoService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins= {"http://localhost:4200"})
public class ExamenFisicoRestController {
	@Autowired
	private IExamenFisicoService examenFisicoService;
	
	@GetMapping("/examenes_fisicos")
	public List<ExamenFisico> index() {
		return examenFisicoService.findAll();
	}
	
	@GetMapping("/examenes_fisicos/{id}")
	public ExamenFisico show(@PathVariable Long id) {
		return examenFisicoService.findById(id);
	}
	
	@PostMapping("/examenes_fisicos")
	@ResponseStatus(HttpStatus.CREATED)
	public ExamenFisico create(@RequestBody ExamenFisico examenFisico) {
		return examenFisicoService.save(examenFisico);
	}

	@PutMapping("/examenes_fisicos/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public ExamenFisico update(@RequestBody ExamenFisico examenFisico, @PathVariable Long id) {
		ExamenFisico examenFisicoActual = examenFisicoService.findById(id);

		examenFisicoActual.setPielFaneras(examenFisico.getPielFaneras());
		examenFisicoActual.setCabeza(examenFisico.getCabeza());
		examenFisicoActual.setCuello(examenFisico.getCuello());
		examenFisicoActual.setTorax(examenFisico.getTorax());
		examenFisicoActual.setCorazon(examenFisico.getCorazon());
		examenFisicoActual.setAbdomen(examenFisico.getAbdomen());
		examenFisicoActual.setRegionInguinal(examenFisico.getRegionInguinal());
		examenFisicoActual.setMiembrosSuperiores(examenFisico.getMiembrosSuperiores());
		examenFisicoActual.setMiembrosInferiores(examenFisico.getMiembrosInferiores());

		return examenFisicoService.save(examenFisicoActual);
	}


	@DeleteMapping("/examenes_fisicos/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		examenFisicoService.delete(id);
	}
}
