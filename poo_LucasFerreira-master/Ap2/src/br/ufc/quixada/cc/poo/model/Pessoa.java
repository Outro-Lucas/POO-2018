package br.ufc.quixada.cc.poo.model;

public abstract class Pessoa {
	private String nome;
	
	public Pessoa(){
		
	}
	public Pessoa(String nome){
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String toString(){
		String modelo="";
		modelo = "Nome:"+this.nome;
		return modelo;
	}
}
