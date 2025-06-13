package com.medista.api.model.services;

import java.util.List;


import com.medista.api.model.entity.Enfermedad;

public interface IEnfermedadService {
	public List<Enfermedad> findAll();
	public Enfermedad save(Enfermedad enfermedad);
	public Enfermedad findById(Long id);
	public void delete(Long id);

	// Filtros y busquedas
			public Enfermedad findByCodEnf(String codigoEnf);
}
