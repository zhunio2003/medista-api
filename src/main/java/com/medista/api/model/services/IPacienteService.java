package com.medista.api.model.services;

import java.util.List;

import com.medista.api.model.entity.Paciente;

public interface IPacienteService {
	public List<Paciente> findAll();
	public Paciente save(Paciente paciente);
	public Paciente findById(Long id);
	public void delete(Long id);
	
	// Filtros y busquedas
	public Paciente findByCedulaPac(String cedulaPac);
	public List<Paciente> filterByApellidoPac(String apellidoPac);
	public List<Paciente> filterByProfesionPac(String profesionPac);

}
