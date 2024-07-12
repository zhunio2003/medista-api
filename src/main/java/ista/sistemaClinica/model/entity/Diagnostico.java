package ista.sistemaClinica.model.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "diagnostico")
public class Diagnostico implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_dia;

    private String nombre_dia;
    private Boolean presuntivo_dia;
    private Boolean definitivo_dia;

    private static final long serialVersionUID = 1L;

    // Getters y Setters
}
