package ista.sistemaClinica.model.entity;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "ficha_medica")
public class FichaMedica implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_fic;

    private String antecedentes_medicos_fic;
    private String discapacidad_fic;

    @ManyToOne
    @JoinColumn(name = "id_pac")
    private Paciente paciente;

    @Temporal(TemporalType.DATE)
    private Date fechaElaboracion;

    private static final long serialVersionUID = 1L;

    // Getters y Setters
}
