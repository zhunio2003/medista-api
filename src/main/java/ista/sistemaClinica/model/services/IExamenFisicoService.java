package ista.sistemaClinica.model.services;

import java.util.List;

import ista.sistemaClinica.model.entity.ExamenFisico;

public interface IExamenFisicoService {
	public List<ExamenFisico> findAll();
	public ExamenFisico save(ExamenFisico examenFisico);
	public ExamenFisico findById(Long id);
	public void delete(Long id);

}
