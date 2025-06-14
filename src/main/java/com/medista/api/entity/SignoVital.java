package com.medista.api.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "signo_vital")
public class SignoVital implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idSig;

    private String nombreSig;
    private String unidadSig;


    private static final long serialVersionUID = 1L;


	public Long getIdSig() {
		return idSig;
	}


	public void setIdSig(Long idSig) {
		this.idSig = idSig;
	}


	public String getNombreSig() {
		return nombreSig;
	}


	public void setNombreSig(String nombreSig) {
		this.nombreSig = nombreSig;
	}


	public String getUnidadSig() {
		return unidadSig;
	}


	public void setUnidadSig(String unidadSig) {
		this.unidadSig = unidadSig;
	}
    
}
