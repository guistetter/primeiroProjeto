package com.curso.gs.resources;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController; /*apertar ctrl shif O*/

import com.curso.gs.domain.Categoria;

@RestController /*apertar ctrl shif O para fazer importaçao automoatica*/
@RequestMapping (value="/categorias") /*ending point*/
public class CategoriaResource {
	
	@RequestMapping(method=RequestMethod.GET)
public List<Categoria> listar() {
		Categoria cat1 = new Categoria(1,"Informatica");
		Categoria cat2 = new Categoria(2,"Escritorio");
		List<Categoria> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
	return lista;
}
	
}
