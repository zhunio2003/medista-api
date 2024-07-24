package ista.sistemaClinica.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import ista.sistemaClinica.model.entity.Doctor;
import ista.sistemaClinica.model.entity.FichaMedica;

public interface IFichaMedicaDao extends CrudRepository<FichaMedica, Long>{

}
