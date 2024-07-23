package ista.sistemaClinica.model.entity;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "atencion_medica")
public class AtencionMedica implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idAte;

    private String motivoAte;
    private String enfermedadActualAte;
    private String tratamientoAte;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_id_ficha_medica")
    private FichaMedica fichaMedica;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_id_instituto")
    private Instituto instituto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_id_doctor")
    private Doctor doctor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_id_diagnostico")
    private Diagnostico diagnostico;
    
    @Temporal(TemporalType.DATE)
    private Date fechaAtencionAte;

    private static final long serialVersionUID = 1L;

	public Long getIdAte() {
		return idAte;
	}



	public void setIdAte(Long idAte) {
		this.idAte = idAte;
	}



	public String getMotivoAte() {
		return motivoAte;
	}



	public void setMotivoAte(String motivoAte) {
		this.motivoAte = motivoAte;
	}



	public String getEnfermedadActualAte() {
		return enfermedadActualAte;
	}



	public void setEnfermedadActualAte(String enfermedadActualAte) {
		this.enfermedadActualAte = enfermedadActualAte;
	}



	public String getTratamientoAte() {
		return tratamientoAte;
	}



	public void setTratamientoAte(String tratamientoAte) {
		this.tratamientoAte = tratamientoAte;
	}



	public FichaMedica getFichaMedica() {
		return fichaMedica;
	}



	public void setFichaMedica(FichaMedica fichaMedica) {
		this.fichaMedica = fichaMedica;
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



	public Date getFechaAtencionAte() {
		return fechaAtencionAte;
	}



	public void setFechaAtencionAte(Date fechaAtencionAte) {
		this.fechaAtencionAte = fechaAtencionAte;
	}

}
