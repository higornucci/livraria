package br.com.caelum.livraria.bean;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import br.com.caelum.livraria.modelo.Autor;

@Model
public class AutorBean {
	
	@Inject private AutorService autorService;
	private Autor autor = new Autor();
	
	public Autor getAutor() {
		return autor;
	}
	
	public void cadastra() {
		this.autorService.adicionar(autor);
		this.autor = new Autor();
	}
	
	public List<Autor> getAutores() {
		return this.autorService.todosAutores();
	}
}
