package com.curso.gs.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.gs.categories.repositories.CategoriaRepository;
import com.curso.gs.domain.Categoria;
import java.util.Optional;
@Service
public class CategoriaService {
	
	@Autowired //acessar o categoriaRepository
	private CategoriaRepository repo;
		
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
