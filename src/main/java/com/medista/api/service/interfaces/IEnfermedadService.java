package com.medista.api.service.interfaces;

import java.util.List;


import com.medista.api.entity.Enfermedad;

public interface IEnfermedadService {
	public List<Enfermedad> findAll();
	public Enfermedad save(Enfermedad enfermedad);
	public Enfermedad findById(Long id);
	public void delete(Long id);

	// Filtros y busquedas
			public Enfermedad findByCodEnf(String codigoEnf);
}
