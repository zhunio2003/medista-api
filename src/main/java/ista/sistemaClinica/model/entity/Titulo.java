package ista.sistemaClinica.model.entity;

import java.io.Serializable;

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
    private Long idTit;
	
	private String contenidoTit;
    private String fechaCreacion;
    private String leyendaTit;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_id_instituto")
    private Instituto instituto;
    


	public Long getIdTit() {
		return idTit;
	}




	public void setIdTit(Long idTit) {
		this.idTit = idTit;
	}




	public String getContenidoTit() {
		return contenidoTit;
	}




	public void setContenidoTit(String contenidoTit) {
		this.contenidoTit = contenidoTit;
	}








	public String getFechaCreacion() {
		return fechaCreacion;
	}




	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}




	public String getLeyendaTit() {
		return leyendaTit;
	}




	public void setLeyendaTit(String leyendaTit) {
		this.leyendaTit = leyendaTit;
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
