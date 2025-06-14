package com.medista.api.service.interfaces;

import java.util.List;

import com.medista.api.entity.FichaMedica;
import com.medista.api.entity.Paciente;

public interface IFichaMedicaService {
	public List<FichaMedica> findAll();
	public FichaMedica save(FichaMedica fichaMedica);
	public FichaMedica findById(Long id);
	public void delete(Long id);
	
	public FichaMedica findByPaciente(Paciente paciente);
	

}
