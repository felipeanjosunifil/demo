package com.github.lipenathan.demo.service;

import com.github.lipenathan.demo.repository.entity.Usuario;
import com.github.lipenathan.demo.repository.UsuarioMockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private UsuarioMockRepository repositorio;

    @Autowired
    public UsuarioService(UsuarioMockRepository repositorio) {
        this.repositorio = repositorio;
    }

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
