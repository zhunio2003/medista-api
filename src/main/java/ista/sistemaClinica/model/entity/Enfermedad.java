package ista.sistemaClinica.model.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "enfermedad")
public class Enfermedad implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_enf;
    
    @Column(unique = true)
    private String codigo_enf;

    private String nombre_enf;
    private String tipo_enf;
    private String descripcion_enf;
    private String sintomas_enf;
    
    
    
    // Getters y Setters
    private static final long serialVersionUID = 1L;

	public Long getId_enf() {
		return id_enf;
	}

	public void setId_enf(Long id_enf) {
		this.id_enf = id_enf;
	}

	public String getCodigo_enf() {
		return codigo_enf;
	}

	public void setCodigo_enf(String codigo_enf) {
		this.codigo_enf = codigo_enf;
	}

	public String getNombre_enf() {
		return nombre_enf;
	}

	public void setNombre_enf(String nombre_enf) {
		this.nombre_enf = nombre_enf;
	}

	public String getTipo_enf() {
		return tipo_enf;
	}

	public void setTipo_enf(String tipo_enf) {
		this.tipo_enf = tipo_enf;
	}

	public String getDescripcion_enf() {
		return descripcion_enf;
	}

	public void setDescripcion_enf(String descripcion_enf) {
		this.descripcion_enf = descripcion_enf;
	}

	public String getSintomas_enf() {
		return sintomas_enf;
	}

	public void setSintomas_enf(String sintomas_enf) {
		this.sintomas_enf = sintomas_enf;
	}

    
    
}
