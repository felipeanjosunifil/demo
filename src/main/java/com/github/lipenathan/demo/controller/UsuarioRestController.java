package com.github.lipenathan.demo.controller;

import com.github.lipenathan.demo.Usuario;
import com.github.lipenathan.demo.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("usuarios/")
public class UsuarioRestController {

    private UsuarioService servico = new UsuarioService();

    @PostMapping("novo")
    public void novoUsuario(@RequestBody Usuario usuario) throws Exception {
        servico.adicionarUsuario(usuario);
    }

    @GetMapping("todos")
    public List<Usuario> getUsuarios() {
        return servico.listarUsuarios();
    }

    @DeleteMapping("apagar/{id}")
    public Boolean apagarUSuario(@PathVariable int id) {
       return false;
    }
}
