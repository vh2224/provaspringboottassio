package br.com.provatassioVINICIUS.provatassio.model.entity;

import java.util.List;

public class Categoria {
    private Integer id;
    private String imagemSimboloUrl;
    private String nome;
    private String descricao;
    private List<Produto> produtoList;
    private Administrador responsavel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImagemSimboloUrl() {
        return imagemSimboloUrl;
    }

    public void setImagemSimboloUrl(String imagemSimboloUrl) {
        this.imagemSimboloUrl = imagemSimboloUrl;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Produto> getProdutoList() {
        return produtoList;
    }

    public void setProdutoList(List<Produto> produtoList) {
        this.produtoList = produtoList;
    }

    public Administrador getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Administrador responsavel) {
        this.responsavel = responsavel;
    }
}