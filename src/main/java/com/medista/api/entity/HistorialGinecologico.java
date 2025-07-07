package com.medista.api.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Data
@Table(name = "historial_ginecologico")
public class HistorialGinecologico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Datos históricos estáticos
    private Integer menarca; // Edad de primera menstruación

    @Column(name = "ritmo_menstrual")
    private String ritmoMenstrual; // "28/4" días

    private Integer ciclos; // Regularidad de ciclos

    @Column(name = "ivsa")
    private Integer ivsa; // Edad inicio vida sexual activa

    @Column(name = "numero_parejas_sexuales")
    private Integer numeroParejaSexuales;

    // G.A.P.C - Historial reproductivo
    private Integer gestas;   // Total embarazos
    private Integer abortos;  // Total abortos
    private Integer partos;   // Total partos vaginales
    private Integer cesareas; // Total cesáreas

    // Síntomas ginecológicos
    private Boolean dismenorrea; // Dolor menstrual
    private Boolean mastodinia;  // Dolor en senos

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_actualizacion")
    private Date fechaActualizacion; // Para saber cuándo se actualizó
}