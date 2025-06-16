package com.medista.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import com.medista.api.entity.ExamenComplementario;

public interface IExamenComplementarioDao extends MongoRepository<ExamenComplementario, Long> {

}
