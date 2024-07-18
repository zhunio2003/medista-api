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

import ista.sistemaClinica.model.entity.Doctor;
import ista.sistemaClinica.model.services.IDoctorService;

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
		
		
		doctorActual.setNombre_doc(doctor.getNombre_doc());
		doctorActual.setApellido_doc(doctor.getApellido_doc());
		doctorActual.setTelefono_doc(doctor.getTelefono_doc());
		doctorActual.setDireccion_doc(doctor.getDireccion_doc());
		doctorActual.setEspecialidad_doc(doctor.getEspecialidad_doc());
		doctorActual.setCodigo_msp(doctor.getCodigo_msp());
		doctorActual.setGenero_doc(doctor.getGenero_doc());
		doctorActual.setPassword_doc(doctor.getPassword_doc());
	
		return doctorService.save(doctorActual);
		
	}
	
	@DeleteMapping("/doctores/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		doctorService.delete(id);
	}
}
