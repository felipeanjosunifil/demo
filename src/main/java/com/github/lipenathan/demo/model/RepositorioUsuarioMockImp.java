package com.github.lipenathan.demo.model;

import com.github.lipenathan.demo.model.entity.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Componente responsável por implementar contratos de reposítório de usuário de forma estática.
 */
@Repository
public class RepositorioUsuarioMockImp implements RepositorioUsuario {
    private List<Usuario> TODOS_USUARIOS = new ArrayList<>();
    private int ID_USUARIO = 0;

    //region implementação do métodos

    public void criarNovoUsuario(Usuario usuario) {
        usuario.setId(++ID_USUARIO);
        TODOS_USUARIOS.add(usuario);
    }

    public List<Usuario> buscarTodos() {
        return TODOS_USUARIOS;
    }

    public Boolean apagarTodos() {
        if (TODOS_USUARIOS.isEmpty()) {
            return false;
        } else {
            TODOS_USUARIOS = new ArrayList<>();
            return true;
        }
    }

    public Boolean apagarPorId(int id) {
        if (TODOS_USUARIOS.isEmpty()) {
            return false;
        } else {
            TODOS_USUARIOS.removeIf(usuario -> usuario.getId() == id);
            return true;
        }
    }

    public List<Usuario> buscar(String nome, String email) {
        return TODOS_USUARIOS.stream().filter(usuario ->
                usuario.getNome().contains(nome) || usuario.getEmail().contains(email)).toList();
    }

    //endregion
}
