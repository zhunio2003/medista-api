package com.medista.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.medista.api.repository.ISignoVitalDao;
import com.medista.api.entity.SignoVital;
import com.medista.api.service.interfaces.ISignoVitalService;

@Service
public class SignoVitalServiceImp implements ISignoVitalService{
	
	@Autowired
	private ISignoVitalDao signoVitalDao;

	@Override
	@Transactional(readOnly = true)
	public List<SignoVital> findAll() {
		
		return (List<SignoVital>) signoVitalDao.findAll();
	}

	@Override
	@Transactional
	public SignoVital save(SignoVital signoVital) {
		// TODO Auto-generated method stub
		return signoVitalDao.save(signoVital);
	}

	@Override
	@Transactional(readOnly = true)
	public SignoVital findById(Long id) {
		// TODO Auto-generated method stub
		return signoVitalDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		signoVitalDao.deleteById(id);
		
	}


}
