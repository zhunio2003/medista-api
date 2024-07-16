package ista.sistemaClinica.model.entity;

import java.io.Serializable;

import org.springframework.web.bind.annotation.CrossOrigin;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "titulo")
public class Titulo implements Serializable{
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_tit;
	
	private String contenido_tit;
    private String fecha_creacion_tit;
    private String leyenda_tit;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_id_instituto")
    private Instituto instituto;
    

	public Long getId_tit() {
		return id_tit;
	}




	public void setId_tit(Long id_tit) {
		this.id_tit = id_tit;
	}




	public String getContenido_tit() {
		return contenido_tit;
	}




	public void setContenido_tit(String contenido_tit) {
		this.contenido_tit = contenido_tit;
	}




	public String getFecha_creacion_tit() {
		return fecha_creacion_tit;
	}




	public void setFecha_creacion_tit(String fecha_creacion_tit) {
		this.fecha_creacion_tit = fecha_creacion_tit;
	}




	public String getLeyenda_tit() {
		return leyenda_tit;
	}




	public void setLeyenda_tit(String leyenda_tit) {
		this.leyenda_tit = leyenda_tit;
	}




	public Instituto getInstituto() {
		return instituto;
	}




	public void setInstituto(Instituto instituto) {
		this.instituto = instituto;
	}




	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
