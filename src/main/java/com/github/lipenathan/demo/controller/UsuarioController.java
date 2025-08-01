package com.github.lipenathan.demo.controller;

import com.github.lipenathan.demo.business.UsuarioProcessos;
import com.github.lipenathan.demo.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("usuarios/")
public class UsuarioController {

    private final UsuarioProcessos processos;

    @Autowired
    public UsuarioController(UsuarioProcessos processos) {
        this.processos = processos;
    }

    @PostMapping("novo")
    private void novo(@RequestBody Usuario usuario) throws Exception {
        processos.novo(usuario);
    }

    @GetMapping("todos")
    private List<Usuario> todos() {
        return processos.todos();
    }

    @DeleteMapping("limpar")
    private Boolean apagar() {
        return processos.apagar();
    }

    @DeleteMapping("apagar/{id}")
    private Boolean apagarPorId(@PathVariable("id") int id) {
        return processos.apagarPorId(id);
    }

    @GetMapping("buscar")
    private List<Usuario> buscar(@RequestParam("nome") String nome, @RequestParam("email") String email) {
        return processos.buscar(nome, email);
    }
}
