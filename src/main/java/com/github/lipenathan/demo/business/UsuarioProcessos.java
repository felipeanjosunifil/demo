package com.github.lipenathan.demo.business;

import com.github.lipenathan.demo.model.RepositorioUsuario;
import com.github.lipenathan.demo.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioProcessos {

    private final RepositorioUsuario repositorio;

    public UsuarioProcessos(RepositorioUsuario repositorio) {
        this.repositorio = repositorio;
    }

    public void novo(Usuario usuario) throws Exception {

        if (usuario.getNome().isEmpty() || usuario.getNome() == null) {
            throw new Exception("O nome do usuário não pode ser vazio");
        }
        if (usuario.getEmail().isEmpty() || usuario.getEmail() == null) {
            throw new Exception("O e-mail do usuário não pode ser vazio");
        }
        if (usuario.getSenha().isEmpty() || usuario.getSenha() == null) {
            throw new Exception("A senha do usuário não pode ser vazia");
        }
        repositorio.criarNovoUsuario(usuario);
    }

    public List<Usuario> todos() {
        return repositorio.buscarTodos();
    }

    public Boolean apagar() {
        return repositorio.apagarTodos();
    }

    public Boolean apagarPorId(int id) {
        return repositorio.apagarPorId(id);
    }

    public List<Usuario> buscar(String nome, String email) {
        return repositorio.buscar(nome, email);
    }
}
