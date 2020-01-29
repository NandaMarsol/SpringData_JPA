package br.org.fernanda.vitrinevirtual.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.fernanda.vitrinevirtual.dao.ProdutoRepo;
import br.org.fernanda.vitrinevirtual.model.Produto;

@Component
public class ProdutoServiceImpl implements IProdutoService {

	@Autowired      	// aqui nós declaramos a interface do DAO que criamos
	private ProdutoRepo repo; // e a anotação AutoWired busca uma implementação dentro JPA

	
	@Override
	public List<Produto> recuperarTodos() {
		// isso aqui corresponde a um: 
		// select * from tblproduto 
		// inner join tbldepartamento 
		// on tbl.produto._depto_id = departamento.id
		return (List<Produto>)repo.findAll();
	}

	@Override
	public Produto recuperarPorId(int id) {
		return repo.findById(id).orElse(null); // ou no lugar de get usar .orElse(null) que te retorna o erro 404 
	}
	
	
}
