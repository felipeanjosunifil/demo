package com.github.lipenathan.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoRestController {

    private List<Usuario> usuarios = new ArrayList<Usuario>();

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }

    @PostMapping("usuarios/novo")
    public void novoUsuario(@RequestBody Usuario usuario) {
        usuarios.add(usuario);
        System.out.println(usuarios);
    }

    @GetMapping("usuarios/todos")
    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}
