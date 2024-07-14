package ista.sistemaClinica.model.dao;

import org.springframework.data.repository.CrudRepository;

import ista.sistemaClinica.model.entity.SignoVital;


public interface ISignoVitalDao extends CrudRepository<SignoVital, Long>{

}
