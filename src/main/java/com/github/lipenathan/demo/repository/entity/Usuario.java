package com.github.lipenathan.demo.repository.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String dataNascimento;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "documento_id")
    private DocumentoIdentificacao documento;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id")
    private List<Contato> contatos;

    public Usuario(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public Usuario() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DocumentoIdentificacao getDocumento() {
        return documento;
    }

    public void setDocumento(DocumentoIdentificacao documento) {
        this.documento = documento;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                '}';
    }
}
