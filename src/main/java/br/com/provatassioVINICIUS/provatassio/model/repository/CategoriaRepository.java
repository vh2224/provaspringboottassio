package br.com.provatassioVINICIUS.provatassio.model.repository;

import br.com.provatassioVINICIUS.provatassio.model.entity.Categoria;
import br.com.provatassioVINICIUS.provatassio.model.entity.Produto;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;

public class CategoriaRepository {

    private JdbcTemplate jdbcTemplate;

    public CategoriaRepository(JdbcTemplate jdbcTemplate) { this.jdbcTemplate = jdbcTemplate; }


    public Categoria inserir(Categoria categoria) throws Exception {
        String sql = "insert into categoria(id, imagem_simbolo_url, nome, descricao) values (?, ?, ?, ?)";
        int insert = jdbcTemplate.update(sql,
                categoria.getId(),
                categoria.getImagemSimboloUrl(),
                categoria.getNome(),
                categoria.getDescricao()
        );

        if(insert == 1) {
            return categoria;
        }

        throw new Exception("CATEGORIA NÃO INSERIDA");
    }

    public ArrayList<Produto> buscarProdutoPorCategoriaFiltrada(Integer id, String nome, Float valorMinimo, Float valorMaximo) throws Exception {
        String sql = "select p.*, pc.categoria_id FROM PRODUTO p INNER JOIN PRODUTO_CATEGORIA pc ON pc.produto_id = p.id WHERE pc.categoria_id = ? AND p.nome = ? AND p.valor_unitario >= ? AND p.valor_unitario <= ?";
        ArrayList<Produto> procurar = (ArrayList<Produto>) jdbcTemplate.query(sql, new Object[]{id, nome, valorMinimo, valorMaximo}, new ProdutoMappper());

        if(procurar.size() > 0) {
            return (ArrayList<Produto>) jdbcTemplate.query(sql, new Object[]{id, nome, valorMinimo, valorMaximo}, new ProdutoMappper());
        }

        throw new Exception("NENHUMA CATEGORIA ENCONTRADA");
    }

}
