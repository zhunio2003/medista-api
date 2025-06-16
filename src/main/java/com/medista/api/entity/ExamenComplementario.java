package com.medista.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import lombok.Data;

@Data
public class ExamenComplementario {
    private String nombre;
    private String resultado;
    private boolean aplica;

    @Lob
    private byte[] archivoPdf;

}
