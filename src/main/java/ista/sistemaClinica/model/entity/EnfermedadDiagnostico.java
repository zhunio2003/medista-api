package ista.sistemaClinica.model.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "enfermedad_diagnostico")
public class EnfermedadDiagnostico implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_ced;

    @ManyToOne
    @JoinColumn(name = "fk_id_categoriaEnfer")
    private Enfermedad enfermedad_ced;

    @ManyToOne
    @JoinColumn(name = "fk_id_diagnostico")
    private Diagnostico diagnostico_ced;

    private static final long serialVersionUID = 1L;
    
    // Getter and setter
	public Long getId_ced() {
		return id_ced;
	}

	public void setId_ced(Long id_ced) {
		this.id_ced = id_ced;
	}

	public Enfermedad getEnfermedad_ced() {
		return enfermedad_ced;
	}

	public void setEnfermedad_ced(Enfermedad enfermedad_ced) {
		this.enfermedad_ced = enfermedad_ced;
	}

	public Diagnostico getDiagnostico_ced() {
		return diagnostico_ced;
	}

	public void setDiagnostico_ced(Diagnostico diagnostico_ced) {
		this.diagnostico_ced = diagnostico_ced;
	}

     
    
}
