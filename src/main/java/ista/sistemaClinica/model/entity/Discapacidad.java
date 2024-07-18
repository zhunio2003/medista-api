package ista.sistemaClinica.model.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "discapacidad")
public class Discapacidad implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_dis;

    private Boolean fisica_dis;
    private Boolean intelectual_dis;
    private Double porcentaje_dis;
    private String subtipo_dis;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_id_ficha_medica")
    private FichaMedica ficha_medica;
        
    private static final long serialVersionUID = 1L;

    
    // Getters y Setters
    
	public Long getId_dis() {
		return id_dis;
	}

	public void setId_dis(Long id_dis) {
		this.id_dis = id_dis;
	}

	public Boolean getFisica_dis() {
		return fisica_dis;
	}

	public void setFisica_dis(Boolean fisica_dis) {
		this.fisica_dis = fisica_dis;
	}

	public Boolean getIntelectual_dis() {
		return intelectual_dis;
	}

	public void setIntelectual_dis(Boolean intelectual_dis) {
		this.intelectual_dis = intelectual_dis;
	}

	public Double getPorcentaje_dis() {
		return porcentaje_dis;
	}

	public void setPorcentaje_dis(Double porcentaje_dis) {
		this.porcentaje_dis = porcentaje_dis;
	}

	public String getSubtipo_dis() {
		return subtipo_dis;
	}

	public void setSubtipo_dis(String subtipo_dis) {
		this.subtipo_dis = subtipo_dis;
	}

	public FichaMedica getFicha_medica() {
		return ficha_medica;
	}

	public void setFicha_medica(FichaMedica ficha_medica) {
		this.ficha_medica = ficha_medica;
	}



    
	
    
}
