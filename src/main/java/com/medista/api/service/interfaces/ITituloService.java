package com.medista.api.service.interfaces;

import java.util.List;


import com.medista.api.entity.Titulo;

public interface ITituloService {
	public List<Titulo> findAll();
	public Titulo save(Titulo titulo);
	public Titulo findById(Long id);
	public void delete(Long id);
	


}
