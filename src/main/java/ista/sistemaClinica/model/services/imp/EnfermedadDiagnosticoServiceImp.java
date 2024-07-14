package ista.sistemaClinica.model.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ista.sistemaClinica.model.dao.IEnfermedadDiagnosticoDao;
import ista.sistemaClinica.model.entity.EnfermedadDiagnostico;
import ista.sistemaClinica.model.services.IEnfermedadDiagnosticoService;

@Service
public class EnfermedadDiagnosticoServiceImp implements IEnfermedadDiagnosticoService{
	
	@Autowired
	private IEnfermedadDiagnosticoDao enfermedadDiagnosticoDao;

	@Override
	@Transactional(readOnly = true)
	public List<EnfermedadDiagnostico> findAll() {
		
		return (List<EnfermedadDiagnostico>) enfermedadDiagnosticoDao.findAll();
	}

	@Override
	@Transactional
	public EnfermedadDiagnostico save(EnfermedadDiagnostico enfermedadDiagnostico) {
		// TODO Auto-generated method stub
		return enfermedadDiagnosticoDao.save(enfermedadDiagnostico);
	}

	@Override
	@Transactional(readOnly = true)
	public EnfermedadDiagnostico findById(Long id) {
		// TODO Auto-generated method stub
		return enfermedadDiagnosticoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		enfermedadDiagnosticoDao.deleteById(id);
		
	}


}
