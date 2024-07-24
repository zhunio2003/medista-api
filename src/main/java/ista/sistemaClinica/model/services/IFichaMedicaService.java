package ista.sistemaClinica.model.services;

import java.util.List;

import ista.sistemaClinica.model.entity.FichaMedica;

public interface IFichaMedicaService {
	public List<FichaMedica> findAll();
	public FichaMedica save(FichaMedica fichaMedica);
	public FichaMedica findById(Long id);
	public void delete(Long id);
	

}
