package ista.sistemaClinica.model.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "signos_vitales")
public class SignoVital implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_sig;

    private String nombre_sig;
    private String unidad_sig;


    private static final long serialVersionUID = 1L;
    
    // Getters y Setters
	public Long getId_sig() {
		return id_sig;
	}


	public void setId_sig(Long id_sig) {
		this.id_sig = id_sig;
	}


	public String getNombre_sig() {
		return nombre_sig;
	}


	public void setNombre_sig(String nombre_sig) {
		this.nombre_sig = nombre_sig;
	}


	public String getUnidad_sig() {
		return unidad_sig;
	}


	public void setUnidad_sig(String unidad_sig) {
		this.unidad_sig = unidad_sig;
	}

    
}
