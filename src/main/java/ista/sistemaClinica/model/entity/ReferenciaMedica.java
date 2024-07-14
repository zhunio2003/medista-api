package ista.sistemaClinica.model.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "referencia_medica")
public class ReferenciaMedica implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_ref;

    private String institucion_ref;
    private String departamento_ref;
    
    //Deriva a:
    private String entidad_sistema_ref;
    private String establecimiento_ref;
    private String servicio_ref;
    private String especialidad_ref;
    private String fecha_ref;
    
    private String motivo_referencia_ref;
    private String resumen_ref;
    private String hallazgos_ref;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_diagnostico_ref")
    private Diagnostico diagnostico_ref;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_id_atencion_medica")
    private AtencionMedica atencionMedica;

    private static final long serialVersionUID = 1L;

    // Getters y Setters
	public Long getId_ref() {
		return id_ref;
	}

	public void setId_ref(Long id_ref) {
		this.id_ref = id_ref;
	}

	public String getInstitucion_ref() {
		return institucion_ref;
	}

	public void setInstitucion_ref(String institucion_ref) {
		this.institucion_ref = institucion_ref;
	}

	public String getDepartamento_ref() {
		return departamento_ref;
	}

	public void setDepartamento_ref(String departamento_ref) {
		this.departamento_ref = departamento_ref;
	}

	public String getEntidad_sistema_ref() {
		return entidad_sistema_ref;
	}

	public void setEntidad_sistema_ref(String entidad_sistema_ref) {
		this.entidad_sistema_ref = entidad_sistema_ref;
	}

	public String getEstablecimiento_ref() {
		return establecimiento_ref;
	}

	public void setEstablecimiento_ref(String establecimiento_ref) {
		this.establecimiento_ref = establecimiento_ref;
	}

	public String getServicio_ref() {
		return servicio_ref;
	}

	public void setServicio_ref(String servicio_ref) {
		this.servicio_ref = servicio_ref;
	}

	public String getEspecialidad_ref() {
		return especialidad_ref;
	}

	public void setEspecialidad_ref(String especialidad_ref) {
		this.especialidad_ref = especialidad_ref;
	}

	public String getFecha_ref() {
		return fecha_ref;
	}

	public void setFecha_ref(String fecha_ref) {
		this.fecha_ref = fecha_ref;
	}

	public String getMotivo_referencia_ref() {
		return motivo_referencia_ref;
	}

	public void setMotivo_referencia_ref(String motivo_referencia_ref) {
		this.motivo_referencia_ref = motivo_referencia_ref;
	}

	public String getResumen_ref() {
		return resumen_ref;
	}

	public void setResumen_ref(String resumen_ref) {
		this.resumen_ref = resumen_ref;
	}

	public String getHallazgos_ref() {
		return hallazgos_ref;
	}

	public void setHallazgos_ref(String hallazgos_ref) {
		this.hallazgos_ref = hallazgos_ref;
	}

	public Diagnostico getDiagnostico_ref() {
		return diagnostico_ref;
	}

	public void setDiagnostico_ref(Diagnostico diagnostico_ref) {
		this.diagnostico_ref = diagnostico_ref;
	}

	public AtencionMedica getAtencionMedica() {
		return atencionMedica;
	}

	public void setAtencionMedica(AtencionMedica atencionMedica) {
		this.atencionMedica = atencionMedica;
	}

      
}
