package com.medista.api.entity;

import lombok.Data;

@Data
public class SignoVital {
	private String presionArterial; // PA
	private String peso;
	private String talla;
	private String imc;
	private String frecuenciaCardiaca; // FC
	private String frecuenciaRespiratoria; // FR
	private String temperatura; // T°
	private String saturacionOxigeno; // Sat.O2
	private String llenadoCapilar;
	private String reaccionPupilar;

	// Glasgow
	private int glasgowOcular;
	private int glasgowVerbal;
	private int glasgowMotora;
	private int glasgowTotal;
}
