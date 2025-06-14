package com.medista.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medista.api.entity.FichaMedica;
import com.medista.api.entity.Paciente;

public interface IFichaMedicaDao extends JpaRepository<FichaMedica, Long>{
	FichaMedica findByPaciente(Paciente paciente);

}
