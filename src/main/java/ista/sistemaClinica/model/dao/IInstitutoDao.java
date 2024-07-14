package ista.sistemaClinica.model.dao;

import org.springframework.data.repository.CrudRepository;

import ista.sistemaClinica.model.entity.Instituto;

public interface IInstitutoDao extends CrudRepository<Instituto, Long> {

}
