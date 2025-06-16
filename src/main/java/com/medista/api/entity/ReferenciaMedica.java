package com.medista.api.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "referencia_medica")
@Data
public class ReferenciaMedica implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_doctor")
	private Doctor doctor;

	private String servicio;

	// Institución que emite
	private String institucion;

	// Derivación
	private String entidadSistema;
	private String establecimiento;
	private String servicioDerivado;
	private String especialidad;
	private Date fecha;

	// Motivos
	private boolean motivoLimitada;
	private boolean motivoFaltaProfesional;
	private boolean motivoOtros;

	// Detalles clínicos
	private String resumen;
	private String hallazgos;

	// Relación con ficha médica
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_ficha_medica")
	private FichaMedica fichaMedica;

	// Diagnósticos relacionados
	@Transient
	private List<Diagnostico> diagnosticos;

	private static final long serialVersionUID = 1L;
}
