package com.github.lipenathan.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("usuarios/")
public class UsuarioController {

    private List<Usuario> usuarios = new ArrayList<Usuario>();
    private int ID = 0;

    @PostMapping("novo")
    public void novoUsuario(@RequestBody Usuario usuario) {
        usuario.setId(++ID);
        usuarios.add(usuario);
        System.out.println(usuarios);
    }

    @GetMapping("todos")
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    @DeleteMapping("apagar/{id}")
    public boolean apagarUsuario(@PathVariable int id) {
        return usuarios.removeIf(usuario -> {
            return usuario.getId() == id;
        });
    }
}
