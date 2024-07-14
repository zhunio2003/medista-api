package ista.sistemaClinica.model.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "examen_complementario")
public class ExamenComplementario implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_exa;

    private String titulo_exa;
    private Boolean aplica_exa;

    @ManyToOne
    @JoinColumn(name = "fk_id_AtencionMedica")
    private AtencionMedica atencionMedica;
    

    private static final long serialVersionUID = 1L;
    

    // Getters y Setters
	public Long getId_exa() {
		return id_exa;
	}

	public void setId_exa(Long id_exa) {
		this.id_exa = id_exa;
	}

	public String getTitulo_exa() {
		return titulo_exa;
	}

	public void setTitulo_exa(String titulo_exa) {
		this.titulo_exa = titulo_exa;
	}

	public Boolean getAplica_exa() {
		return aplica_exa;
	}

	public void setAplica_exa(Boolean aplica_exa) {
		this.aplica_exa = aplica_exa;
	}

	public AtencionMedica getAtencionMedica() {
		return atencionMedica;
	}

	public void setAtencionMedica(AtencionMedica atencionMedica) {
		this.atencionMedica = atencionMedica;
	}
    
    


}

