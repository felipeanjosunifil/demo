package com.github.lipenathan.demo.controller;

import com.github.lipenathan.demo.Usuario;
import com.github.lipenathan.demo.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("usuarios/")
public class UsuarioController {

    private UsuarioService usuarioService = new UsuarioService();

    @PostMapping("novo")
    public void novoUsuario(@RequestBody Usuario usuario) throws Exception {
        usuarioService.adicionarUsuario(usuario);
    }

    @GetMapping("todos")
    public List<Usuario> getUsuarios() {
        return usuarioService.buscarTodosUsuarios();
    }

    @DeleteMapping("apagar/{id}")
    public boolean apagarUsuario(@PathVariable int id) {
        return usuarioService.apagarUsuarioPorId(id);
    }
}
