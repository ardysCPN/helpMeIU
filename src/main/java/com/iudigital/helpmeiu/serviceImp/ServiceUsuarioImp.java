package com.iudigital.helpmeiu.serviceImp;

import com.iudigital.helpmeiu.models.Usuario;
import com.iudigital.helpmeiu.repository.RepoUsuario;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceUsuarioImp {

    private RepoUsuario repoUsuario;

    public List<Usuario> getAllUsuarios() {
        return repoUsuario.findAll();
    }
}
