package com.medista.api.model.services;

import java.util.List;

import com.medista.api.model.entity.Discapacidad;

public interface IDiscapacidadService {
	public List<Discapacidad> findAll();
	public Discapacidad save(Discapacidad discapacidad);
	public Discapacidad findById(Long id);
	public void delete(Long id);

}
