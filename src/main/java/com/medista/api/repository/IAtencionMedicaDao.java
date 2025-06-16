package com.medista.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.medista.api.entity.AtencionMedica;

import java.util.List;

public interface IAtencionMedicaDao extends MongoRepository<AtencionMedica, String> {
    List<AtencionMedica> findByFichaMedicaId(Long fichaMedicaId);
}
