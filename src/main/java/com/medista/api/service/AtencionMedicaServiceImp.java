package com.medista.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.medista.api.repository.IAtencionMedicaDao;
import com.medista.api.entity.AtencionMedica;
import com.medista.api.service.interfaces.IAtencionMedicaService;


@Service
public  class AtencionMedicaServiceImp implements IAtencionMedicaService{
	
	@Autowired
	private IAtencionMedicaDao atencionMedicaDao;

	@Override
	@Transactional(readOnly = true)
	public List<AtencionMedica> findAll() {
		
		return (List<AtencionMedica>) atencionMedicaDao.findAll();
	}

	@Override
	@Transactional
	public AtencionMedica save(AtencionMedica atencionMedica) {
		// TODO Auto-generated method stub
		return atencionMedicaDao.save(atencionMedica);
	}

	@Override
	@Transactional(readOnly = true)
	public AtencionMedica findById(String id) {
		// TODO Auto-generated method stub
		return atencionMedicaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(String id) {
		atencionMedicaDao.deleteById(id);
		
	}


}
