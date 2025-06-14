package com.medista.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.medista.api.repository.IAntecedenteFamiliarDao;
import com.medista.api.entity.AntecedenteFamiliar;
import com.medista.api.service.interfaces.IAntecedenteFamiliarService;


@Service
public class AntecedenteFamiliarServiceImp implements IAntecedenteFamiliarService{
	
	@Autowired
	private IAntecedenteFamiliarDao antecedenteFamiliarDao;

	@Override
	@Transactional(readOnly = true)
	public List<AntecedenteFamiliar> findAll() {
		
		
		return (List<AntecedenteFamiliar>) antecedenteFamiliarDao.findAll();
	}

	@Override
	@Transactional
	public AntecedenteFamiliar save(AntecedenteFamiliar antecedenteFamiliar) {
		// TODO Auto-generated method stub
		return antecedenteFamiliarDao.save(antecedenteFamiliar);
	}

	@Override
	@Transactional(readOnly = true)
	public AntecedenteFamiliar findById(Long id) {
		// TODO Auto-generated method stub
		return antecedenteFamiliarDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		antecedenteFamiliarDao.deleteById(id);
		
	}


}
