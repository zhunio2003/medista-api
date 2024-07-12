package ista.sistemaClinica.model.entity;

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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_pac;
	
	@Column(unique = true)
	private String cedula_pac;
	
	private String nombre_pac;
	private String apellido_pac;
	
	@Temporal(TemporalType.DATE)
	private Date fecha_nacimiento_pac;
	
	private String lugar_pac;
	private String pais_pac;
	private String direccion_pac;
	private String barrio_pac;
	private String parroquia_pac;
	private String canton_pac;
	private String provincia_pac;
	private String telefono_pac;
	private String profesion_pac;
	private String tipo_sangre_pac;
	private String genero_pac;
	private String estado_civil_pac;
	private String carrera_pac;
	private String ciclo_pac;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


}
