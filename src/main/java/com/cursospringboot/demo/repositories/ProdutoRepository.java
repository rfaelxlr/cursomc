package com.cursospringboot.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursospringboot.demo.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
