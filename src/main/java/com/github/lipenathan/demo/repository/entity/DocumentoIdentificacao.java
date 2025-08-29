package com.github.lipenathan.demo.repository.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "doc_identificacao")
public class DocumentoIdentificacao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String tipo;
    private String documento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public DocumentoIdentificacao() {
    }
}
