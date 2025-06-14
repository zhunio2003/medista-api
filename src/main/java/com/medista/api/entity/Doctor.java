package com.medista.api.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "doctor")
public class Doctor implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idDoctor;

    @Column(unique = true)
    private String cedulaDoc;

    private String nombreDoc;
    private String apellidoDoc;
    private String telefonoDoc;
    private String direccionDoc;
    private String especialidadDoc;
    private String codigoMspDoc;
    
    private String generoDoc;
    private String passwordDoc;
    
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_id_doctor")
	private List<AtencionMedica> atencionesMedicas;
    

    private static final long serialVersionUID = 1L;

    // Getters y Setters
	public Long getIdDoctor() {
		return idDoctor;
	}


	public void setIdDoctor(Long idDoctor) {
		this.idDoctor = idDoctor;
	}


	public String getCedulaDoc() {
		return cedulaDoc;
	}


	public void setCedulaDoc(String cedulaDoc) {
		this.cedulaDoc = cedulaDoc;
	}


	public String getNombreDoc() {
		return nombreDoc;
	}


	public void setNombreDoc(String nombreDoc) {
		this.nombreDoc = nombreDoc;
	}


	public String getApellidoDoc() {
		return apellidoDoc;
	}


	public void setApellidoDoc(String apellidoDoc) {
		this.apellidoDoc = apellidoDoc;
	}


	public String getTelefonoDoc() {
		return telefonoDoc;
	}


	public void setTelefonoDoc(String telefonoDoc) {
		this.telefonoDoc = telefonoDoc;
	}


	public String getDireccionDoc() {
		return direccionDoc;
	}


	public void setDireccionDoc(String direccionDoc) {
		this.direccionDoc = direccionDoc;
	}


	public String getEspecialidadDoc() {
		return especialidadDoc;
	}


	public void setEspecialidadDoc(String especialidadDoc) {
		this.especialidadDoc = especialidadDoc;
	}


	public String getCodigoMspDoc() {
		return codigoMspDoc;
	}


	public void setCodigoMspDoc(String codigoMspDoc) {
		this.codigoMspDoc = codigoMspDoc;
	}


	public String getGeneroDoc() {
		return generoDoc;
	}


	public void setGeneroDoc(String generoDoc) {
		this.generoDoc = generoDoc;
	}


	public String getPasswordDoc() {
		return passwordDoc;
	}


	public void setPasswordDoc(String passwordDoc) {
		this.passwordDoc = passwordDoc;
	}




}
