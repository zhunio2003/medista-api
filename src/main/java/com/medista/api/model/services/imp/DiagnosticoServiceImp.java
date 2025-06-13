package com.medista.api.model.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.medista.api.model.dao.IDiagnosticoDao;
import com.medista.api.model.entity.Diagnostico;
import com.medista.api.model.services.IDiagnosticoService;

@Service
public class DiagnosticoServiceImp implements IDiagnosticoService{
	
	@Autowired
	private IDiagnosticoDao diagnosticoDao;

	@Override
	@Transactional(readOnly = true)
	public List<Diagnostico> findAll() {
		
		return (List<Diagnostico>) diagnosticoDao.findAll();
	}

	@Override
	@Transactional
	public Diagnostico save(Diagnostico diagnostico) {
		// TODO Auto-generated method stub
		return diagnosticoDao.save(diagnostico);
	}

	@Override
	@Transactional(readOnly = true)
	public Diagnostico findById(Long id) {
		// TODO Auto-generated method stub
		return diagnosticoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		diagnosticoDao.deleteById(id);
		
	}


}
