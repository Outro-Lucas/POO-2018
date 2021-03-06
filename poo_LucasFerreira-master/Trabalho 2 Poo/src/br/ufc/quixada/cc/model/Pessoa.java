package br.ufc.quixada.cc.model;
public abstract class Pessoa {

	private String nome;
	private String enderešo;
	private String email;

	public Pessoa(){
		
	}
	
	public Pessoa(String nome, String enderešo, String email){
		this.setNome(nome);
		this.setEnderešo(enderešo);
		this.setEmail(email);
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString(){
		return"Nome: "+this.nome+"\n"+"Enderešo: "+this.enderešo+"\n"+"email"+this.email;
	}
}
