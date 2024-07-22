package ista.sistemaClinica.model.entity;

import java.io.Serializable;


import jakarta.persistence.*;

@Entity
@Table(name = "instituto")
public class Instituto implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idIns;

    private String nombreIns;
    private String direccionIns;
    private String rectorIns;
    
    @Lob // Large Object (BLOB) -> Binary Large Object
    @Column(columnDefinition="BLOB")
    private byte[] imageInstituto;

    private static final long serialVersionUID = 1L;

	public Long getIdIns() {
		return idIns;
	}

	public void setIdIns(Long idIns) {
		this.idIns = idIns;
	}

	public String getNombreIns() {
		return nombreIns;
	}

	public void setNombreIns(String nombreIns) {
		this.nombreIns = nombreIns;
	}

	public String getDireccionIns() {
		return direccionIns;
	}

	public void setDireccionIns(String direccionIns) {
		this.direccionIns = direccionIns;
	}

	public String getRectorIns() {
		return rectorIns;
	}

	public void setRectorIns(String rectorIns) {
		this.rectorIns = rectorIns;
	}

	public byte[] getImageInstituto() {
		return imageInstituto;
	}

	public void setImageInstituto(byte[] imageInstituto) {
		this.imageInstituto = imageInstituto;
	}	
    
}
