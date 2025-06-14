package com.medista.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.medista.api.repository.IExamenComplementarioDao;
import com.medista.api.entity.ExamenComplementario;
import com.medista.api.service.interfaces.IExamenComplementarioService;

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
