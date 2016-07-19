package br.com.caelum.estoque.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService(endpointInterface = "br.com.caelum.estoque.ws.EstoqueWS", serviceName = "EstoqueWS", portName = "EstoqueWSPort")
public class EstoqueWSImpl implements EstoqueWS {

	@Override
	public ListaItens todosOsItens() {
		List<Item> itens = new ArrayList<>();
		Item livro = new Item();
		livro.setCodigo("123");
		livro.setNome("Alura");
		livro.setQuantidade(1);
		livro.setTipo("Livro");
		itens.add(livro);
		ListaItens lista = new ListaItens(itens);
		return lista;
	}

	@Override
	public ListaItens todosOsItens2(Filtros filtros) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CadastrarItemResponse cadastrarItem(CadastrarItem parameters, TokenUsuario token)
			throws AutorizacaoException {
		// TODO Auto-generated method stub
		return new CadastrarItemResponse();
	}

	@Override
	public List<Item> todosOsItens3() {
		// TODO Auto-generated method stub
		return null;
	}

}
