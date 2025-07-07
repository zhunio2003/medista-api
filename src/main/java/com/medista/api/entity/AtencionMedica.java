package com.medista.api.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Data
@Document(collection = "atenciones_medicas")
public class AtencionMedica {

	@Id
	private String id;

	@Field("motivo_ate")
	private String motivoAte;

	@Field("enfermedad_actual_ate")
	private String enfermedadActualAte;

	@Field("tratamiento_ate")
	private String tratamientoAte;

	@Field("fecha_atencion_ate")
	private Date fechaAtencionAte;

	// ✅ EMBEBIDO: EmbarazoActual (como SignoVital)
	@Field("embarazo_actual")
	private EmbarazoActual embarazoActual = new EmbarazoActual();

	@Field("signos_vitales")
	private SignoVital signosVitales = new SignoVital();

	@Field("examen_fisico")
	private ExamenFisico examenFisico = new ExamenFisico();

	@Field("examenes_complementarios")
	private List<ExamenComplementario> examenesComplementarios;

	private List<Diagnostico> diagnosticos;

	private DoctorRef doctor = new DoctorRef();

	@Field("ficha_medica")
	private FichaMedicaRef fichaMedica = new FichaMedicaRef();

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