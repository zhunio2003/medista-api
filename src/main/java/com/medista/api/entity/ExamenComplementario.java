package com.medista.api.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.mongodb.core.mapping.Field;
import lombok.Data;

@Data
public class ExamenComplementario {
    private String nombre;
    private String resultado;
    private boolean aplica;

    // Para MongoDB, usamos @Field y almacenamos como byte[]
    @Field("archivo_pdf")
    @JsonIgnore
    private byte[] archivoPdf;

    // Campos adicionales útiles para el manejo de archivos
    @Field("nombre_archivo")
    private String nombreArchivo;

    @Field("tipo_contenido")
    private String tipoContenido; // application/pdf

    @Field("tamaño_archivo")
    private Long tamañoArchivo;
}