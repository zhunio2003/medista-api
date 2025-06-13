package com.medista.api.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "ficha_medica")
public class FichaMedica implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idFic;

    @OneToOne()
    @JoinColumn(name = "fk_id_pac")
    private Paciente paciente;
    
    @OneToOne()
    @JoinColumn(name = "fk_id_dis")
    private Discapacidad discapacidad;
    
    @OneToOne()
    @JoinColumn(name = "fk_id_ant")
    private AntecedenteFamiliar antecedenteFamiliar;

    @Temporal(TemporalType.DATE)
    private Date fechaElaboracionFic;
    
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_id_ficha_medica")
	private List<AtencionMedica> atencionesMedicas;

    private static final long serialVersionUID = 1L;

	public Long getIdFic() {
		return idFic;
	}

	public void setIdFic(Long idFic) {
		this.idFic = idFic;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Date getFechaElaboracionFic() {
		return fechaElaboracionFic;
	}

	public void setFechaElaboracionFic(Date fechaElaboracionFic) {
		this.fechaElaboracionFic = fechaElaboracionFic;
	}

	public Discapacidad getDiscapacidad() {
		return discapacidad;
	}

	public void setDiscapacidad(Discapacidad discapacidad) {
		this.discapacidad = discapacidad;
	}

	public AntecedenteFamiliar getAntecedenteFamiliar() {
		return antecedenteFamiliar;
	}

	public void setAntecedenteFamiliar(AntecedenteFamiliar antecedenteFamiliar) {
		this.antecedenteFamiliar = antecedenteFamiliar;
	}

	/*public List<ReferenciaMedica> getReferenciasMedicas() {
		return referenciasMedicas;
	}

	public void setReferenciasMedicas(List<ReferenciaMedica> referenciasMedicas) {
		this.referenciasMedicas = referenciasMedicas;
	}*/
    
		
}
