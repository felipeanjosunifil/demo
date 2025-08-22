package com.github.lipenathan.demo.service;

import com.github.lipenathan.demo.repository.UsuarioRepositoryMockImpl;
import com.github.lipenathan.demo.repository.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl {

    private UsuarioRepositoryMockImpl repositorio;

    @Autowired
    public UsuarioServiceImpl(UsuarioRepositoryMockImpl repositorio) {
        this.repositorio = repositorio;
    }

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
        repositorio.adicionarUsuario(usuario);
    }

    public List<Usuario> listarUsuarios() {
        return repositorio.getUsuarios();
    }
}
