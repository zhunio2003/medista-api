package ista.sistemaClinica.model.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "signos_vitales")
public class SignosVitales implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_sig;

    private String nombre_sig;
    private String unidad_sig;

    @ManyToOne
    @JoinColumn(name = "id_AtencionMedica")
    private AtencionMedica atencionMedica;

    private static final long serialVersionUID = 1L;

    // Getters y Setters
}
