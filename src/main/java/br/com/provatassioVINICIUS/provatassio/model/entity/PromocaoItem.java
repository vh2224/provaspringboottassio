package br.com.provatassioVINICIUS.provatassio.model.entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class PromocaoItem {
    private Integer id;
    private Float valorPromocao;
    private LocalDate dataCadastro;
    private LocalDate dataUltimaAtualizacao;
    private Produto produto;
    private TabelaPromocao tabelaPromocao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getValorPromocao() {
        return valorPromocao;
    }

    public void setValorPromocao(Float valorPromocao) {
        this.valorPromocao = valorPromocao;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    public void setDataUltimaAtualizacao(LocalDate dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public TabelaPromocao getTabelaPromocao() {
        return tabelaPromocao;
    }

    public void setTabelaPromocao(TabelaPromocao tabelaPromocao) {
        this.tabelaPromocao = tabelaPromocao;
    }
}