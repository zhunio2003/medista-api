package ista.sistemaClinica.model.services;

import java.util.List;

import ista.sistemaClinica.model.entity.ExamenComplementario;

public interface IExamenComplementarioService {
	public List<ExamenComplementario> findAll();
	public ExamenComplementario save(ExamenComplementario examenComplementario);
	public ExamenComplementario findById(Long id);
	public void delete(Long id);

}
