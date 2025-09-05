package com.github.lipenathan.demo.repository.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "doc_identificacao")
public class DocumentoIdentificacao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String documento;
    private String tipo;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "documento")
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
