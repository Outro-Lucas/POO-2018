package br.ufc.cc.quixada.model;

public class Pessoa {

	private String nome;
	private String endereço;
	private String telefone;
	
	public Pessoa(String nome, String endereço, String telefone){
		this.setNome(nome);
		this.setEndereço(endereço);
		this.setTelefone(telefone);
	}
	public Pessoa(){
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void mostraP(){
		System.out.println("Nome = "+this.nome);
		System.out.println("Endereço = "+this.endereço);
		System.out.println("Telefone = "+this.telefone);
	}
}
