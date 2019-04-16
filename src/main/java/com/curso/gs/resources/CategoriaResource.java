package com.curso.gs.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController; /*apertar ctrl shif O*/

@RestController /*apertar ctrl shif O para fazer importaçao automoatica*/
@RequestMapping (value="/categorias") /*ending point*/
public class CategoriaResource {
	
	@RequestMapping(method=RequestMethod.GET)
public String listar() {
	return "rest Esta funcionando";
}
	
}
