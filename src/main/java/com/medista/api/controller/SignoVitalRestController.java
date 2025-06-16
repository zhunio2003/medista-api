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

import com.medista.api.entity.SignoVital;
import com.medista.api.service.interfaces.ISignoVitalService;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins= {"http://localhost:4200"})
public class SignoVitalRestController {
	@Autowired
	private ISignoVitalService signoVitalService;
	
	@GetMapping("/signos_vitales")
	public List<SignoVital> index() {
		return signoVitalService.findAll();
	}
	
	@GetMapping("/signos_vitales/{id}")
	public SignoVital show(@PathVariable Long id) {
		return signoVitalService.findById(id);
	}
	
	@PostMapping("/signos_vitales")
	@ResponseStatus(HttpStatus.CREATED)
	public SignoVital create(@RequestBody SignoVital signoVital) {
		return signoVitalService.save(signoVital);
	}

	@PutMapping("/signos_vitales/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public SignoVital update(@RequestBody SignoVital signoVital, @PathVariable Long id) {
		SignoVital signoVitalActual = signoVitalService.findById(id);

		signoVitalActual.setPresionArterial(signoVital.getPresionArterial());
		signoVitalActual.setPeso(signoVital.getPeso());
		signoVitalActual.setTalla(signoVital.getTalla());
		signoVitalActual.setImc(signoVital.getImc());
		signoVitalActual.setFrecuenciaCardiaca(signoVital.getFrecuenciaCardiaca());
		signoVitalActual.setFrecuenciaRespiratoria(signoVital.getFrecuenciaRespiratoria());
		signoVitalActual.setTemperatura(signoVital.getTemperatura());
		signoVitalActual.setSaturacionOxigeno(signoVital.getSaturacionOxigeno());
		signoVitalActual.setGlasgowOcular(signoVital.getGlasgowOcular());
		signoVitalActual.setGlasgowVerbal(signoVital.getGlasgowVerbal());
		signoVitalActual.setGlasgowMotora(signoVital.getGlasgowMotora());
		signoVitalActual.setGlasgowTotal(signoVital.getGlasgowTotal());
		signoVitalActual.setLlenadoCapilar(signoVital.getLlenadoCapilar());
		signoVitalActual.setReaccionPupilar(signoVital.getReaccionPupilar());

		return signoVitalService.save(signoVitalActual);
	}


	@DeleteMapping("/signos_vitales/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		signoVitalService.delete(id);
	}
}
