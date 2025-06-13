package com.medista.api.model.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "antecedente_familiar")
public class AntecedenteFamiliar implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idAnt;

    private Boolean alergiaAnt;
    private Boolean clinicoAnt;
    private Boolean ginecologoAnt;
    private Boolean traumatologicoAnt;
    private Boolean quirurgicoAnt;
    private Boolean farmacologicoAnt;
    
    private String descripcionAlergiaAnt;  
    private String descripcionClinicoAnt;  
    private String descripcionGinecologoAnt; 
    private String descripcionTraumatologicoAnt;
    private String descripcionQuirurgicoAnt; 
    private String descripcionFarmacologicoAnt; 
    
    
    private static final long serialVersionUID = 1L;


	public Long getIdAnt() {
		return idAnt;
	}


	public void setIdAnt(Long idAnt) {
		this.idAnt = idAnt;
	}


	public Boolean getAlergiaAnt() {
		return alergiaAnt;
	}


	public void setAlergiaAnt(Boolean alergiaAnt) {
		this.alergiaAnt = alergiaAnt;
	}


	public Boolean getClinicoAnt() {
		return clinicoAnt;
	}


	public void setClinicoAnt(Boolean clinicoAnt) {
		this.clinicoAnt = clinicoAnt;
	}


	public Boolean getGinecologoAnt() {
		return ginecologoAnt;
	}


	public void setGinecologoAnt(Boolean ginecologoAnt) {
		this.ginecologoAnt = ginecologoAnt;
	}


	public Boolean getTraumatologicoAnt() {
		return traumatologicoAnt;
	}


	public void setTraumatologicoAnt(Boolean traumatologicoAnt) {
		this.traumatologicoAnt = traumatologicoAnt;
	}


	public Boolean getQuirurgicoAnt() {
		return quirurgicoAnt;
	}


	public void setQuirurgicoAnt(Boolean quirurgicoAnt) {
		this.quirurgicoAnt = quirurgicoAnt;
	}


	public Boolean getFarmacologicoAnt() {
		return farmacologicoAnt;
	}


	public void setFarmacologicoAnt(Boolean farmacologicoAnt) {
		this.farmacologicoAnt = farmacologicoAnt;
	}


	public String getDescripcionAlergiaAnt() {
		return descripcionAlergiaAnt;
	}


	public void setDescripcionAlergiaAnt(String descripcionAlergiaAnt) {
		this.descripcionAlergiaAnt = descripcionAlergiaAnt;
	}


	public String getDescripcionClinicoAnt() {
		return descripcionClinicoAnt;
	}


	public void setDescripcionClinicoAnt(String descripcionClinicoAnt) {
		this.descripcionClinicoAnt = descripcionClinicoAnt;
	}


	public String getDescripcionGinecologoAnt() {
		return descripcionGinecologoAnt;
	}


	public void setDescripcionGinecologoAnt(String descripcionGinecologoAnt) {
		this.descripcionGinecologoAnt = descripcionGinecologoAnt;
	}


	public String getDescripcionTraumatologicoAnt() {
		return descripcionTraumatologicoAnt;
	}


	public void setDescripcionTraumatologicoAnt(String descripcionTraumatologicoAnt) {
		this.descripcionTraumatologicoAnt = descripcionTraumatologicoAnt;
	}


	public String getDescripcionQuirurgicoAnt() {
		return descripcionQuirurgicoAnt;
	}


	public void setDescripcionQuirurgicoAnt(String descripcionQuirurgicoAnt) {
		this.descripcionQuirurgicoAnt = descripcionQuirurgicoAnt;
	}


	public String getDescripcionFarmacologicoAnt() {
		return descripcionFarmacologicoAnt;
	}


	public void setDescripcionFarmacologicoAnt(String descripcionFarmacologicoAnt) {
		this.descripcionFarmacologicoAnt = descripcionFarmacologicoAnt;
	}

}
