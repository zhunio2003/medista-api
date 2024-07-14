package ista.sistemaClinica.model.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "atencion_medica")
public class AtencionMedica implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_ate;

    private String motivo_ate;
    private String enfermedad_actual_ate;
    private String tratamiento_ate;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_id_ficha_medica")
    private FichaMedica ficha_medica;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_id_instituto")
    private Instituto instituto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_id_doctor")
    private Doctor doctor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_id_diagnostico")
    private Diagnostico diagnostico;
    
    

    private static final long serialVersionUID = 1L;


    // Getters y Setters
    
	public Long getId_ate() {
		return id_ate;
	}



	public void setId_ate(Long id_ate) {
		this.id_ate = id_ate;
	}



	public String getMotivo_ate() {
		return motivo_ate;
	}



	public void setMotivo_ate(String motivo_ate) {
		this.motivo_ate = motivo_ate;
	}



	public String getEnfermedad_actual_ate() {
		return enfermedad_actual_ate;
	}



	public void setEnfermedad_actual_ate(String enfermedad_actual_ate) {
		this.enfermedad_actual_ate = enfermedad_actual_ate;
	}



	public String getTratamiento_ate() {
		return tratamiento_ate;
	}



	public void setTratamiento_ate(String tratamiento_ate) {
		this.tratamiento_ate = tratamiento_ate;
	}



	public FichaMedica getFicha_medica() {
		return ficha_medica;
	}



	public void setFicha_medica(FichaMedica ficha_medica) {
		this.ficha_medica = ficha_medica;
	}



	public Instituto getInstituto() {
		return instituto;
	}



	public void setInstituto(Instituto instituto) {
		this.instituto = instituto;
	}



	public Doctor getDoctor() {
		return doctor;
	}



	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}



	public Diagnostico getDiagnostico() {
		return diagnostico;
	}



	public void setDiagnostico(Diagnostico diagnostico) {
		this.diagnostico = diagnostico;
	}

    
}
