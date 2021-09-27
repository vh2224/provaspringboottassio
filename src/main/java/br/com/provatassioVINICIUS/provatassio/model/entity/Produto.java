package br.com.provatassioVINICIUS.provatassio.model.entity;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

public class Produto {
    private Integer id;
    private String nome;
    private String descricao;
    private String fotoUrl;
    private LocalDate dataCadastro;
    private LocalTime horaCadastro;
    private Timestamp dataHoraUltimaAtualizacao;
    private Float valorUnitario;
    private Administrador responsavel;
    private List<Categoria> categoriaList;
    private List<PromocaoItem> promocaoItemList;

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFotoUrl() {
        return fotoUrl;
    }

    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalTime getHoraCadastro() {
        return horaCadastro;
    }

    public void setHoraCadastro(LocalTime horaCadastro) {
        this.horaCadastro = horaCadastro;
    }

    public Timestamp getDataHoraUltimaAtualizacao() {
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        return timestamp;
    }

    public void setDataHoraUltimaAtualizacao(Timestamp dataHoraUltimaAtualizacao) {
        this.dataHoraUltimaAtualizacao = dataHoraUltimaAtualizacao;
    }

    public Float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Administrador getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Administrador responsavel) {
        this.responsavel = responsavel;
    }

    public List<Categoria> getCategoriaList() {
        return categoriaList;
    }

    public void setCategoriaList(List<Categoria> categoriaList) {
        this.categoriaList = categoriaList;
    }

    public List<PromocaoItem> getPromocaoItemList() {
        return promocaoItemList;
    }

    public void setPromocaoItemList(List<PromocaoItem> promocaoItemList) {
        this.promocaoItemList = promocaoItemList;
    }
}
