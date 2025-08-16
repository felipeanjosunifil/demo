package com.github.lipenathan.demo.repository;

import com.github.lipenathan.demo.Usuario;

import java.util.ArrayList;
import java.util.List;

public class MockRepository {
    private List<Usuario> usuarios = new ArrayList<Usuario>();
    private int ID = 0;

    public void salvarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Usuario> buscarTodosUsuarios() {
        return usuarios;
    }

    public boolean apagarUsuarioPorId(int id) {
        return usuarios.removeIf(usuario -> {
            return usuario.getId() == id;
        });
    }
}
