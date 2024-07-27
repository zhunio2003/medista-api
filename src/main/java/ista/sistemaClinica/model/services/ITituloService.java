package ista.sistemaClinica.model.services;

import java.util.List;


import ista.sistemaClinica.model.entity.Titulo;

public interface ITituloService {
	public List<Titulo> findAll();
	public Titulo save(Titulo titulo);
	public Titulo findById(Long id);
	public void delete(Long id);
	
	

}
