package com.vendasapi.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vendasapi.domain.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {}
