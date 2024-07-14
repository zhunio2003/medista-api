package ista.sistemaClinica.model.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ista.sistemaClinica.model.dao.IInstitutoDao;
import ista.sistemaClinica.model.entity.Instituto;
import ista.sistemaClinica.model.services.IInstitutoService;

@Service
public class InstitutoServiceImp implements IInstitutoService {
	
	@Autowired
	private IInstitutoDao institutoDao;

	@Override
	@Transactional(readOnly = true)
	public List<Instituto> findAll() {
		
		return (List<Instituto>) institutoDao.findAll();
	}

	@Override
	@Transactional
	public Instituto save(Instituto instituto) {
		// TODO Auto-generated method stub
		return institutoDao.save(instituto);
	}

	@Override
	@Transactional(readOnly = true)
	public Instituto findById(Long id) {
		// TODO Auto-generated method stub
		return institutoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		institutoDao.deleteById(id);
		
	}


}
