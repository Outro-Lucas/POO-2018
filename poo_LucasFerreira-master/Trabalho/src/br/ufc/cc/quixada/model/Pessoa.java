package br.ufc.cc.quixada.model;

public class Pessoa {

	private String nome;
	private String endere�o;
	private String telefone;
	
	public Pessoa(String nome, String endere�o, String telefone){
		this.setNome(nome);
		this.setEndere�o(endere�o);
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
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void mostraP(){
		System.out.println("Nome = "+this.nome);
		System.out.println("Endere�o = "+this.endere�o);
		System.out.println("Telefone = "+this.telefone);
	}
}
