package br.com.caelum.livraria.webservices;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.caelum.livraria.dao.LivroDao;
import br.com.caelum.livraria.modelo.Livro;

@WebService
@Stateless
public class LivrariaWS {
	
	@Inject private LivroDao livroDao;

	@WebResult(name = "autores")
	public List<Livro> getLivrosPeloNome(@WebParam(name = "titulo") String nome) {
		System.out.println("LivrariaWS: procurando pelo nome: " + nome);
		return livroDao.getLivrosPeloNome(nome);
	}
}
