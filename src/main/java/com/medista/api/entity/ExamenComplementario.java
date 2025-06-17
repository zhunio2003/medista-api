package com.medista.api.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import lombok.Data;

@Data
public class ExamenComplementario {
    private String nombre;
    private String resultado;
    private boolean aplica;

    @Lob
    @JsonIgnore
    private byte[] archivoPdf;

}
