package com.medista.api.service.interfaces;

import java.util.List;

import com.medista.api.entity.ExamenComplementario;

public interface IExamenComplementarioService {
    List<ExamenComplementario> findAll();
    ExamenComplementario save(ExamenComplementario examenComplementario);
    ExamenComplementario findById(Long id);
    void delete(Long id);
    void savePdf(Long id, byte[] archivoPdf);
    byte[] getPdf(Long id);
}
