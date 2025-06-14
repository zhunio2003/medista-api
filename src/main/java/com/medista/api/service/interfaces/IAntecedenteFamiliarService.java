package com.medista.api.service.interfaces;

import java.util.List;

import com.medista.api.entity.AntecedenteFamiliar;

public interface IAntecedenteFamiliarService {
	public List<AntecedenteFamiliar> findAll();
	public AntecedenteFamiliar save(AntecedenteFamiliar antecedenteFamiliar);
	public AntecedenteFamiliar findById(Long id);
	public void delete(Long id);

}
