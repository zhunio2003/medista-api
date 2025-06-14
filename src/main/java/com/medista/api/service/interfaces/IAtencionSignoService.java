package com.medista.api.service.interfaces;

import java.util.List;

import com.medista.api.entity.AtencionSigno;
	
public interface IAtencionSignoService {
	public List<AtencionSigno> findAll();
	public AtencionSigno save(AtencionSigno atencionSigno);
	public AtencionSigno findById(Long id);
	public void delete(Long id);

}
