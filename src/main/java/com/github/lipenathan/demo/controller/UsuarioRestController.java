package com.github.lipenathan.demo.controller;

import com.github.lipenathan.demo.repository.entity.Usuario;
import com.github.lipenathan.demo.service.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("usuarios/")
public class UsuarioRestController {

    private UsuarioServiceImpl servico;

    @Autowired
    public UsuarioRestController(UsuarioServiceImpl servico) {
        this.servico = servico;
    }

    @PostMapping("novo")
    public void novoUsuario(@RequestBody Usuario usuario) throws Exception {
        servico.adicionarUsuario(usuario);
    }

    @GetMapping("todos")
    public List<Usuario> getUsuarios() {
        return servico.listarUsuarios();
    }

    @DeleteMapping("apagar/{id}")
    public Boolean apagarUSuario(@PathVariable Long id) {
       return servico.apagarPeloId(id);
    }
}
