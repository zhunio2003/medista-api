package ista.sistemaClinica.model.entity;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "ficha_medica")
public class FichaMedica implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_fic;

    private String antecedentes_medicos_fic;
    private String discapacidad_fic;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_id_pac")
    private Paciente paciente;

    @Temporal(TemporalType.DATE)
    private Date fecha_elaboracion_fic;

    private static final long serialVersionUID = 1L;
    
    
    // Getters y Setters
	public Long getId_fic() {
		return id_fic;
	}

	public void setId_fic(Long id_fic) {
		this.id_fic = id_fic;
	}

	public String getAntecedentes_medicos_fic() {
		return antecedentes_medicos_fic;
	}

	public void setAntecedentes_medicos_fic(String antecedentes_medicos_fic) {
		this.antecedentes_medicos_fic = antecedentes_medicos_fic;
	}

	public String getDiscapacidad_fic() {
		return discapacidad_fic;
	}

	public void setDiscapacidad_fic(String discapacidad_fic) {
		this.discapacidad_fic = discapacidad_fic;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Date getFecha_elaboracion_fic() {
		return fecha_elaboracion_fic;
	}

	public void setFecha_elaboracion_fic(Date fecha_elaboracion_fic) {
		this.fecha_elaboracion_fic = fecha_elaboracion_fic;
	}

    
    
}
