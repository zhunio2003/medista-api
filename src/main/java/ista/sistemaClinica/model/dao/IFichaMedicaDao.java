package ista.sistemaClinica.model.dao;

import org.springframework.data.repository.CrudRepository;

import ista.sistemaClinica.model.entity.FichaMedica;

public interface IFichaMedicaDao extends CrudRepository<FichaMedica, Long>{

}
