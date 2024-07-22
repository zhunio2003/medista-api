package ista.sistemaClinica.model.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "enfermedad")
public class Enfermedad implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idEnf;
    
    @Column(unique = true)
    private String codigoEnf;

    private String nombreEnf;
    private String tipoEnf;
    private String descripcionEnf;
    private String sintomasEnf;
    
    
    
    // Getters y Setters
    private static final long serialVersionUID = 1L;

	public Long getId_enf() {
		return idEnf;
	}

	public void setId_enf(Long id_enf) {
		this.idEnf = id_enf;
	}

	public String getCodigo_enf() {
		return codigoEnf;
	}

	public void setCodigo_enf(String codigo_enf) {
		this.codigoEnf = codigo_enf;
	}

	public String getNombre_enf() {
		return nombreEnf;
	}

	public void setNombre_enf(String nombre_enf) {
		this.nombreEnf = nombre_enf;
	}

	public String getTipo_enf() {
		return tipoEnf;
	}

	public void setTipo_enf(String tipo_enf) {
		this.tipoEnf = tipo_enf;
	}

	public String getDescripcion_enf() {
		return descripcionEnf;
	}

	public void setDescripcion_enf(String descripcion_enf) {
		this.descripcionEnf = descripcion_enf;
	}

	public String getSintomas_enf() {
		return sintomasEnf;
	}

	public void setSintomas_enf(String sintomas_enf) {
		this.sintomasEnf = sintomas_enf;
	}

    
    
}
