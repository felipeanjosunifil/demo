package com.github.lipenathan.demo.service;

import com.github.lipenathan.demo.repository.UsuarioRepository;
import com.github.lipenathan.demo.repository.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioServiceImpl {

    private UsuarioRepository repositorio;

    @Autowired
    public UsuarioServiceImpl(UsuarioRepository repositorio) {
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
        repositorio.save(usuario);
    }

    public List<Usuario> listarUsuarios() {
        ArrayList<Usuario> list = new ArrayList<>();
        Iterable<Usuario> result = repositorio.findAll();
        result.forEach(list::add);
        return list;
    }

    public Boolean apagarPeloId(Long id) {
        try {
            repositorio.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
