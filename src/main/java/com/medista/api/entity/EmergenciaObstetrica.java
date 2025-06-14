package com.medista.api.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "emergencia_obstetrica")
public class EmergenciaObstetrica implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_eme;

    private int menarca_eme;

    private String ritmo_menstrual_eme; 

    private String ciclos_eme; 

    @Temporal(TemporalType.DATE)
    private Date fum_eme;

    private Boolean ivsa_eme;

    @Column(name = "numero_parejas_sexuales_eme")
    private int numero_parejas_sexuales_eme;

    private int g_eme;
    private int a_eme;
    private int p_eme;
    private int c_eme;

    private Boolean dismenorrea_eme;
    private Boolean mastodinia_eme;

    @Temporal(TemporalType.DATE)
    private Date fpp_eme;

    private String controles_eme;
    private String inmunizaciones_eme;
    private String descripcion_eme;
    private Boolean isEmbarazada;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="fk_id_ficha_medica")
    private FichaMedica fichaMedica;


    // Serial version UID
    private static final long serialVersionUID = 1L;


	public Long getId_eme() {
		return id_eme;
	}


	public void setId_eme(Long id_eme) {
		this.id_eme = id_eme;
	}


	public int getMenarca_eme() {
		return menarca_eme;
	}


	public void setMenarca_eme(int menarca_eme) {
		this.menarca_eme = menarca_eme;
	}


	public String getRitmo_menstrual_eme() {
		return ritmo_menstrual_eme;
	}


	public void setRitmo_menstrual_eme(String ritmo_menstrual_eme) {
		this.ritmo_menstrual_eme = ritmo_menstrual_eme;
	}


	public String getCiclos_eme() {
		return ciclos_eme;
	}


	public void setCiclos_eme(String ciclos_eme) {
		this.ciclos_eme = ciclos_eme;
	}


	public Date getFum_eme() {
		return fum_eme;
	}


	public void setFum_eme(Date fum_eme) {
		this.fum_eme = fum_eme;
	}


	public Boolean getIvsa_eme() {
		return ivsa_eme;
	}


	public void setIvsa_eme(Boolean ivsa_eme) {
		this.ivsa_eme = ivsa_eme;
	}


	public int getNumero_parejas_sexuales_eme() {
		return numero_parejas_sexuales_eme;
	}


	public void setNumero_parejas_sexuales_eme(int numero_parejas_sexuales_eme) {
		this.numero_parejas_sexuales_eme = numero_parejas_sexuales_eme;
	}


	public int getG_eme() {
		return g_eme;
	}


	public void setG_eme(int g_eme) {
		this.g_eme = g_eme;
	}


	public int getA_eme() {
		return a_eme;
	}


	public void setA_eme(int a_eme) {
		this.a_eme = a_eme;
	}


	public int getP_eme() {
		return p_eme;
	}


	public void setP_eme(int p_eme) {
		this.p_eme = p_eme;
	}


	public int getC_eme() {
		return c_eme;
	}


	public void setC_eme(int c_eme) {
		this.c_eme = c_eme;
	}


	public Boolean getDismenorrea_eme() {
		return dismenorrea_eme;
	}


	public void setDismenorrea_eme(Boolean dismenorrea_eme) {
		this.dismenorrea_eme = dismenorrea_eme;
	}


	public Boolean getMastodinia_eme() {
		return mastodinia_eme;
	}


	public void setMastodinia_eme(Boolean mastodinia_eme) {
		this.mastodinia_eme = mastodinia_eme;
	}


	public Date getFpp_eme() {
		return fpp_eme;
	}


	public void setFpp_eme(Date fpp) {
		this.fpp_eme = fpp;
	}


	public String getControles_eme() {
		return controles_eme;
	}


	public void setControles_eme(String controles_eme) {
		this.controles_eme = controles_eme;
	}


	public String getInmunizaciones_eme() {
		return inmunizaciones_eme;
	}


	public void setInmunizaciones_eme(String inmunizaciones_eme) {
		this.inmunizaciones_eme = inmunizaciones_eme;
	}


	public String getDescripcion_eme() {
		return descripcion_eme;
	}


	public void setDescripcion_eme(String descripccion_eme) {
		this.descripcion_eme = descripccion_eme;
	}


	public FichaMedica getFichaMedica() {
		return fichaMedica;
	}


	public void setFichaMedica(FichaMedica fichaMedica) {
		this.fichaMedica = fichaMedica;
	}


	public Boolean getIsEmbarazada() {
		return isEmbarazada;
	}


	public void setIsEmbarazada(Boolean isEmbarazada) {
		this.isEmbarazada = isEmbarazada;
	}
    
}

