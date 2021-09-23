package br.com.provatassioVINICIUS.provatassio.controller;

import br.com.provatassioVINICIUS.provatassio.model.entity.Produto;
import br.com.provatassioVINICIUS.provatassio.model.repository.ProdutoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    public ProdutoController(JdbcTemplate jdbcTemplate) {
        produtoRepository = new ProdutoRepository(jdbcTemplate);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Produto inserir(@RequestBody Produto produto) throws Exception {
        return produtoRepository.inserir(produto);
    }

}
