package ista.sistemaClinica.model.services;

import java.util.List;

import ista.sistemaClinica.model.entity.Enfermedad;

public interface IEnfermedadService {
	public List<Enfermedad> findAll();
	public Enfermedad save(Enfermedad enfermedad);
	public Enfermedad findById(Long id);
	public void delete(Long id);

}
