package atividade.gustavo;

import  java.util.Date;

public class Produto {
	private Integer id = 1;
	private String nome;
	private String preco;
	private Date data;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Produto(String nome, String preco, Date data) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.data = data;
	}
	public Produto() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	

}
