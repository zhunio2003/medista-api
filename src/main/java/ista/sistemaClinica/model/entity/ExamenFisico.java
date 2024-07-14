package ista.sistemaClinica.model.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "examen_fisico")
public class ExamenFisico implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_exa;

    private String nombre_exa;
    private Double numero_exa;
    private String descripcion_exa;

    @ManyToOne
    @JoinColumn(name = "fk_id_AtencionMedica")
    private AtencionMedica atencion_medica;

    private static final long serialVersionUID = 1L;

    // Getters y Setters
	public Long getId_exa() {
		return id_exa;
	}

	public void setId_exa(Long id_exa) {
		this.id_exa = id_exa;
	}

	public String getNombre_exa() {
		return nombre_exa;
	}

	public void setNombre_exa(String nombre_exa) {
		this.nombre_exa = nombre_exa;
	}

	public Double getNumero_exa() {
		return numero_exa;
	}

	public void setNumero_exa(Double numero_exa) {
		this.numero_exa = numero_exa;
	}

	public String getDescripcion_exa() {
		return descripcion_exa;
	}

	public void setDescripcion_exa(String descripcion_exa) {
		this.descripcion_exa = descripcion_exa;
	}

	public AtencionMedica getAtencion_medica() {
		return atencion_medica;
	}

	public void setAtencion_medica(AtencionMedica atencion_medica) {
		this.atencion_medica = atencion_medica;
	}

   
    
}
