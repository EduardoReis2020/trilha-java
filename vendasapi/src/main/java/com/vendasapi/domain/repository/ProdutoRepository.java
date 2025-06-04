package com.vendasapi.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vendasapi.domain.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    // Métodos adicionais de consulta podem ser definidos aqui, se necessário
    // Exemplo: List<Produto> findByNomeContaining(String nome);

}
