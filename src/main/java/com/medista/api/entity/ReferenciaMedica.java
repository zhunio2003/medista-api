package com.medista.api.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@Document(collection = "referencias_medicas")
public class ReferenciaMedica {

	@Id
	private String id;

	// Datos de doctor (referencia embebida)
	private DoctorRef doctor;

	// Datos de ficha médica (referencia embebida)
	private FichaMedicaRef fichaMedica;

	private String servicio;
	private String institucion;
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

	// Diagnósticos relacionados
	private List<Diagnostico> diagnosticos;

	@Data
	public static class DoctorRef {
		private Long id;
		private String nombre;
		private String cedula;
	}

	@Data
	public static class FichaMedicaRef {
		private Long id;
		private String paciente;
		private String cedula;
	}
}
