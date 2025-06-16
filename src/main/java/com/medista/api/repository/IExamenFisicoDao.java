package com.medista.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import com.medista.api.entity.ExamenFisico;

public interface IExamenFisicoDao extends MongoRepository<ExamenFisico, Long> {

}
