package ista.sistemaClinica.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ista.sistemaClinica.model.entity.FichaMedica;
import ista.sistemaClinica.model.entity.Paciente;

public interface IFichaMedicaDao extends JpaRepository<FichaMedica, Long>{
	FichaMedica findByPaciente(Paciente paciente);

}
