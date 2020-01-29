package br.org.fernanda.vitrinevirtual.dao;

import org.springframework.data.repository.CrudRepository;

import br.org.fernanda.vitrinevirtual.model.Produto;

public interface ProdutoRepo extends CrudRepository<Produto, Integer> {
	// aqui podem vir outros métodos

}
