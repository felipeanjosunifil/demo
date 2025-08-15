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
        if (usuario.getDataNascimento().isEmpty()) {
            throw new Exception("Data de nascimento não pode ser vazia");
        }
        repositorio.adicionarUSuario(usuario);
    }

    public List<Usuario> listarUsuarios() {
        return repositorio.getUsuarios();
    }
}
