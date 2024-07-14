package ista.sistemaClinica.model.services;

import java.util.List;

import ista.sistemaClinica.model.entity.AtencionMedica;

public interface IAtencionMedicaService {
	public List<AtencionMedica> findAll();
	public AtencionMedica save(AtencionMedica atencionMedica);
	public AtencionMedica findById(Long id);
	public void delete(Long id);

}
