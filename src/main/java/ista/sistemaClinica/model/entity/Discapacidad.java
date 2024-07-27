package ista.sistemaClinica.model.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "discapacidad")
public class Discapacidad implements Serializable {

	// Getters y Setters
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idDis;

    private Boolean discapacidadG; // si/no
    //private Boolean intelectualDis;
    private Double porcentajeDis;
    private String subtipoDis;
    private Boolean carnetCon;
        
    private static final long serialVersionUID = 1L;

	public Long getIdDis() {
		return idDis;
	}

	public void setIdDis(Long idDis) {
		this.idDis = idDis;
	}
	

	

	/*public Boolean getIntelectualDis() {
		return intelectualDis;
	}

	public void setIntelectualDis(Boolean intelectualDis) {
		this.intelectualDis = intelectualDis;
	}*/

	public Boolean getDiscapacidadG() {
		return discapacidadG;
	}

	public void setDiscapacidadG(Boolean discapacidadG) {
		this.discapacidadG = discapacidadG;
	}

	public Boolean getCarnetCon() {
		return carnetCon;
	}

	public void setCarnetCon(Boolean carnetCon) {
		this.carnetCon = carnetCon;
	}

	public Double getPorcentajeDis() {
		return porcentajeDis;
	}

	public void setPorcentajeDis(Double porcentajeDis) {
		this.porcentajeDis = porcentajeDis;
	}

	public String getSubtipoDis() {
		return subtipoDis;
	}

	public void setSubtipoDis(String subtipoDis) {
		this.subtipoDis = subtipoDis;
	}

    
    
    

    
}
