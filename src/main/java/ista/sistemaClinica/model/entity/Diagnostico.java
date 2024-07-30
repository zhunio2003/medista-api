package ista.sistemaClinica.model.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "diagnostico")
public class Diagnostico implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idDia;

    @OneToOne()
    @JoinColumn(name = "fk_id_enfermedad")
    private Enfermedad enfermedad;
    
    @ManyToOne
    @JoinColumn(name = "fk_id_atencion_medica", nullable = false)
    private AtencionMedica atencionMedica;
    
    private String inicialDia;
    private Boolean estadoDia;
    
    private static final long serialVersionUID = 1L;

	public Long getIdDia() {
		return idDia;
	}

	public void setIdDia(Long idDia) {
		this.idDia = idDia;
	}

	public Enfermedad getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(Enfermedad enfermedad) {
		this.enfermedad = enfermedad;
	}

	public String getInicialDia() {
		return inicialDia;
	}

	public void setInicialDia(String inicialDia) {
		this.inicialDia = inicialDia;
	}

	public Boolean getEstadoDia() {
		return estadoDia;
	}

	public void setEstadoDia(Boolean estadoDia) {
		this.estadoDia = estadoDia;
	}

	public AtencionMedica getAtencionMedica() {
		return atencionMedica;
	}

	public void setAtencionMedica(AtencionMedica atencionMedica) {
		this.atencionMedica = atencionMedica;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
