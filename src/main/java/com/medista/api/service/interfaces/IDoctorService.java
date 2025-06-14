package com.medista.api.service.interfaces;

import java.util.List;

import com.medista.api.entity.Doctor;

public interface IDoctorService {
	public List<Doctor> findAll();
	public Doctor save(Doctor doctor);
	public Doctor findById(Long id);
	public void delete(Long id);
	
	// Filtros y busquedas
		public Doctor findByCedDoctor(String cedulaDoc);

}
