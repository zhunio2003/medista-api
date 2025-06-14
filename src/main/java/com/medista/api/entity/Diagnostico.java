package com.medista.api.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

@Entity
@Table(name = "diagnostico")
public class Diagnostico implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_dia;

    @OneToOne()
    @JoinColumn(name = "fk_id_enfermedad")
    private Enfermedad enfermedad;
    
    @ManyToOne()
    @JoinColumn(name = "fk_id_referencia")
    @JsonBackReference // Indica que esta es la parte de regreso de la relación bidireccional
    private ReferenciaMedica referencia;
    
    private String diagnostico_dia;
    private String codigo_dia;
    private boolean estado_dia;
    
    private static final long serialVersionUID = 1L;

	public Long getId_dia() {
		return id_dia;
	}

	public void setId_dia(Long id_dia) {
		this.id_dia = id_dia;
	}

	public Enfermedad getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(Enfermedad enfermedad) {
		this.enfermedad = enfermedad;
	}

	public ReferenciaMedica getReferencia() {
		return referencia;
	}

	public void setReferencia(ReferenciaMedica referencia) {
		this.referencia = referencia;
	}

	public String getDiagnostico_dia() {
		return diagnostico_dia;
	}

	public void setDiagnostico_dia(String diagnostico_dia) {
		this.diagnostico_dia = diagnostico_dia;
	}

	public String getCodigo_dia() {
		return codigo_dia;
	}

	public void setCodigo_dia(String codigo_dia) {
		this.codigo_dia = codigo_dia;
	}

	public boolean isEstado_dia() {
		return estado_dia;
	}

	public void setEstado_dia(boolean estado_dia) {
		this.estado_dia = estado_dia;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	

}
