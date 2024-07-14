package ista.sistemaClinica.model.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "doctor")
public class Doctor implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_doctor;

    @Column(unique = true)
    private String cedula_doc;

    private String nombre_doc;
    private String apellido_doc;
    private String telefono_doc;
    private String direccion_doc;
    private String especialidad_doc;
    private String codigo_msp;
    
    

    private static final long serialVersionUID = 1L;

    // Getters y Setters

	public Long getId_doctor() {
		return id_doctor;
	}



	public void setId_doctor(Long id_doctor) {
		this.id_doctor = id_doctor;
	}



	public String getCedula_doc() {
		return cedula_doc;
	}



	public void setCedula_doc(String cedula_doc) {
		this.cedula_doc = cedula_doc;
	}



	public String getNombre_doc() {
		return nombre_doc;
	}



	public void setNombre_doc(String nombre_doc) {
		this.nombre_doc = nombre_doc;
	}



	public String getApellido_doc() {
		return apellido_doc;
	}



	public void setApellido_doc(String apellido_doc) {
		this.apellido_doc = apellido_doc;
	}



	public String getTelefono_doc() {
		return telefono_doc;
	}



	public void setTelefono_doc(String telefono_doc) {
		this.telefono_doc = telefono_doc;
	}



	public String getDireccion_doc() {
		return direccion_doc;
	}



	public void setDireccion_doc(String direccion_doc) {
		this.direccion_doc = direccion_doc;
	}



	public String getEspecialidad_doc() {
		return especialidad_doc;
	}



	public void setEspecialidad_doc(String especialidad_doc) {
		this.especialidad_doc = especialidad_doc;
	}



	public String getCodigo_msp() {
		return codigo_msp;
	}



	public void setCodigo_msp(String codigo_msp) {
		this.codigo_msp = codigo_msp;
	}
    
    


}
