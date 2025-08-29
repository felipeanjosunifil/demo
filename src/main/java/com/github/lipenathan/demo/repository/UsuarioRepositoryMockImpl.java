package com.github.lipenathan.demo.repository;

import com.github.lipenathan.demo.repository.entity.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepositoryMockImpl {

    static List<Usuario> usuarios = new ArrayList<>();
    private int ID = 0;

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public boolean apagarUsuario(int id) {
        return usuarios.removeIf(usuario -> usuario.getId() == id);
    }
}