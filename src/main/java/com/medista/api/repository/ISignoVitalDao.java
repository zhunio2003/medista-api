package com.medista.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.medista.api.entity.SignoVital;


public interface ISignoVitalDao extends CrudRepository<SignoVital, Long>{

}
