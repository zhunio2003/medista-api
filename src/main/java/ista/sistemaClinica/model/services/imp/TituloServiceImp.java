package ista.sistemaClinica.model.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ista.sistemaClinica.model.dao.ITituloDao;
import ista.sistemaClinica.model.entity.Titulo;
import ista.sistemaClinica.model.services.ITituloService;

@Service
public class TituloServiceImp implements ITituloService {
	
	@Autowired
	private ITituloDao tituloDao;

	@Override
	@Transactional(readOnly = true)
	public List<Titulo> findAll() {
		
		return (List<Titulo>) tituloDao.findAll();
	}

	@Override
	@Transactional
	public Titulo save(Titulo titulo) {
		// TODO Auto-generated method stub
		return tituloDao.save(titulo);
	}

	@Override
	@Transactional(readOnly = true)
	public Titulo findById(Long id) {
		// TODO Auto-generated method stub
		return tituloDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		tituloDao.deleteById(id);
		
	}




}
