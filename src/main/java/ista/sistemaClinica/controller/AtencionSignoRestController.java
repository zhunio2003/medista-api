package ista.sistemaClinica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ista.sistemaClinica.model.entity.Paciente;
import ista.sistemaClinica.model.services.IPacienteService;


@RestController
@RequestMapping("/api")
public class AtencionSignoRestController {
	@Autowired
	private IPacienteService pacienteService;
	
	@GetMapping("/pacientes")
	public List<Paciente> index() {
		return pacienteService.findAll();
	}
	
	@GetMapping("/pacientes/{id}")
	public Paciente show(@PathVariable Long id) {
		return pacienteService.findById(id);
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
		
		
		pacienteActual.setCedula_pac(paciente.getCedula_pac());
		pacienteActual.setFecha_nacimiento_pac(paciente.getFecha_nacimiento_pac());
		pacienteActual.setNombre_pac(paciente.getNombre_pac());
		pacienteActual.setApellido_pac(paciente.getApellido_pac());
		pacienteActual.setLugar_pac(paciente.getLugar_pac());
		pacienteActual.setPais_pac(paciente.getPais_pac());
		pacienteActual.setDireccion_pac(paciente.getDireccion_pac());
		pacienteActual.setBarrio_pac(paciente.getBarrio_pac());
		pacienteActual.setParroquia_pac(paciente.getParroquia_pac());
		pacienteActual.setCanton_pac(paciente.getCanton_pac());
		pacienteActual.setProvincia_pac(paciente.getProvincia_pac());
		pacienteActual.setTelefono_pac(paciente.getTelefono_pac());
		pacienteActual.setProfesion_pac(paciente.getProfesion_pac());
		pacienteActual.setTipo_sangre_pac(paciente.getTipo_sangre_pac());
		pacienteActual.setGenero_pac(paciente.getGenero_pac());
		pacienteActual.setEstado_civil_pac(paciente.getEstado_civil_pac());
		pacienteActual.setCarrera_pac(paciente.getCarrera_pac());
		pacienteActual.setCiclo_pac(paciente.getCiclo_pac());
	
		return pacienteService.save(pacienteActual);
		
	}
	
	@DeleteMapping("/pacientes/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		pacienteService.delete(id);
	}
}
