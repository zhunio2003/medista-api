package com.medista.api.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Entity
@Table(name = "paciente")
public class Paciente implements Serializable {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long idPac;

	 @Column(unique = true)
	 private String cedulaPac;    

	 @Temporal(TemporalType.DATE)
	 private Date fechaNacimientoPac;

	 private String nombrePac;
	 private String apellidoPac;
	 private String lugarPac;
	 private String paisPac;
	 private String direccionPac;
	 private String barrioPac;
	 private String parroquiaPac;
	 private String cantonPac;
	 private String provinciaPac;
	 private String telefonoPac;
	 private String profesionPac;
	 private String tipoSangrePac;
	 private String generoPac;
	 private String estadoCivilPac;
	 private String carreraPac;
	 private String cicloPac;
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;




	public Long getIdPac() {
        return idPac;
    }

    public void setIdPac(Long idPac) {
        this.idPac = idPac;
    }

    public String getCedulaPac() {
        return cedulaPac;
    }

    public void setCedulaPac(String cedulaPac) {
        this.cedulaPac = cedulaPac;
    }

    public Date getFechaNacimientoPac() {
        return fechaNacimientoPac;
    }

    public void setFechaNacimientoPac(Date fechaNacimientoPac) {
        this.fechaNacimientoPac = fechaNacimientoPac;
    }

    public String getNombrePac() {
        return nombrePac;
    }

    public void setNombrePac(String nombrePac) {
        this.nombrePac = nombrePac;
    }

    public String getApellidoPac() {
        return apellidoPac;
    }

    public void setApellidoPac(String apellidoPac) {
        this.apellidoPac = apellidoPac;
    }

    public String getLugarPac() {
        return lugarPac;
    }

    public void setLugarPac(String lugarPac) {
        this.lugarPac = lugarPac;
    }

    public String getPaisPac() {
        return paisPac;
    }

    public void setPaisPac(String paisPac) {
        this.paisPac = paisPac;
    }

    public String getDireccionPac() {
        return direccionPac;
    }

    public void setDireccionPac(String direccionPac) {
        this.direccionPac = direccionPac;
    }

    public String getBarrioPac() {
        return barrioPac;
    }

    public void setBarrioPac(String barrioPac) {
        this.barrioPac = barrioPac;
    }

    public String getParroquiaPac() {
        return parroquiaPac;
    }

    public void setParroquiaPac(String parroquiaPac) {
        this.parroquiaPac = parroquiaPac;
    }

    public String getCantonPac() {
        return cantonPac;
    }

    public void setCantonPac(String cantonPac) {
        this.cantonPac = cantonPac;
    }

    public String getProvinciaPac() {
        return provinciaPac;
    }

    public void setProvinciaPac(String provinciaPac) {
        this.provinciaPac = provinciaPac;
    }

    public String getTelefonoPac() {
        return telefonoPac;
    }

    public void setTelefonoPac(String telefonoPac) {
        this.telefonoPac = telefonoPac;
    }

    public String getProfesionPac() {
        return profesionPac;
    }

    public void setProfesionPac(String profesionPac) {
        this.profesionPac = profesionPac;
    }

    public String getTipoSangrePac() {
        return tipoSangrePac;
    }

    public void setTipoSangrePac(String tipoSangrePac) {
        this.tipoSangrePac = tipoSangrePac;
    }

    public String getGeneroPac() {
        return generoPac;
    }

    public void setGeneroPac(String generoPac) {
        this.generoPac = generoPac;
    }

    public String getEstadoCivilPac() {
        return estadoCivilPac;
    }

    public void setEstadoCivilPac(String estadoCivilPac) {
        this.estadoCivilPac = estadoCivilPac;
    }

    public String getCarreraPac() {
        return carreraPac;
    }

    public void setCarreraPac(String carreraPac) {
        this.carreraPac = carreraPac;
    }

    public String getCicloPac() {
        return cicloPac;
    }

    public void setCicloPac(String cicloPac) {
        this.cicloPac = cicloPac;
    }
}
