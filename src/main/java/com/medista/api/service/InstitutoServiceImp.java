package com.medista.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.medista.api.repository.IInstitutoDao;
import com.medista.api.entity.Instituto;
import com.medista.api.service.interfaces.IInstitutoService;

@Service
public class InstitutoServiceImp implements IInstitutoService {
	
	@Autowired
	private IInstitutoDao institutoDao;

	@Override
	@Transactional(readOnly = true)
	public List<Instituto> findAll() {
		
		return (List<Instituto>) institutoDao.findAll();
	}

	@Override
	@Transactional
	public Instituto save(Instituto instituto) {
		// TODO Auto-generated method stub
		return institutoDao.save(instituto);
	}

	@Override
	@Transactional(readOnly = true)
	public Instituto findById(Long id) {
		// TODO Auto-generated method stub
		return institutoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		institutoDao.deleteById(id);
		
	}



}
