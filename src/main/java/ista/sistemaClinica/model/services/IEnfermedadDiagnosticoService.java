package ista.sistemaClinica.model.services;

import java.util.List;

import ista.sistemaClinica.model.entity.EnfermedadDiagnostico;

public interface IEnfermedadDiagnosticoService {
	public List<EnfermedadDiagnostico> findAll();
	public EnfermedadDiagnostico save(EnfermedadDiagnostico enfermedadDiagnostico);
	public EnfermedadDiagnostico findById(Long id);
	public void delete(Long id);

}
