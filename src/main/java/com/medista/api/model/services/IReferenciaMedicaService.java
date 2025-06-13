package com.medista.api.model.services;

import java.util.List;

import com.medista.api.model.entity.ReferenciaMedica;

public interface IReferenciaMedicaService {
	public List<ReferenciaMedica> findAll();
	public ReferenciaMedica save(ReferenciaMedica referenciaMedica);
	public ReferenciaMedica findById(Long id);
	public void delete(Long id);

}
