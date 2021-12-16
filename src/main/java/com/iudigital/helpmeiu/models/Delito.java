package com.iudigital.helpmeiu.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "delitos")
@AllArgsConstructor
@NoArgsConstructor
public class Delito {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 45)
    private String nombre;
    private String descripcion;

    @OneToOne
    @JoinColumn(name = "usuarios_id")
    private Usuario usuario;
}
