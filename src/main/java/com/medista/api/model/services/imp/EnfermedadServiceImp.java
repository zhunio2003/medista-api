package com.medista.api.model.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.medista.api.model.dao.IEnfermedadDao;
import com.medista.api.model.entity.Enfermedad;
import com.medista.api.model.services.IEnfermedadService;

@Service
public class EnfermedadServiceImp implements IEnfermedadService{
	
	@Autowired
	private IEnfermedadDao enfermedadDao;

	@Override
	@Transactional(readOnly = true)
	public List<Enfermedad> findAll() {
		
		return (List<Enfermedad>) enfermedadDao.findAll();
	}

	@Override
	@Transactional
	public Enfermedad save(Enfermedad enfermedad) {
		// TODO Auto-generated method stub
		return enfermedadDao.save(enfermedad);
	}
	@Override
	@Transactional(readOnly = true)
	public Enfermedad findById(Long id) {
		// TODO Auto-generated method stub
		return enfermedadDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		enfermedadDao.deleteById(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Enfermedad findByCodEnf(String codigoEnf) {
		return enfermedadDao.findBycodigoEnf(codigoEnf);
	}

}
