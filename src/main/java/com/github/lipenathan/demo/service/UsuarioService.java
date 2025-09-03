package com.github.lipenathan.demo.service;

import com.github.lipenathan.demo.repository.UsuarioRepository;
import com.github.lipenathan.demo.repository.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    private UsuarioRepository repositorio;

    @Autowired
    public UsuarioService(UsuarioRepository repositorio) {
        this.repositorio = repositorio;
    }

    public void adicionarUsuario(Usuario usuario) throws Exception {
        if (usuario.getNome().isEmpty()) {
            throw new Exception("Nome não pode ser vazio");
        }

        repositorio.save(usuario);
    }

    public List<Usuario> buscarTodosUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        Iterable<Usuario> result = repositorio.findAll();

        result.forEach(usuarios::add);
        return usuarios;
    }

    public boolean apagarUsuarioPorId(Long id) {
        try {
            repositorio.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
