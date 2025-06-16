package com.medista.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medista.api.entity.Paciente;


public interface IPacienteDao extends JpaRepository<Paciente, Long> {
	
	Paciente findByCedula(String cedulaPac);
	List<Paciente> findByApellido(String apellidoPac);
	List<Paciente> findByProfesion(String profesionPac);

}
