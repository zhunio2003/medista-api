package ista.sistemaClinica.model.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

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
    @JoinColumn(name = "fk_id_doctor")
    private Doctor doctor;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_id_atencion_medica")
	private List<Diagnostico> diagnosticos;
    
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_id_atencion_medica")
	private List<ExamenComplementario> examenescomplementarios;
    
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_id_atencion_medica")
	private List<AtencionSigno> atencionesSignos;
    
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


	public Doctor getDoctor() {
		return doctor;
	}



	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}


	public Date getFechaAtencionAte() {
		return fechaAtencionAte;
	}



	public void setFechaAtencionAte(Date fechaAtencionAte) {
		this.fechaAtencionAte = fechaAtencionAte;
	}



	public List<Diagnostico> getDiagnosticos() {
		return diagnosticos;
	}



	public void setDiagnosticos(List<Diagnostico> diagnosticos) {
		this.diagnosticos = diagnosticos;
	}



	public List<ExamenComplementario> getExamenescomplementarios() {
		return examenescomplementarios;
	}



	public void setExamenescomplementarios(List<ExamenComplementario> examenescomplementarios) {
		this.examenescomplementarios = examenescomplementarios;
	}



	public List<AtencionSigno> getAtencionesSignos() {
		return atencionesSignos;
	}



	public void setAtencionesSignos(List<AtencionSigno> atencionesSignos) {
		this.atencionesSignos = atencionesSignos;
	}
	
	

}
