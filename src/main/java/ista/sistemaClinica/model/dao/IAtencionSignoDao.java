package ista.sistemaClinica.model.dao;

import org.springframework.data.repository.CrudRepository;

import ista.sistemaClinica.model.entity.AtencionSigno;

public interface IAtencionSignoDao extends CrudRepository<AtencionSigno, Long>{

}
