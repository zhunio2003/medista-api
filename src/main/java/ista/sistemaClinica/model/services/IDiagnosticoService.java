package ista.sistemaClinica.model.services;

import java.util.List;

import ista.sistemaClinica.model.entity.Diagnostico;

public interface IDiagnosticoService {
	public List<Diagnostico> findAll();
	public Diagnostico save(Diagnostico diagnostico);
	public Diagnostico findById(Long id);
	public void delete(Long id);

}
