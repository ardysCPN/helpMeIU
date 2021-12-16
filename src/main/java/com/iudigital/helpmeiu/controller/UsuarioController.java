package com.iudigital.helpmeiu.controller;

import com.iudigital.helpmeiu.models.Usuario;
import com.iudigital.helpmeiu.serviceImp.ServiceUsuarioImp;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/usuario")
@AllArgsConstructor
public class UsuarioController {

    private ServiceUsuarioImp serviceUsuarioImp;

    @GetMapping("/listar")
    public List<Usuario> getUsuarios() {
        return serviceUsuarioImp.getAllUsuarios();
    }
}
