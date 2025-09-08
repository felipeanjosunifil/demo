package com.github.lipenathan.demo.repository;

import com.github.lipenathan.demo.repository.entity.DocumetoIdentificacao;
import com.github.lipenathan.demo.repository.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface DocumentoRepository extends CrudRepository<DocumetoIdentificacao, Long> {

}
