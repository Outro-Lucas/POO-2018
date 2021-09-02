package br.ufc.cc.quixada.model;

public class Pessoa {

	private String nome;
	private String enderešo;
	private String telefone;
	
	public Pessoa(String nome, String enderešo, String telefone){
		this.setNome(nome);
		this.setEnderešo(enderešo);
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
	public String getEnderešo() {
		return enderešo;
	}
	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void mostraP(){
		System.out.println("Nome = "+this.nome);
		System.out.println("Enderešo = "+this.enderešo);
		System.out.println("Telefone = "+this.telefone);
	}
}
