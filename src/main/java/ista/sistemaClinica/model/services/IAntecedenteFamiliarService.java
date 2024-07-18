package ista.sistemaClinica.model.services;

import java.util.List;

import ista.sistemaClinica.model.entity.AntecedenteFamiliar;

public interface IAntecedenteFamiliarService {
	public List<AntecedenteFamiliar> findAll();
	public AntecedenteFamiliar save(AntecedenteFamiliar antecedenteFamiliar);
	public AntecedenteFamiliar findById(Long id);
	public void delete(Long id);

}
