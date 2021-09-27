package br.com.provatassioVINICIUS.provatassio.controller;

import br.com.provatassioVINICIUS.provatassio.model.entity.Categoria;
import br.com.provatassioVINICIUS.provatassio.model.entity.Produto;
import br.com.provatassioVINICIUS.provatassio.model.repository.CategoriaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    private CategoriaRepository categoriaRepository;

    public CategoriaController(JdbcTemplate jdbcTemplate) {
        categoriaRepository = new CategoriaRepository(jdbcTemplate);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Categoria inserir(@RequestBody Categoria categoria) throws Exception {
        return categoriaRepository.inserir(categoria);
    }

    @GetMapping("/{id}/produto")
    public List<Produto> buscarProdutoPorCategoriaFiltrada(@PathVariable Integer id, @RequestParam String nome, @RequestParam Float valorMinimo, @RequestParam Float valorMaximo) throws Exception {
        return categoriaRepository.buscarProdutoPorCategoriaFiltrada(id, nome, valorMinimo, valorMaximo);
    }

}