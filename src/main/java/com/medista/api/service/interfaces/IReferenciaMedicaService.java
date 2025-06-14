package com.medista.api.service.interfaces;

import java.util.List;

import com.medista.api.entity.ReferenciaMedica;

public interface IReferenciaMedicaService {
	public List<ReferenciaMedica> findAll();
	public ReferenciaMedica save(ReferenciaMedica referenciaMedica);
	public ReferenciaMedica findById(Long id);
	public void delete(Long id);

}
