package com.medista.api.service.interfaces;

import java.util.List;

import com.medista.api.entity.AtencionMedica;

public interface IAtencionMedicaService {
	public List<AtencionMedica> findAll();
	public AtencionMedica save(AtencionMedica atencionMedica);
	public AtencionMedica findById(String id);
	public void delete(String id);

}
