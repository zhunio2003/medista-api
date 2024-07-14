package ista.sistemaClinica.model.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ista.sistemaClinica.model.dao.IAtencionMedicaDao;
import ista.sistemaClinica.model.entity.AtencionMedica;
import ista.sistemaClinica.model.services.IAtencionMedicaService;


@Service
public class AtencionMedicaServiceImp implements IAtencionMedicaService{
	
	@Autowired
	private IAtencionMedicaDao atencionMedicaDao;

	@Override
	@Transactional(readOnly = true)
	public List<AtencionMedica> findAll() {
		
		return (List<AtencionMedica>) atencionMedicaDao.findAll();
	}

	@Override
	@Transactional
	public AtencionMedica save(AtencionMedica atencionMedica) {
		// TODO Auto-generated method stub
		return atencionMedicaDao.save(atencionMedica);
	}

	@Override
	@Transactional(readOnly = true)
	public AtencionMedica findById(Long id) {
		// TODO Auto-generated method stub
		return atencionMedicaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		atencionMedicaDao.deleteById(id);
		
	}


}
