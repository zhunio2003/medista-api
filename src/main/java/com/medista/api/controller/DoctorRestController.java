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

import com.medista.api.model.entity.Doctor;
import com.medista.api.model.services.IDoctorService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins= {"http://localhost:4200"})
public class DoctorRestController {
	@Autowired
	private IDoctorService doctorService;
	
	@GetMapping("/doctores")
	public List<Doctor> index() {
		return doctorService.findAll();
	}
	
	@GetMapping("/doctores/{id}")
	public Doctor show(@PathVariable Long id) {
		return doctorService.findById(id);
	}
	
	@PostMapping("/doctores")
	@ResponseStatus(HttpStatus.CREATED)
	public Doctor create(@RequestBody Doctor doctor) {
		return doctorService.save(doctor);
	}
	
	@PutMapping("/doctores/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Doctor update(@RequestBody Doctor doctor, @PathVariable Long id) {
		Doctor doctorActual = doctorService.findById(id);
		
		
		doctorActual.setNombreDoc(doctor.getNombreDoc());
		doctorActual.setApellidoDoc(doctor.getApellidoDoc());
		doctorActual.setTelefonoDoc(doctor.getTelefonoDoc());
		doctorActual.setDireccionDoc(doctor.getDireccionDoc());
		doctorActual.setEspecialidadDoc(doctor.getEspecialidadDoc());
		doctorActual.setCodigoMspDoc(doctor.getCodigoMspDoc());
		doctorActual.setGeneroDoc(doctor.getGeneroDoc());
		doctorActual.setPasswordDoc(doctor.getPasswordDoc());
	
		return doctorService.save(doctorActual);
		
	}
	
	@DeleteMapping("/doctores/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		doctorService.delete(id);
	}
	
	// metodos para filtrar por cedula
	@GetMapping("/doctores/cedula/{cedula}")
	public Doctor showDoctor(@PathVariable String cedula) {
		return doctorService.findByCedDoctor(cedula);
	}
}
