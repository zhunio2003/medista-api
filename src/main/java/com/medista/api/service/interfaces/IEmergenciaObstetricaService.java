package com.medista.api.service.interfaces;

import java.util.List;

import com.medista.api.entity.EmergenciaObstetrica;
import com.medista.api.entity.FichaMedica;

public interface IEmergenciaObstetricaService {
	public List<EmergenciaObstetrica> findAll();
	public EmergenciaObstetrica save(EmergenciaObstetrica emergenciaObstetrica);
	public EmergenciaObstetrica findById(Long id);
	public void delete(Long id);

	public EmergenciaObstetrica findByFichaMedica(FichaMedica fichaMedica);
}
