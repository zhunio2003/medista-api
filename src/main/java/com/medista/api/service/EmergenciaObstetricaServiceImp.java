package com.medista.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.medista.api.repository.IEmergenciaObstetricaDao;
import com.medista.api.entity.EmergenciaObstetrica;
import com.medista.api.entity.FichaMedica;
import com.medista.api.service.interfaces.IEmergenciaObstetricaService;

@Service
public class EmergenciaObstetricaServiceImp implements IEmergenciaObstetricaService{
	
	@Autowired
	private IEmergenciaObstetricaDao emergenciaObstetricaDao;

	@Override
	@Transactional(readOnly = true)
	public List<EmergenciaObstetrica> findAll() {
		
		return (List<EmergenciaObstetrica>) emergenciaObstetricaDao.findAll();
	}

	@Override
	@Transactional
	public EmergenciaObstetrica save(EmergenciaObstetrica emergenciaObstetrica) {
		// TODO Auto-generated method stub
		return emergenciaObstetricaDao.save(emergenciaObstetrica);
	}

	@Override
	@Transactional(readOnly = true)
	public EmergenciaObstetrica findById(Long id) {
		// TODO Auto-generated method stub
		return emergenciaObstetricaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		emergenciaObstetricaDao.deleteById(id);
		
	}

	@Override
	public EmergenciaObstetrica findByFichaMedica(FichaMedica fichaMedica) {
		return emergenciaObstetricaDao.findByfichaMedica(fichaMedica);
	}


}
