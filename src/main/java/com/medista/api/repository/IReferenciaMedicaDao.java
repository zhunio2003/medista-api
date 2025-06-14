package com.medista.api.repository;

import org.springframework.data.repository.CrudRepository;
import com.medista.api.entity.ReferenciaMedica;

public interface IReferenciaMedicaDao extends CrudRepository<ReferenciaMedica, Long>{

}
