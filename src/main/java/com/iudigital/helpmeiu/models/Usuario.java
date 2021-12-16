package com.iudigital.helpmeiu.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "usuarios")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, length = 120, unique = true)
    private String username;
    @Column(nullable = false, length = 120)
    private String password;
    @Column(nullable = false, length = 120)
    private String nombre;
    @Column(length = 120)
    private String apellido;
    private LocalDate fecha_nacimiento;
    private boolean enabled;
    private boolean red_social;
    private String image;

    @ManyToMany
    @JoinTable(
            name = "roles_usuarios",
            joinColumns = @JoinColumn(name = "usuarios_id"),
            inverseJoinColumns = @JoinColumn(name = "roles_id"))
    private List<Roles> roles_usuarios;

}
