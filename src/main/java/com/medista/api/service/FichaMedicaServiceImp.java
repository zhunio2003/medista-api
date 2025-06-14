package com.medista.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.medista.api.repository.IFichaMedicaDao;
import com.medista.api.entity.FichaMedica;
import com.medista.api.entity.Paciente;
import com.medista.api.service.interfaces.IFichaMedicaService;

@Service
public class FichaMedicaServiceImp implements IFichaMedicaService{
	
	@Autowired
	private IFichaMedicaDao fichaMedicaDao;

	@Override
	@Transactional(readOnly = true)
	public List<FichaMedica> findAll() {
		
		return (List<FichaMedica>) fichaMedicaDao.findAll();
	}

	@Override
	@Transactional
	public FichaMedica save(FichaMedica fichaMedica) {

		return fichaMedicaDao.save(fichaMedica);
	}

	@Override
	@Transactional(readOnly = true)
	public FichaMedica findById(Long id) {
		// TODO Auto-generated method stub
		return fichaMedicaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		fichaMedicaDao.deleteById(id);
		
	}

	@Override
	public FichaMedica findByPaciente(Paciente paciente) {
		return fichaMedicaDao.findByPaciente(paciente);
	}
	

}
