package com.github.lipenathan.demo.repository;

import com.github.lipenathan.demo.repository.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    Usuario findByDataNascimento(String dataNascimento);
}
