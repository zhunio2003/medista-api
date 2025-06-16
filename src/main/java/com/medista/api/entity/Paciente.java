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
import lombok.Data;


@Entity
@Table(name = "paciente")
@Data
public class Paciente implements Serializable {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;

	 @Column(unique = true)
	 private String cedula;

	 @Temporal(TemporalType.DATE)
	 private Date fechaNacimiento;

	 private String nombre;
	 private String apellido;
	 private String lugar;
	 private String pais;
	 private String direccion;
	 private String barrio;
	 private String parroquia;
	 private String canton;
	 private String provincia;
	 private String telefono;
	 private String profesion;
	 private String tipoSangre;
	 private String genero;
	 private String estadoCivil;
	 private String carrera;
	 private String ciclo;
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


}
