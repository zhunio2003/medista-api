package com.medista.api.model.dao;

import org.springframework.data.repository.CrudRepository;
import com.medista.api.model.entity.EmergenciaObstetrica;
import com.medista.api.model.entity.FichaMedica;

public interface IEmergenciaObstetricaDao extends CrudRepository<EmergenciaObstetrica, Long>{
	EmergenciaObstetrica findByfichaMedica(FichaMedica fichaMedica);
}
