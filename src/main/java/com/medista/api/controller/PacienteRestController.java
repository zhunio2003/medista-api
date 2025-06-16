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

import com.medista.api.entity.Paciente;
import com.medista.api.service.interfaces.IPacienteService;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins= {"http://localhost:4200"})
public class PacienteRestController {
	@Autowired
	private IPacienteService pacienteService;
	
	@GetMapping("/pacientes")
	public List<Paciente> index() {
		return pacienteService.findAll();
	}
	
	@GetMapping("/pacientes/id/{id}")
	public Paciente showId(@PathVariable Long id) {
		return pacienteService.findById(id);
	}
	
	@GetMapping("/pacientes/cedula/{cedula}")
	public Paciente showCedula(@PathVariable String cedula) {
		return pacienteService.findByCedulaPac(cedula);
	}
	
	@GetMapping("/pacientes/apellido/{apellido}")
	public List<Paciente> filterByApellido(@PathVariable String apellido) {
		return pacienteService.filterByApellidoPac(apellido);
	}
	
	@GetMapping("/pacientes/profesion/{profesion}")
	public List<Paciente> filterByProfesion(@PathVariable String profesion) {
		return pacienteService.filterByProfesionPac(profesion);
	}
	
	
	
	@PostMapping("/pacientes")
	@ResponseStatus(HttpStatus.CREATED)
	public Paciente create(@RequestBody Paciente paciente) {
		return pacienteService.save(paciente);
	}
	
	@PutMapping("/pacientes/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Paciente update(@RequestBody Paciente paciente, @PathVariable Long id) {
		Paciente pacienteActual = pacienteService.findById(id);
		
		
		pacienteActual.setCedula(paciente.getCedula());
		pacienteActual.setFechaNacimiento(paciente.getFechaNacimiento());
		pacienteActual.setNombre(paciente.getNombre());
		pacienteActual.setApellido(paciente.getApellido());
		pacienteActual.setLugar(paciente.getLugar());
		pacienteActual.setPais(paciente.getPais());
		pacienteActual.setDireccion(paciente.getDireccion());
		pacienteActual.setBarrio(paciente.getBarrio());
		pacienteActual.setParroquia(paciente.getParroquia());
		pacienteActual.setCanton(paciente.getCanton());
		pacienteActual.setProvincia(paciente.getProvincia());
		pacienteActual.setTelefono(paciente.getTelefono());
		pacienteActual.setProfesion(paciente.getProfesion());
		pacienteActual.setTipoSangre(paciente.getTipoSangre());
		pacienteActual.setGenero(paciente.getGenero());
		pacienteActual.setEstadoCivil(paciente.getEstadoCivil());
		pacienteActual.setCarrera(paciente.getCarrera());
		pacienteActual.setCiclo(paciente.getCiclo());
		
		return pacienteService.save(pacienteActual);
		
	}
	
	@DeleteMapping("/pacientes/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		pacienteService.delete(id);
	}
	
	
	
}
