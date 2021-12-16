package com.iudigital.helpmeiu.repository;

import com.iudigital.helpmeiu.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoUsuario extends JpaRepository<Usuario, Long> {
}
