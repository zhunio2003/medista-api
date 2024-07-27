package ista.sistemaClinica.model.dao;

import org.springframework.data.repository.CrudRepository;

import ista.sistemaClinica.model.entity.Instituto;
import ista.sistemaClinica.model.entity.Titulo;

public interface IInstitutoDao extends CrudRepository<Instituto, Long> {
	Titulo findByidIns(Long idIns);
}
