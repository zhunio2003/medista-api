package com.medista.api.model.services;

import java.util.List;

import com.medista.api.model.entity.EmergenciaObstetrica;
import com.medista.api.model.entity.FichaMedica;

public interface IEmergenciaObstetricaService {
	public List<EmergenciaObstetrica> findAll();
	public EmergenciaObstetrica save(EmergenciaObstetrica emergenciaObstetrica);
	public EmergenciaObstetrica findById(Long id);
	public void delete(Long id);

	public EmergenciaObstetrica findByFichaMedica(FichaMedica fichaMedica);
}
