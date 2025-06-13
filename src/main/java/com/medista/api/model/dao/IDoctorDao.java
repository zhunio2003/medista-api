package com.medista.api.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.medista.api.model.entity.Doctor;

public interface IDoctorDao extends JpaRepository<Doctor, Long> {
	Doctor findByCedulaDoc(String cedulaDoc);
}
