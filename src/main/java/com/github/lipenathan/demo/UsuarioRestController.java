package com.github.lipenathan.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping("usuarios/")
public class UsuarioRestController {

    static List<Usuario> usuarios = new ArrayList<>();

    @PostMapping("novo")
    public void novoUsuario(@RequestBody Usuario usuario) {
        usuarios.add(usuario);
        System.out.println(usuarios);
    }

    @GetMapping("todos")
    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}
