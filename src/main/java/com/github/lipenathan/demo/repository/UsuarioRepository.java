package com.github.lipenathan.demo.repository;

import com.github.lipenathan.demo.repository.entity.Usuario;

import java.util.List;

public interface UsuarioRepository {
    void adicionarUsuario(Usuario usuario);

    List<Usuario> getUsuarios();

    boolean apagarUsuario(int id);
}
