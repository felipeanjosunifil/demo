package com.github.lipenathan.demo.service;

import com.github.lipenathan.demo.repository.entity.Usuario;
import com.github.lipenathan.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository repositorio;

    @Autowired
    public UsuarioService(UsuarioRepository repositorio) {
        this.repositorio = repositorio;
    }

    public void novo(Usuario usuario) throws Exception {

        if (usuario.getNome().isEmpty() || usuario.getNome() == null) {
            throw new Exception("O nome do usuário não pode ser vazio");
        }
        if (usuario.getSenha().isEmpty() || usuario.getSenha() == null) {
            throw new Exception("A senha do usuário não pode ser vazia");
        }

        repositorio.save(usuario);
    }

    public List<Usuario> todos() {
        ArrayList<Usuario> list = new ArrayList<>();
        Iterable<Usuario> result = repositorio.findAll();
        result.forEach(list::add);
        return list;
    }

    public Boolean apagar() {
        return false;
    }

    public Boolean apagarPorId(int id) {
        return false;
    }

    public List<Usuario> buscar(String nome, String email) {
        return new ArrayList<>();
    }
}
