package com.medista.api.service.interfaces;

import java.util.List;

import com.medista.api.entity.Diagnostico;

public interface IDiagnosticoService {
	public List<Diagnostico> findAll();
	public Diagnostico save(Diagnostico diagnostico);
	public Diagnostico findById(Long id);
	public void delete(Long id);

}
