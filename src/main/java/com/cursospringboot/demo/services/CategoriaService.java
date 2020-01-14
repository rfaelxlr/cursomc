package com.cursospringboot.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursospringboot.demo.domain.Categoria;
import com.cursospringboot.demo.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(int id) {
		
		Optional<Categoria> obj = repo.findById(id);
		
		return obj.orElse(null);
		
	}
}
