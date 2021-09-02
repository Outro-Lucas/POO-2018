package br.ufc.quixada.cc.model;
public abstract class Pessoa {

	private String nome;
	private String endere�o;
	private String email;

	public Pessoa(){
		
	}
	
	public Pessoa(String nome, String endere�o, String email){
		this.setNome(nome);
		this.setEndere�o(endere�o);
		this.setEmail(email);
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString(){
		return"Nome: "+this.nome+"\n"+"Endere�o: "+this.endere�o+"\n"+"email"+this.email;
	}
}
