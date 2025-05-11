package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "t_cliente")
@Data
public class Cliente {

    @Id
    private String idCliente;

    private String apellidos;
    private String nombres;
    private String direccion;
    private String dni;
    private String telefono;
    private String movil;
}
