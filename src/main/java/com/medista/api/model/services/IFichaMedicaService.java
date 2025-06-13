package com.medista.api.model.services;

import java.util.List;

import com.medista.api.model.entity.FichaMedica;
import com.medista.api.model.entity.Paciente;

public interface IFichaMedicaService {
	public List<FichaMedica> findAll();
	public FichaMedica save(FichaMedica fichaMedica);
	public FichaMedica findById(Long id);
	public void delete(Long id);
	
	public FichaMedica findByPaciente(Paciente paciente);
	

}
