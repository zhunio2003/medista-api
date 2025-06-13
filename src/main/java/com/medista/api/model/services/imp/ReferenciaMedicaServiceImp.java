package com.medista.api.model.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import com.medista.api.model.dao.IReferenciaMedicaDao;
import com.medista.api.model.entity.ReferenciaMedica;
import com.medista.api.model.services.IReferenciaMedicaService;

@Service
public class ReferenciaMedicaServiceImp implements IReferenciaMedicaService {
	
	@Autowired
	private IReferenciaMedicaDao referenciaMedicaeDao;

	@Override
	@Transactional(readOnly = true)
	public List<ReferenciaMedica> findAll() {
		
		return (List<ReferenciaMedica>) referenciaMedicaeDao.findAll();
	}
	
	@Override
	@Transactional
	public ReferenciaMedica save(ReferenciaMedica referenciaMedica) {
        try {
            return referenciaMedicaeDao.save(referenciaMedica);
        } catch (DataIntegrityViolationException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "La atención médica ya está asociada a otra referencia médica.", e);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error al guardar la referencia médica.", e);
        }
    }

	@Override
	@Transactional(readOnly = true)
	public ReferenciaMedica findById(Long id) {
		// TODO Auto-generated method stub
		return referenciaMedicaeDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		referenciaMedicaeDao.deleteById(id);
		
	}
	


}
