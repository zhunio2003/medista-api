package com.medista.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.medista.api.repository.IDiscapacidadDao;
import com.medista.api.entity.Discapacidad;
import com.medista.api.service.interfaces.IDiscapacidadService;


@Service
public class DiscapacidadServiceImp implements IDiscapacidadService{
	
	@Autowired
	private IDiscapacidadDao discapacidadDao;

	@Override
	@Transactional(readOnly = true)
	public List<Discapacidad> findAll() {
		
		return (List<Discapacidad>) discapacidadDao.findAll();
	}

	@Override
	@Transactional
	public Discapacidad save(Discapacidad discapacidad) {
		// TODO Auto-generated method stub
		return discapacidadDao.save(discapacidad);
	}

	@Override
	@Transactional(readOnly = true)
	public Discapacidad findById(Long id) {
		// TODO Auto-generated method stub
		return discapacidadDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		discapacidadDao.deleteById(id);
		
	}


}
