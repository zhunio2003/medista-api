package com.medista.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medista.api.entity.Doctor;

public interface IDoctorDao extends JpaRepository<Doctor, Long> {
	Doctor findByCedula(String cedulaDoc);
	Doctor findByCedulaAndPassword(String cedula, String password);
}
