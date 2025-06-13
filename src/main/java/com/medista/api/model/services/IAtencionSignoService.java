package com.medista.api.model.services;

import java.util.List;

import com.medista.api.model.entity.AtencionSigno;
	
public interface IAtencionSignoService {
	public List<AtencionSigno> findAll();
	public AtencionSigno save(AtencionSigno atencionSigno);
	public AtencionSigno findById(Long id);
	public void delete(Long id);

}
