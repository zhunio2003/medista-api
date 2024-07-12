package ista.sistemaClinica.model.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "referencia_medica")
public class ReferenciaMedica implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_ref;

    private String codInstitucion_ref;
    private String institucion_ref;
    private String servicio_ref;
    private String establecimiento_ref;
    private String especialidad_ref;
    private String fecha_ref;
    private String motivoReferencia_ref;
    private String resumen_ref;
    private String hallazgos_ref;
    private String diagnostico_ref;

    @ManyToOne
    @JoinColumn(name = "id_AtencionMedica")
    private AtencionMedica atencionMedica;

    private static final long serialVersionUID = 1L;

    // Getters y Setters
}
