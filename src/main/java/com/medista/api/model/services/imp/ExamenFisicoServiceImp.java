package com.medista.api.model.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.medista.api.model.dao.IExamenFisicoDao;
import com.medista.api.model.entity.ExamenFisico;
import com.medista.api.model.services.IExamenFisicoService;

@Service
public class ExamenFisicoServiceImp implements IExamenFisicoService{
	
	@Autowired
	private IExamenFisicoDao examenFisicoDao;

	@Override
	@Transactional(readOnly = true)
	public List<ExamenFisico> findAll() {
		
		return (List<ExamenFisico>) examenFisicoDao.findAll();
	}

	@Override
	@Transactional
	public ExamenFisico save(ExamenFisico examenFisico) {
		// TODO Auto-generated method stub
		return examenFisicoDao.save(examenFisico);
	}

	@Override
	@Transactional(readOnly = true)
	public ExamenFisico findById(Long id) {
		// TODO Auto-generated method stub
		return examenFisicoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		examenFisicoDao.deleteById(id);
		
	}


}
