package com.github.lipenathan.demo.model;

import java.util.List;

/**
 * Interface responsável por criar contratos de repositório de usuário
 */
public interface RepositorioUsuario {
    public void criarNovoUsuario(Usuario usuario);

    public List<Usuario> buscarTodos();

    public Boolean apagarTodos();

    public Boolean apagarPorId(int id);

    public List<Usuario> buscar(String nome, String email);
}
