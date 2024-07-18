package ista.sistemaClinica.model.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ista.sistemaClinica.model.dao.IDiscapacidadDao;
import ista.sistemaClinica.model.entity.Discapacidad;
import ista.sistemaClinica.model.services.IDiscapacidadService;


@Service
public class DiscapacidadServiceImp implements IDiscapacidadService{
	
	@Autowired
	private IDiscapacidadDao discapacidadDao;

	@Override
	@Transactional(readOnly = true)
	public List<Discapacidad> findAll() {
		
		return (List<Discapacidad>) discapacidadDao.findAll();
	}

	@Override
	@Transactional
	public Discapacidad save(Discapacidad discapacidad) {
		// TODO Auto-generated method stub
		return discapacidadDao.save(discapacidad);
	}

	@Override
	@Transactional(readOnly = true)
	public Discapacidad findById(Long id) {
		// TODO Auto-generated method stub
		return discapacidadDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		discapacidadDao.deleteById(id);
		
	}


}
