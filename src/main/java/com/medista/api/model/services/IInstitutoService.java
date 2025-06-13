package com.medista.api.model.services;

import java.util.List;

import com.medista.api.model.entity.Instituto;

public interface IInstitutoService {
	public List<Instituto> findAll();
	public Instituto save(Instituto instituto);
	public Instituto findById(Long id);
	public void delete(Long id);
	
}
