package ista.sistemaClinica.model.entity;


import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "titulo")
public class Titulo implements Serializable{
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idTit;
	
	private String contenidoTit;

	@Column(name="fechaCreacion")
	@Temporal(TemporalType.DATE)
	private Date fechaCreacion;

	

    private String leyendaTit;
    
    @Column(name = "instituto_id")
    private Long instituto;
    
    @PrePersist
	public void  prePersist() {
    	fechaCreacion= new Date();
	}
    
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



	
	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getLeyendaTit() {
		return leyendaTit;
	}




	public void setLeyendaTit(String leyendaTit) {
		this.leyendaTit = leyendaTit;
	}




	public Long getInstituto() {
		return instituto;
	}

	public void setInstituto(Long instituto) {
		this.instituto = instituto;
	}




	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
