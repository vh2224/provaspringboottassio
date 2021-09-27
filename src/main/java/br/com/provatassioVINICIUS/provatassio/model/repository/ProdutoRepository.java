package br.com.provatassioVINICIUS.provatassio.model.repository;

import br.com.provatassioVINICIUS.provatassio.model.entity.Categoria;
import br.com.provatassioVINICIUS.provatassio.model.entity.Produto;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {

    private JdbcTemplate jdbcTemplate;

    public ProdutoRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public ArrayList<Produto> buscarProdutoFiltrado(String nome, Float valorMinimo, Float valorMaximo) throws Exception {
       String sql = "SELECT * FROM PRODUTO WHERE nome = ? AND valor_unitario >= ? AND valor_unitario <= ?";
       ArrayList<Produto> procurar = (ArrayList<Produto>) jdbcTemplate.query(sql, new Object[]{nome, valorMinimo, valorMaximo}, new ProdutoMappper());

        if(procurar.size() > 0) {
             return (ArrayList<Produto>) jdbcTemplate.query(sql, new Object[]{nome, valorMinimo, valorMaximo}, new ProdutoMappper());
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
            for(Categoria categoria : produto.getCategoriaList()) {
                String sql2 = "INSERT INTO produto_categoria(id, produto_id, categoria_id) VALUES(?, ?, ?)";
                jdbcTemplate.update(sql2, 4, produto.getId(), categoria.getId());
            }

            List<Categoria> categoriaList = jdbcTemplate.query("SELECT c.* FROM CATEGORIA c, PRODUTO p, PRODUTO_CATEGORIA pc WHERE p.id = pc.produto_id AND c.id = pc.categoria_id AND produtoId = ?",
                    new CategoriaMapper(), produto.getId()
            );

            produto.setCategoriaList(categoriaList);

            return produto;
        }

        throw new Exception("PRODUTO NÃO INSERIDO");
    }

}

