package ista.sistemaClinica.model.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "atencion_signos")
public class AtencionSignos implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_ats;

    private Double valor_ats;

    @ManyToOne
    @JoinColumn(name = "id_AtencionMedica")
    private AtencionMedica atencion_medica_ats;

    @ManyToOne
    @JoinColumn(name = "id_signos_vitales")
    private SignosVitales signos_vitales_ats;

    private static final long serialVersionUID = 1L;

    // Getters y Setters
}
