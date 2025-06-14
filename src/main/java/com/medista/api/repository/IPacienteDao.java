package com.medista.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medista.api.entity.Paciente;


public interface IPacienteDao extends JpaRepository<Paciente, Long> {
	
	Paciente findByCedulaPac(String cedulaPac);
	List<Paciente> findByApellidoPac(String apellidoPac);
	List<Paciente> findByProfesionPac(String profesionPac);

}
