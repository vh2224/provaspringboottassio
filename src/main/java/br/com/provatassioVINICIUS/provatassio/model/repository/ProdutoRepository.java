package br.com.provatassioVINICIUS.provatassio.model.repository;

import br.com.provatassioVINICIUS.provatassio.model.entity.Produto;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {

    private JdbcTemplate jdbcTemplate;

    public ProdutoRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public ArrayList<Produto> buscarPorNome(String nome) throws Exception {
       String sql = "SELECT * FROM produto WHERE nome = ?";
       ArrayList<Produto> procurar = (ArrayList<Produto>) jdbcTemplate.query(sql, new Object[]{nome}, new ProdutoMappper());

        if(procurar.size() > 0) {
             return (ArrayList<Produto>) jdbcTemplate.query(sql, new Object[]{nome}, new ProdutoMappper());
        }

        throw new Exception("NENHUM PRODUTO ENCONTRADO");
        
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

