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
    private Boolean estado_dia;

    private static final long serialVersionUID = 1L;
    
    // Getters y Setters

	public Long getId_dia() {
		return id_dia;
	}

	public void setId_dia(Long id_dia) {
		this.id_dia = id_dia;
	}

	public String getNombre_dia() {
		return nombre_dia;
	}

	public void setNombre_dia(String nombre_dia) {
		this.nombre_dia = nombre_dia;
	}

	public Boolean getEstado_dia() {
		return estado_dia;
	}

	public void setEstado_dia(Boolean estado_dia) {
		this.estado_dia = estado_dia;
	}

	
    
}
