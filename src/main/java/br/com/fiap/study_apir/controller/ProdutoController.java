package br.com.fiap.study_apir.controller;

import br.com.fiap.study_apir.model.Produto;
import br.com.fiap.study_apir.repository.RepositoryProdutoMockup;
import jakarta.validation.ReportAsSingleViolation;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/${api.version}/produtos")
public class ProdutoController {

    private RepositoryProdutoMockup mockup = new RepositoryProdutoMockup();

    @PostMapping
    public ResponseEntity<String> create() {

        return ResponseEntity.status(HttpStatus.CREATED).body("Produto criado");

    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> findById(@PathVariable Long id) {

        return mockup.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());

    }

    @GetMapping
    public ResponseEntity<List<Produto>> findAll() {

        return ResponseEntity.ok(mockup.findAll());

    }

    @PutMapping
    public ResponseEntity<String> update() {

        return ResponseEntity.ok("Produto atualizado");

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {

        if (mockup.deleteById(id)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }

    }

}
