package ista.sistemaClinica.model.dao;

import org.springframework.data.repository.CrudRepository;

import ista.sistemaClinica.model.entity.Paciente;

public interface IPacienteDao extends CrudRepository<Paciente, Long> {

}
