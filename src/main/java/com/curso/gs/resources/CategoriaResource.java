package com.curso.gs.resources;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController; /*apertar ctrl shif O*/

import com.curso.gs.Services.CategoriaService;
import com.curso.gs.domain.Categoria;

@RestController /*apertar ctrl shif O para fazer importaçao automoatica*/
@RequestMapping (value="/categorias") /*ending point*/
public class CategoriaResource {
	
	@Autowired //acessa categoriaService
	private CategoriaService service;
	
	
	@RequestMapping(value="/(id)",method=RequestMethod.GET)
	public ResponseEntity <?>find(@PathVariable Integer id) {
		Categoria obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	
}
	
}
