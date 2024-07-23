package ista.sistemaClinica.model.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "diagnostico")
public class Diagnostico implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idDia;

    private String inicialDia;
    private Boolean estadoDia; // Existe para ocultar y no eliminar el diagnostico

    private static final long serialVersionUID = 1L;

	public Long getIdDia() {
		return idDia;
	}

	public void setIdDia(Long idDia) {
		this.idDia = idDia;
	}

	public String getInicialDia() {
		return inicialDia;
	}

	public void setInicialDia(String inicialDia) {
		this.inicialDia = inicialDia;
	}

	public Boolean getEstadoDia() {
		return estadoDia;
	}

	public void setEstadoDia(Boolean estadoDia) {
		this.estadoDia = estadoDia;
	}
       
}
