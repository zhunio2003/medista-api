package com.medista.api.repository;

import org.springframework.data.repository.CrudRepository;
import com.medista.api.entity.EmergenciaObstetrica;
import com.medista.api.entity.FichaMedica;

public interface IEmergenciaObstetricaDao extends CrudRepository<EmergenciaObstetrica, Long>{
	EmergenciaObstetrica findByfichaMedica(FichaMedica fichaMedica);
}
