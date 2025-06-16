package com.medista.api.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "atenciones_medicas")
public class AtencionMedica {

	@Id
	private String id;

	private String motivoAte;
	private String enfermedadActualAte;
	private String tratamientoAte;
	private Date fechaAtencionAte;
	private boolean embarazada;
	private EmbarazoActual embarazoActual;

	private SignoVital signosVitales;
	private ExamenFisico examenFisico;
	private List<ExamenComplementario> examenesComplementarios;
	private List<Diagnostico> diagnosticos;

	private DoctorRef doctor;
	private FichaMedicaRef fichaMedica;

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

	@Data
	public static class EmbarazoActual {
		private Date fum;
		private Fpp fpp;
		private String controles;
		private String inmunizaciones;
		private String observaciones;

		@Data
		public static class Fpp {
			private String fecha; // yyyy-MM-dd
			private int dia;
			private int mes;
			private int anio;
			private int sg;
		}
	}
}
