package ista.sistemaClinica.model.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "antecedente_familiar")
public class AntecedenteFamiliar implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_ant;

    private Boolean alergia_ant;
    private Boolean clinico_ant;
    private Boolean ginecologo_ant;
    private Boolean traumatologico_ant;
    private Boolean quirurgico_ant;
    private Boolean farmacologico_ant;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_id_ficha_medica")
    private FichaMedica ficha_medica;
    
    
    // Getters y Setters
    private static final long serialVersionUID = 1L;

	public Long getId_ant() {
		return id_ant;
	}

	public void setId_ant(Long id_ant) {
		this.id_ant = id_ant;
	}



	public Boolean getAlergia_ant() {
		return alergia_ant;
	}

	public void setAlergia_ant(Boolean alergia_ant) {
		this.alergia_ant = alergia_ant;
	}

	public Boolean getClinico_ant() {
		return clinico_ant;
	}

	public void setClinico_ant(Boolean clinico_ant) {
		this.clinico_ant = clinico_ant;
	}

	public Boolean getGinecologo_ant() {
		return ginecologo_ant;
	}

	public void setGinecologo_ant(Boolean ginecologo_ant) {
		this.ginecologo_ant = ginecologo_ant;
	}

	public Boolean getTraumatologico_ant() {
		return traumatologico_ant;
	}

	public void setTraumatologico_ant(Boolean traumatologico_ant) {
		this.traumatologico_ant = traumatologico_ant;
	}

	public Boolean getQuirurgico_ant() {
		return quirurgico_ant;
	}

	public void setQuirurgico_ant(Boolean quirurgico_ant) {
		this.quirurgico_ant = quirurgico_ant;
	}

	public Boolean getFarmacologico_ant() {
		return farmacologico_ant;
	}

	public void setFarmacologico_ant(Boolean farmacologico_ant) {
		this.farmacologico_ant = farmacologico_ant;
	}

	public FichaMedica getFicha_medica() {
		return ficha_medica;
	}

	public void setFicha_medica(FichaMedica ficha_medica) {
		this.ficha_medica = ficha_medica;
	}
  
}
