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
        return examenComplementarioDao.findAll();
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

    // Guarda un archivo PDF en el examen con ID dado
    @Override
    @Transactional
    public void savePdf(Long id, byte[] archivoPdf) {
        ExamenComplementario examen = examenComplementarioDao.findById(id).orElse(null);
        if (examen != null && archivoPdf != null) {
            examen.setArchivoPdf(archivoPdf);
            examenComplementarioDao.save(examen);
        }
    }

    // Devuelve el PDF del examen
    @Override
    @Transactional(readOnly = true)
    public byte[] getPdf(Long id) {
        ExamenComplementario examen = examenComplementarioDao.findById(id).orElse(null);
        return (examen != null) ? examen.getArchivoPdf() : null;
    }
}
