package br.com.mvcBean.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.mvcBean.model.Pessoa;

@Named("pessoaBean")
@SessionScoped
public class PessoaBean implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private Pessoa pessoa;
	
	List<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	public String adicionar() {
		pessoas.add(pessoa);
		pessoa = new Pessoa();
		System.out.println("Nome     Profissão");
		for (Pessoa pessoa:pessoas) {
			System.out.print(pessoa.getNome()+ "   ");
			System.out.println(pessoa.getProfissao());
		}
		return null;
	}


	public Pessoa getPessoa() {
		return pessoa;
	}


	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}


	public List<Pessoa> getPessoas() {
		return pessoas;
	}


	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	
	
	
}
