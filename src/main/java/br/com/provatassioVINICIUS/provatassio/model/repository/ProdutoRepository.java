package br.com.provatassioVINICIUS.provatassio.model.repository;

import br.com.provatassioVINICIUS.provatassio.model.entity.Produto;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ProdutoRepository {

    private JdbcTemplate jdbcTemplate;

    public ProdutoRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public Produto inserir(Produto produto) throws Exception {
        String sql = "insert into produto(id, nome, descricao, foto_url, data_cadastro, hora_cadastro, data_hora_ultima_att, valor_unitario) values (?,?,?,?,?,?,?,?)";
        int insert = jdbcTemplate.update(sql,
                produto.getId(),
                produto.getNome(),
                produto.getDescricao(),
                produto.getFotoUrl(),
                produto.getDataCadastro(),
                produto.getHoraCadastro(),
                produto.getDataHoraUltimaAtualizacao(),
                produto.getValorUnitario()
        );

        if(insert == 1) {
            return produto;
        }

        throw new Exception("PRODUTO NÃO INSERIDO");
    }

}

