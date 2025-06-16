package com.medista.api.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "doctor")
@Data
public class Doctor implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true)
	private String cedula;

	private String nombre;
	private String apellido;
	private String telefono;
	private String direccion;
	private String especialidad;
	private String codigoMsp;
	private String genero;
	private String password;

	@Transient
	private List<AtencionMedica> atencionesMedicas;

	private static final long serialVersionUID = 1L;
}
