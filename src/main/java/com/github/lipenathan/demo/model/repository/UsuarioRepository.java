package com.github.lipenathan.demo.model.repository;

import com.github.lipenathan.demo.model.entity.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}
