package ista.sistemaClinica.model.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "instituto")
public class Instituto implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_ins;

    private String nombre_ins;
    private String titulo_ins;
    private String direccion_ins;
    private String rector_ins;

    private static final long serialVersionUID = 1L;

    // Getters y Setters
}
