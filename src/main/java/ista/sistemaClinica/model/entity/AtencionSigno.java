package ista.sistemaClinica.model.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "atencion_signo")
public class AtencionSigno implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idAts;

    private Double valorAts;

    @ManyToOne
    @JoinColumn(name = "fk_id_signos_vitales")
    private SignoVital signoVital;

    private static final long serialVersionUID = 1L;

	public Long getIdAts() {
		return idAts;
	}

	public void setIdAts(Long idAts) {
		this.idAts = idAts;
	}

	public Double getValorAts() {
		return valorAts;
	}

	public void setValorAts(Double valorAts) {
		this.valorAts = valorAts;
	}

	public SignoVital getSignoVital() {
		return signoVital;
	}

	public void setSignoVital(SignoVital signoVital) {
		this.signoVital = signoVital;
	}
    
}
