package ista.sistemaClinica.model.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "categoria_enfermedades")
public class CategoriasEnfermedades implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_cat;

    private String nombred_cat;
    private String tipod_cat;
    private String disciplinad_cat;
    private String sintomasd_cat;

    private static final long serialVersionUID = 1L;

    // Getters y Setters
}
