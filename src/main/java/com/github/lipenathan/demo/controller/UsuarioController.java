package com.github.lipenathan.demo.controller;

import com.github.lipenathan.demo.repository.entity.Usuario;
import com.github.lipenathan.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("usuarios/")
public class UsuarioController {

    private UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("novo")
    public void novoUsuario(@RequestBody Usuario usuario) throws Exception {
        usuarioService.adicionarUsuario(usuario);
    }

    @GetMapping("todos")
    public List<Usuario> getUsuarios() {
        return usuarioService.buscarTodosUsuarios();
    }

    @DeleteMapping("apagar/{id}")
    public boolean apagarUsuario(@PathVariable Long id) {
        return usuarioService.apagarUsuarioPorId(id);
    }
}
