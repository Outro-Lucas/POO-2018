package br.ufc.quixada.cc.poo.model;

public abstract class Cliente extends Pessoa {

	private String endere�o;
	
	public Cliente(){
		
	}
	public Cliente(String nome, String endere�o){
		super(nome);
		this.endere�o = endere�o;
	}
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	public String toString(){
		super.toString();
		String modelo="";
		modelo = "Endere�o:"+this.endere�o;
		return modelo;
	}
}
