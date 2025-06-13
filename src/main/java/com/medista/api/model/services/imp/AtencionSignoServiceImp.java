package com.medista.api.model.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.medista.api.model.dao.IAtencionSignoDao;
import com.medista.api.model.entity.AtencionSigno;
import com.medista.api.model.services.IAtencionSignoService;

@Service
public class AtencionSignoServiceImp implements IAtencionSignoService{
	
	
	@Autowired
	private IAtencionSignoDao atencionSignoDao;

	@Override
	@Transactional(readOnly = true)
	public List<AtencionSigno> findAll() {
		
		return (List<AtencionSigno>) atencionSignoDao.findAll();
	}

	@Override
	@Transactional
	public AtencionSigno save(AtencionSigno atencionSigno) {
		// TODO Auto-generated method stub
		return atencionSignoDao.save(atencionSigno);
	}

	@Override
	@Transactional(readOnly = true)
	public AtencionSigno findById(Long id) {
		// TODO Auto-generated method stub
		return atencionSignoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		atencionSignoDao.deleteById(id);
		
	}


}
