package ista.sistemaClinica.model.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "referencia_medica")
public class ReferenciaMedica implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_ref;

    private String institucion_ref;
    private String cedula_doc_ref;
    private String servicio_ref;
    
    
    //Deriva a:
    private String entidad_sistema_ref;
    private String establecimiento_ref;
    private String servicio_refe_ref;
    private String especialidad_ref;
    private Date fecha_ref;
    private boolean motivo_limitada_ref;
    private boolean motivo_falta_ref;
    private boolean motivo_otros_ref;
    private String resumen_ref;
    private String hallazgos_ref;
    
    private String nombre_doc_ref;
    private String codigo_msp_ref;
  
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_id_atencion_medica")
    private AtencionMedica atencionMedica;

    private static final long serialVersionUID = 1L;

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

	public String getCedula_doc_ref() {
		return cedula_doc_ref;
	}

	public void setCedula_doc_ref(String cedula_doc_ref) {
		this.cedula_doc_ref = cedula_doc_ref;
	}

	public String getServicio_ref() {
		return servicio_ref;
	}

	public void setServicio_ref(String servicio_ref) {
		this.servicio_ref = servicio_ref;
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

	public String getServicio_refe_ref() {
		return servicio_refe_ref;
	}

	public void setServicio_refe_ref(String servicio_refe_ref) {
		this.servicio_refe_ref = servicio_refe_ref;
	}

	public String getEspecialidad_ref() {
		return especialidad_ref;
	}

	public void setEspecialidad_ref(String especialidad_ref) {
		this.especialidad_ref = especialidad_ref;
	}

	public Date getFecha_ref() {
		return fecha_ref;
	}

	public void setFecha_ref(Date fecha_ref) {
		this.fecha_ref = fecha_ref;
	}

	public boolean isMotivo_limitada_ref() {
		return motivo_limitada_ref;
	}

	public void setMotivo_limitada_ref(boolean motivo_limitada_ref) {
		this.motivo_limitada_ref = motivo_limitada_ref;
	}

	public boolean isMotivo_falta_ref() {
		return motivo_falta_ref;
	}

	public void setMotivo_falta_ref(boolean motivo_falta_ref) {
		this.motivo_falta_ref = motivo_falta_ref;
	}

	public boolean isMotivo_otros_ref() {
		return motivo_otros_ref;
	}

	public void setMotivo_otros_ref(boolean motivo_otros_ref) {
		this.motivo_otros_ref = motivo_otros_ref;
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

	public String getNombre_doc_ref() {
		return nombre_doc_ref;
	}

	public void setNombre_doc_ref(String nombre_doc_ref) {
		this.nombre_doc_ref = nombre_doc_ref;
	}

	public String getCodigo_msp_ref() {
		return codigo_msp_ref;
	}

	public void setCodigo_msp_ref(String codigo_msp_ref) {
		this.codigo_msp_ref = codigo_msp_ref;
	}

	public AtencionMedica getAtencionMedica() {
		return atencionMedica;
	}

	public void setAtencionMedica(AtencionMedica atencionMedica) {
		this.atencionMedica = atencionMedica;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

    // Getters y Setters
	

      
}
