package com.medista.api.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "ficha_medica")
@Data
public class FichaMedica implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @OneToOne()
    @JoinColumn(name = "fk_id_pac")
    private Paciente paciente;

    @OneToOne()
    @JoinColumn(name = "fk_id_dis")
    private Discapacidad discapacidad;

    @OneToOne()
    @JoinColumn(name = "fk_id_ant")
    private AntecedenteFamiliar antecedenteFamiliar;

    @Temporal(TemporalType.DATE)
    private Date fechaElaboracion;

    @Transient // No es un campo persistido en la base de datos
	private List<AtencionMedica> atencionesMedicas;

    @OneToOne()
    @JoinColumn(name = "fk_id_his")
    private HistorialGinecologico historialGinecologico;


    private static final long serialVersionUID = 1L;


}


