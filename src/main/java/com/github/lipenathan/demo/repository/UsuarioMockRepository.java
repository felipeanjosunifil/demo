package com.github.lipenathan.demo.repository;

import com.github.lipenathan.demo.repository.entity.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioMockRepository {
    private List<Usuario> usuarios = new ArrayList<>();
    private int ID = 0;

    public void salvarUsuario(Usuario usuario) {
        usuario.setId(++ID);
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
