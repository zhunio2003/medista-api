package ista.sistemaClinica.model.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "examen_fisico")
public class ExamenFisico implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_exa;

    private String nombre_exa;
    private Double numero_exa;
    private String descripcion_exa;

    @ManyToOne
    @JoinColumn(name = "id_AtencionMedica")
    private AtencionMedica atencionMedica;

    private static final long serialVersionUID = 1L;

    // Getters y Setters
}
