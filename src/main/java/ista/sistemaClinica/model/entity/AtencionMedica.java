package ista.sistemaClinica.model.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "atencion_medica")
public class AtencionMedica implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_ate;

    private String motivo_ate;
    private String enfermedad_actual_ate;
    private String tratamiento_ate;

    @ManyToOne
    @JoinColumn(name = "id_pac")
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "id_doctor")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "id_diagnostico")
    private Diagnostico diagnostico;

    private static final long serialVersionUID = 1L;

    // Getters y Setters
}
