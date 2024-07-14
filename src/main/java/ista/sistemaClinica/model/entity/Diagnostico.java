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

	public Boolean getPresuntivo_dia() {
		return presuntivo_dia;
	}

	public void setPresuntivo_dia(Boolean presuntivo_dia) {
		this.presuntivo_dia = presuntivo_dia;
	}

	public Boolean getDefinitivo_dia() {
		return definitivo_dia;
	}

	public void setDefinitivo_dia(Boolean definitivo_dia) {
		this.definitivo_dia = definitivo_dia;
	}

    
    
    
}
