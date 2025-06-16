package com.medista.api.entity;

import lombok.Data;

@Data
public class ExamenFisico {
	private String pielFaneras;
	private String cabeza;
	private String cuello;
	private String torax;
	private String corazon;
	private String abdomen;
	private String regionInguinal;
	private String miembrosSuperiores;
	private String miembrosInferiores;
}
