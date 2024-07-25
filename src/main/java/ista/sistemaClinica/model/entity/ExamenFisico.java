package ista.sistemaClinica.model.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "examen_fisico")
public class ExamenFisico implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idExa;

    private String nombreExa;
    private Double numeroExa;
    private String descripcionExa;

    @ManyToOne
    @JoinColumn(name = "fk_id_AtencionMedica")
    private AtencionMedica atencionMedica;

    private static final long serialVersionUID = 1L;

	public Long getIdExa() {
		return idExa;
	}

	public void setIdExa(Long idExa) {
		this.idExa = idExa;
	}

	public String getNombreExa() {
		return nombreExa;
	}

	public void setNombreExa(String nombreExa) {
		this.nombreExa = nombreExa;
	}

	public Double getNumeroExa() {
		return numeroExa;
	}

	public void setNumeroExa(Double numeroExa) {
		this.numeroExa = numeroExa;
	}

	public String getDescripcionExa() {
		return descripcionExa;
	}

	public void setDescripcionExa(String descripcionExa) {
		this.descripcionExa = descripcionExa;
	}

	public AtencionMedica getAtencionMedica() {
		return atencionMedica;
	}

	public void setAtencionMedica(AtencionMedica atencionMedica) {
		this.atencionMedica = atencionMedica;
	}

    // Getters y Setters

}
