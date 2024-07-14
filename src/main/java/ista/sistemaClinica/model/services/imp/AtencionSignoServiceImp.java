package ista.sistemaClinica.model.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ista.sistemaClinica.model.dao.IAtencionSignoDao;
import ista.sistemaClinica.model.entity.AtencionSigno;
import ista.sistemaClinica.model.services.IAtencionSignoService;

@Service
public class AtencionSignoServiceImp implements IAtencionSignoService{
	
	
	@Autowired
	private IAtencionSignoDao atencionSignoDao;

	@Override
	@Transactional(readOnly = true)
	public List<AtencionSigno> findAll() {
		
		return (List<AtencionSigno>) atencionSignoDao.findAll();
	}

	@Override
	@Transactional
	public AtencionSigno save(AtencionSigno atencionSigno) {
		// TODO Auto-generated method stub
		return atencionSignoDao.save(atencionSigno);
	}

	@Override
	@Transactional(readOnly = true)
	public AtencionSigno findById(Long id) {
		// TODO Auto-generated method stub
		return atencionSignoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		atencionSignoDao.deleteById(id);
		
	}


}
