package ista.sistemaClinica.model.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "antecedente_familiar")
public class AntecedenteFamiliar implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idAnt;

    private Boolean alergiaAnt;
    private Boolean clinicoAnt;
    private Boolean ginecologoAnt;
    private Boolean traumatologicoAnt;
    private Boolean quirurgicoAnt;
    private Boolean farmacologicoAnt;
    
    private static final long serialVersionUID = 1L;


	public Long getIdAnt() {
		return idAnt;
	}


	public void setIdAnt(Long idAnt) {
		this.idAnt = idAnt;
	}


	public Boolean getAlergiaAnt() {
		return alergiaAnt;
	}


	public void setAlergiaAnt(Boolean alergiaAnt) {
		this.alergiaAnt = alergiaAnt;
	}


	public Boolean getClinicoAnt() {
		return clinicoAnt;
	}


	public void setClinicoAnt(Boolean clinicoAnt) {
		this.clinicoAnt = clinicoAnt;
	}


	public Boolean getGinecologoAnt() {
		return ginecologoAnt;
	}


	public void setGinecologoAnt(Boolean ginecologoAnt) {
		this.ginecologoAnt = ginecologoAnt;
	}


	public Boolean getTraumatologicoAnt() {
		return traumatologicoAnt;
	}


	public void setTraumatologicoAnt(Boolean traumatologicoAnt) {
		this.traumatologicoAnt = traumatologicoAnt;
	}


	public Boolean getQuirurgicoAnt() {
		return quirurgicoAnt;
	}


	public void setQuirurgicoAnt(Boolean quirurgicoAnt) {
		this.quirurgicoAnt = quirurgicoAnt;
	}


	public Boolean getFarmacologicoAnt() {
		return farmacologicoAnt;
	}


	public void setFarmacologicoAnt(Boolean farmacologicoAnt) {
		this.farmacologicoAnt = farmacologicoAnt;
	}

}
