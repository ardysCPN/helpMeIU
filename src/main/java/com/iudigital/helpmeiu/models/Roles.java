package com.iudigital.helpmeiu.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "roles")
@Data
@AllArgsConstructor @NoArgsConstructor
public class Roles {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 20, unique = true)
    private String nombre;
    private String descripcion;

    @ManyToMany
    private List<Usuario> usuarios;
}
