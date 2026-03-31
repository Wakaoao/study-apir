package br.com.fiap.study_apir.repository;

import br.com.fiap.study_apir.model.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RepositoryProdutoMockup {

    private List<Produto> produtos = new ArrayList<>();

    public RepositoryProdutoMockup() {

        Produto produto = new Produto();

        produto.setId(1L);
        produto.setNome("Maçã");

        produtos.add(produto);

    }

    public List<Produto> findAll() {

        return produtos;

    }

    public Optional<Produto> findById(Long id) {

        return produtos.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();

    }

}
