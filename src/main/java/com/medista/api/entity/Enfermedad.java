package com.medista.api.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "enfermedad")
public class Enfermedad implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idEnf;
    
    @Column(unique = true)
    private String codigoEnf;

    private String nombreEnf;
    private String tipoEnf;
    private String descripcionEnf;
    private String sintomasEnf;
    
    
    
    // Getters y Setters
    private static final long serialVersionUID = 1L;



	public Long getIdEnf() {
		return idEnf;
	}



	public void setIdEnf(Long idEnf) {
		this.idEnf = idEnf;
	}



	public String getCodigoEnf() {
		return codigoEnf;
	}



	public void setCodigoEnf(String codigoEnf) {
		this.codigoEnf = codigoEnf;
	}



	public String getNombreEnf() {
		return nombreEnf;
	}



	public void setNombreEnf(String nombreEnf) {
		this.nombreEnf = nombreEnf;
	}



	public String getTipoEnf() {
		return tipoEnf;
	}



	public void setTipoEnf(String tipoEnf) {
		this.tipoEnf = tipoEnf;
	}



	public String getDescripcionEnf() {
		return descripcionEnf;
	}



	public void setDescripcionEnf(String descripcionEnf) {
		this.descripcionEnf = descripcionEnf;
	}



	public String getSintomasEnf() {
		return sintomasEnf;
	}



	public void setSintomasEnf(String sintomasEnf) {
		this.sintomasEnf = sintomasEnf;
	}

	
    
    
}
