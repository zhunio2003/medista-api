package ista.sistemaClinica.model.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ista.sistemaClinica.model.dao.IFichaMedicaDao;
import ista.sistemaClinica.model.entity.Doctor;
import ista.sistemaClinica.model.entity.FichaMedica;
import ista.sistemaClinica.model.services.IFichaMedicaService;

@Service
public class FichaMedicaServiceImp implements IFichaMedicaService{
	
	@Autowired
	private IFichaMedicaDao fichaMedicaDao;

	@Override
	@Transactional(readOnly = true)
	public List<FichaMedica> findAll() {
		
		return (List<FichaMedica>) fichaMedicaDao.findAll();
	}

	@Override
	@Transactional
	public FichaMedica save(FichaMedica fichaMedica) {

		return fichaMedicaDao.save(fichaMedica);
	}

	@Override
	@Transactional(readOnly = true)
	public FichaMedica findById(Long id) {
		// TODO Auto-generated method stub
		return fichaMedicaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		fichaMedicaDao.deleteById(id);
		
	}
	

}
