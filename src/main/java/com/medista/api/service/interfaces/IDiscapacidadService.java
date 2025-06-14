package com.medista.api.service.interfaces;

import java.util.List;

import com.medista.api.entity.Discapacidad;

public interface IDiscapacidadService {
	public List<Discapacidad> findAll();
	public Discapacidad save(Discapacidad discapacidad);
	public Discapacidad findById(Long id);
	public void delete(Long id);

}
