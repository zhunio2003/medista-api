package ista.sistemaClinica.model.entity;

import java.io.Serializable;


import jakarta.persistence.*;

@Entity
@Table(name = "instituto")
public class Instituto implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_ins;

    private String nombre_ins;
    private String direccion_ins;
    private String rector_ins;
    
    @Lob // Large Object (BLOB) -> Binary Large Object
    @Column(columnDefinition="BLOB")
    private byte[] image_instituto;

    private static final long serialVersionUID = 1L;

    // Getters y Setters
	public Long getId_ins() {
		return id_ins;
	}

	public void setId_ins(Long id_ins) {
		this.id_ins = id_ins;
	}

	public String getNombre_ins() {
		return nombre_ins;
	}

	public void setNombre_ins(String nombre_ins) {
		this.nombre_ins = nombre_ins;
	}

	public String getDireccion_ins() {
		return direccion_ins;
	}

	public void setDireccion_ins(String direccion_ins) {
		this.direccion_ins = direccion_ins;
	}

	public String getRector_ins() {
		return rector_ins;
	}

	public void setRector_ins(String rector_ins) {
		this.rector_ins = rector_ins;
	}

	public byte[] getImage_instituto() {
		return image_instituto;
	}

	public void setImage_instituto(byte[] image_instituto) {
		this.image_instituto = image_instituto;
	}

    
    
}
