package ista.sistemaClinica.model.dao;

import org.springframework.data.repository.CrudRepository;

import ista.sistemaClinica.model.entity.Doctor;

public interface IDoctorDao extends CrudRepository<Doctor, Long> {

}
