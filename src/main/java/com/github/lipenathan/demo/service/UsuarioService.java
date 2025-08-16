package com.github.lipenathan.demo.service;

import com.github.lipenathan.demo.Usuario;
import com.github.lipenathan.demo.repository.MockRepository;

import java.util.List;

public class UsuarioService {

    private MockRepository repositorio = new MockRepository();

    public void adicionarUsuario(Usuario usuario) throws Exception {
        if (usuario.getNome().isEmpty()) {
            throw new Exception("Nome não pode ser vazio");
        }
        if (usuario.getEmail().isEmpty()) {
            throw new Exception("E-mail não pode ser vazio");
        }

        repositorio.salvarUsuario(usuario);
    }

    public List<Usuario> buscarTodosUsuarios() {
        return repositorio.buscarTodosUsuarios();
    }

    public boolean apagarUsuarioPorId(Integer id) {
        return repositorio.apagarUsuarioPorId(id);
    }
}
