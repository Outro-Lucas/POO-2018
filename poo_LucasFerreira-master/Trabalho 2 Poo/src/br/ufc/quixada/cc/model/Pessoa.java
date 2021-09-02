package br.ufc.quixada.cc.model;
public abstract class Pessoa {

	private String nome;
	private String endereço;
	private String email;

	public Pessoa(){
		
	}
	
	public Pessoa(String nome, String endereço, String email){
		this.setNome(nome);
		this.setEndereço(endereço);
		this.setEmail(email);
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString(){
		return"Nome: "+this.nome+"\n"+"Endereço: "+this.endereço+"\n"+"email"+this.email;
	}
}
