package org.alistabrasil.models;

public class InformacaoLegal {

    private int idInformacao;
    private String titulo;
    private String descricao;
    private String categoria;

    public InformacaoLegal(int idInformacao, String titulo, String categoria) {
        this.idInformacao = idInformacao;
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public int getIdInformacao() {
        return idInformacao;
    }

    public void setIdInformacao(int idInformacao) {
        this.idInformacao = idInformacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    } 
}