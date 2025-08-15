package com.github.lipenathan.demo.repository;

import com.github.lipenathan.demo.Usuario;

import java.util.ArrayList;
import java.util.List;

public class MockRepository {

    static List<Usuario> usuarios = new ArrayList<>();
    private int ID = 0;

    public void adicionarUSuario(Usuario usuario) {
        usuario.setId(++ID);
        usuarios.add(usuario);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public boolean apagarUsuario(int id) {
        return usuarios.removeIf(usuario -> usuario.getId() == id);
    }
}
