package com.medista.api.model.services;

import java.util.List;

import com.medista.api.model.entity.AtencionMedica;

public interface IAtencionMedicaService {
	public List<AtencionMedica> findAll();
	public AtencionMedica save(AtencionMedica atencionMedica);
	public AtencionMedica findById(Long id);
	public void delete(Long id);

}
