package ista.sistemaClinica.model.services;

import java.util.List;

import ista.sistemaClinica.model.entity.Discapacidad;

public interface IDiscapacidadService {
	public List<Discapacidad> findAll();
	public Discapacidad save(Discapacidad discapacidad);
	public Discapacidad findById(Long id);
	public void delete(Long id);

}
