package br.com.provatassioVINICIUS.provatassio.model.repository;


import br.com.provatassioVINICIUS.provatassio.model.entity.Produto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;



public class ProdutoMappper implements RowMapper<Produto> {

    @Override
    public Produto mapRow(ResultSet resultSet, int i) throws SQLException {
        Produto produto = new Produto();
        produto.setId(resultSet.getInt("id"));
        produto.setNome(resultSet.getString("nome"));
        produto.setDescricao(resultSet.getString("descricao"));
        produto.setFotoUrl(resultSet.getString("foto_url"));
        produto.setDataCadastro(resultSet.getDate("data_cadastro").toLocalDate());
        produto.setHoraCadastro(resultSet.getTime("hora_cadastro").toLocalTime());
        produto.setDataHoraUltimaAtualizacao(resultSet.getTimestamp("data_hora_ultima_att"));
        produto.setValorUnitario(resultSet.getFloat("valor_unitario"));
        return produto;
    }
}
