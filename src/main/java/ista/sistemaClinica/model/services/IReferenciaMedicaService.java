package ista.sistemaClinica.model.services;

import java.util.List;

import ista.sistemaClinica.model.entity.ReferenciaMedica;

public interface IReferenciaMedicaService {
	public List<ReferenciaMedica> findAll();
	public ReferenciaMedica save(ReferenciaMedica referenciaMedica);
	public ReferenciaMedica findById(Long id);
	public void delete(Long id);

}
