package com.medista.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.medista.api.repository.IDoctorDao;
import com.medista.api.entity.Doctor;
import com.medista.api.service.interfaces.IDoctorService;


@Service
public class DoctorServiceImp implements IDoctorService{
	
	@Autowired
	private IDoctorDao doctorDao;

	@Override
	@Transactional(readOnly = true)
	public List<Doctor> findAll() {
		
		return (List<Doctor>) doctorDao.findAll();
	}

	@Override
	@Transactional
	public Doctor save(Doctor doctor) {
		// TODO Auto-generated method stub
		return doctorDao.save(doctor);
	}

	@Override
	@Transactional(readOnly = true)
	public Doctor findById(Long id) {
		// TODO Auto-generated method stub
		return doctorDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		doctorDao.deleteById(id);
		
	}
	
	@Override
	@Transactional(readOnly = true)
	public Doctor findByCedDoctor(String cedulaDoc) {
		return doctorDao.findByCedula(cedulaDoc);
	}

	@Override
	public Doctor findByCedulaAndPassword(String cedula, String password) {
		return doctorDao.findByCedulaAndPassword(cedula, password);
	}


}
