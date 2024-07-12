package ista.sistemaClinica.model.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "doctor")
public class Doctor implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_doctor;

    @Column(unique = true)
    private String cedula_doc;

    private String nombre_doc;
    private String apellido_doc;
    private String telefono_doc;
    private String direccion_doc;
    private String especialidad_doc;
    private String codgo_MSP;

    private static final long serialVersionUID = 1L;

    // Getters y Setters
}
