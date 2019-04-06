package br.com.etechoracio.avaliacao.model;

public abstract class BaseORM {
	public abstract Long getId();
	public abstract void setId(Long id);
	
	public abstract String getNome();
	public abstract void setNome(String nome);
}
