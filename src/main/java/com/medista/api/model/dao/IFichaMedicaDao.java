package com.medista.api.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medista.api.model.entity.FichaMedica;
import com.medista.api.model.entity.Paciente;

public interface IFichaMedicaDao extends JpaRepository<FichaMedica, Long>{
	FichaMedica findByPaciente(Paciente paciente);

}
