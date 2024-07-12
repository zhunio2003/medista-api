package ista.sistemaClinica.model.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "categoria_enfermedad_diagnostico")
public class CategoriaEnfermedadDiagnostico implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_ced;

    @ManyToOne
    @JoinColumn(name = "id_categoriaEnfer")
    private CategoriasEnfermedades categoriaa_enfermedades_ced;

    @ManyToOne
    @JoinColumn(name = "id_diagnostico")
    private Diagnostico diagnostico_ced;

    private static final long serialVersionUID = 1L;

    // Getters y Setters
}
