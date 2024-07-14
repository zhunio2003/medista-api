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
	
	@Temporal(TemporalType.DATE)
	private Date fecha_nacimiento_pac;
	
	private String nombre_pac;
	private String apellido_pac;
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
	 	
	
	public Long getId_pac() {
		return id_pac;
	}



	public void setId_pac(Long id_pac) {
		this.id_pac = id_pac;
	}



	public String getCedula_pac() {
		return cedula_pac;
	}



	public void setCedula_pac(String cedula_pac) {
		this.cedula_pac = cedula_pac;
	}



	public Date getFecha_nacimiento_pac() {
		return fecha_nacimiento_pac;
	}



	public void setFecha_nacimiento_pac(Date fecha_nacimiento_pac) {
		this.fecha_nacimiento_pac = fecha_nacimiento_pac;
	}



	public String getNombre_pac() {
		return nombre_pac;
	}



	public void setNombre_pac(String nombre_pac) {
		this.nombre_pac = nombre_pac;
	}



	public String getApellido_pac() {
		return apellido_pac;
	}



	public void setApellido_pac(String apellido_pac) {
		this.apellido_pac = apellido_pac;
	}



	public String getLugar_pac() {
		return lugar_pac;
	}



	public void setLugar_pac(String lugar_pac) {
		this.lugar_pac = lugar_pac;
	}



	public String getPais_pac() {
		return pais_pac;
	}



	public void setPais_pac(String pais_pac) {
		this.pais_pac = pais_pac;
	}



	public String getDireccion_pac() {
		return direccion_pac;
	}



	public void setDireccion_pac(String direccion_pac) {
		this.direccion_pac = direccion_pac;
	}



	public String getBarrio_pac() {
		return barrio_pac;
	}



	public void setBarrio_pac(String barrio_pac) {
		this.barrio_pac = barrio_pac;
	}



	public String getParroquia_pac() {
		return parroquia_pac;
	}



	public void setParroquia_pac(String parroquia_pac) {
		this.parroquia_pac = parroquia_pac;
	}



	public String getCanton_pac() {
		return canton_pac;
	}



	public void setCanton_pac(String canton_pac) {
		this.canton_pac = canton_pac;
	}



	public String getProvincia_pac() {
		return provincia_pac;
	}



	public void setProvincia_pac(String provincia_pac) {
		this.provincia_pac = provincia_pac;
	}



	public String getTelefono_pac() {
		return telefono_pac;
	}



	public void setTelefono_pac(String telefono_pac) {
		this.telefono_pac = telefono_pac;
	}



	public String getProfesion_pac() {
		return profesion_pac;
	}



	public void setProfesion_pac(String profesion_pac) {
		this.profesion_pac = profesion_pac;
	}



	public String getTipo_sangre_pac() {
		return tipo_sangre_pac;
	}



	public void setTipo_sangre_pac(String tipo_sangre_pac) {
		this.tipo_sangre_pac = tipo_sangre_pac;
	}



	public String getGenero_pac() {
		return genero_pac;
	}



	public void setGenero_pac(String genero_pac) {
		this.genero_pac = genero_pac;
	}



	public String getEstado_civil_pac() {
		return estado_civil_pac;
	}



	public void setEstado_civil_pac(String estado_civil_pac) {
		this.estado_civil_pac = estado_civil_pac;
	}



	public String getCarrera_pac() {
		return carrera_pac;
	}



	public void setCarrera_pac(String carrera_pac) {
		this.carrera_pac = carrera_pac;
	}



	public String getCiclo_pac() {
		return ciclo_pac;
	}



	public void setCiclo_pac(String ciclo_pac) {
		this.ciclo_pac = ciclo_pac;
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


}
