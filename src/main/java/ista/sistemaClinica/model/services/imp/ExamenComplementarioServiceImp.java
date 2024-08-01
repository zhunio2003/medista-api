package ista.sistemaClinica.model.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ista.sistemaClinica.model.dao.IExamenComplementarioDao;
import ista.sistemaClinica.model.entity.ExamenComplementario;
import ista.sistemaClinica.model.services.IExamenComplementarioService;

@Service
public class ExamenComplementarioServiceImp implements IExamenComplementarioService {
    
    @Autowired
    private IExamenComplementarioDao examenComplementarioDao;

    @Override
    @Transactional(readOnly = true)
    public List<ExamenComplementario> findAll() {
        return (List<ExamenComplementario>) examenComplementarioDao.findAll();
    }

    @Override
    @Transactional
    public ExamenComplementario save(ExamenComplementario examenComplementario) {
        return examenComplementarioDao.save(examenComplementario);
    }

    @Override
    @Transactional(readOnly = true)
    public ExamenComplementario findById(Long id) {
        return examenComplementarioDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        examenComplementarioDao.deleteById(id);
    }

    @Override
    @Transactional
    public void savePdf(Long id, byte[] archivoPdf) {
        ExamenComplementario examen = findById(id);
        if (examen != null) {
            examen.setArchivoPdf(archivoPdf);
            save(examen);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public byte[] getPdf(Long id) {
        ExamenComplementario examen = findById(id);
        return examen != null ? examen.getArchivoPdf() : null;
    }
}
