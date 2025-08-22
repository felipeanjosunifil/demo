package com.github.lipenathan.demo.service;

import com.github.lipenathan.demo.repository.entity.Usuario;

import java.util.List;

public interface UsuarioService {
    void adicionarUsuario(Usuario usuario) throws Exception;
    List<Usuario> listarUsuarios();
}
