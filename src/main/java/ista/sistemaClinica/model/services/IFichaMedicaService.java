package ista.sistemaClinica.model.services;

import java.util.List;

import ista.sistemaClinica.model.entity.FichaMedica;
import ista.sistemaClinica.model.entity.Paciente;

public interface IFichaMedicaService {
	public List<FichaMedica> findAll();
	public FichaMedica save(FichaMedica fichaMedica);
	public FichaMedica findById(Long id);
	public void delete(Long id);
	
	public FichaMedica findByPaciente(Paciente paciente);
	

}
