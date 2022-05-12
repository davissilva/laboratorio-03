package com.example.demo.model;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
//@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "login", "isActive" }) })
public class Aluno extends Usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column(unique=true)
    private String login;

    private String nome;

    private String email;

    private String cpf;

    private String curso;

    private String instituicao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public void update(Aluno alunoAtualizado) {
        this.cpf = alunoAtualizado.getCpf();
        this.curso = alunoAtualizado.getCurso();
        this.email = alunoAtualizado.getEmail();
        this.instituicao = alunoAtualizado.getInstituicao();
        this.setLogin(alunoAtualizado.getLogin());
        this.setSenha(alunoAtualizado.getSenha());
        this.nome = alunoAtualizado.getNome();
    }
}