package com.medista.api.entity;

import lombok.Data;

@Data
public class Diagnostico {
	private Enfermedad enfermedad;
	private String descripcion;
	private String estado; // "Presuntivo" o "Definitivo"

	@Data
	public static class Enfermedad {
		private String codigo;
		private String nombre;
	}
}
