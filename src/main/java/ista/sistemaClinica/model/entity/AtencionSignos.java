package ista.sistemaClinica.model.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "atencion_signos")
public class AtencionSignos implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_ats;

    private Double valor_ats;

    @ManyToOne
    @JoinColumn(name = "fk_id_atencion_medica")
    private AtencionMedica atencion_medica;

    @ManyToOne
    @JoinColumn(name = "fk_id_signos_vitales")
    private SignosVitales signos_vitales;

    private static final long serialVersionUID = 1L;

    // Getters y Setters
	public Long getId_ats() {
		return id_ats;
	}

	public void setId_ats(Long id_ats) {
		this.id_ats = id_ats;
	}

	public Double getValor_ats() {
		return valor_ats;
	}

	public void setValor_ats(Double valor_ats) {
		this.valor_ats = valor_ats;
	}

	public AtencionMedica getAtencion_medica() {
		return atencion_medica;
	}

	public void setAtencion_medica(AtencionMedica atencion_medica) {
		this.atencion_medica = atencion_medica;
	}

	public SignosVitales getSignos_vitales() {
		return signos_vitales;
	}

	public void setSignos_vitales(SignosVitales signos_vitales) {
		this.signos_vitales = signos_vitales;
	}

   
    
    
}
