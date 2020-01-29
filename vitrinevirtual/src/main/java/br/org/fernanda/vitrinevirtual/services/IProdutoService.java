package br.org.fernanda.vitrinevirtual.services;

import java.util.List;

import br.org.fernanda.vitrinevirtual.model.Produto;

public interface IProdutoService {
	public List<Produto> recuperarTodos();
	public Produto recuperarPorId(int id);
	
}
