package ista.sistemaClinica.model.services;

import java.util.List;

import ista.sistemaClinica.model.entity.EmergenciaObstetrica;

public interface IEmergenciaObstetricaService {
	public List<EmergenciaObstetrica> findAll();
	public EmergenciaObstetrica save(EmergenciaObstetrica emergenciaObstetrica);
	public EmergenciaObstetrica findById(Long id);
	public void delete(Long id);

}
