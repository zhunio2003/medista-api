package ista.sistemaClinica.model.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ista.sistemaClinica.model.dao.IReferenciaMedicaDao;
import ista.sistemaClinica.model.entity.ReferenciaMedica;
import ista.sistemaClinica.model.services.IReferenciaMedicaService;

@Service
public class ReferenciaMedicaServiceImp implements IReferenciaMedicaService {
	
	@Autowired
	private IReferenciaMedicaDao referenciaMedicaeDao;

	@Override
	@Transactional(readOnly = true)
	public List<ReferenciaMedica> findAll() {
		
		return (List<ReferenciaMedica>) referenciaMedicaeDao.findAll();
	}

	@Override
	@Transactional
	public ReferenciaMedica save(ReferenciaMedica referenciaMedica) {
		// TODO Auto-generated method stub
		return referenciaMedicaeDao.save(referenciaMedica);
	}

	@Override
	@Transactional(readOnly = true)
	public ReferenciaMedica findById(Long id) {
		// TODO Auto-generated method stub
		return referenciaMedicaeDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		referenciaMedicaeDao.deleteById(id);
		
	}


}
