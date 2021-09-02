package br.ufc.quixada.cc.poo.model;

public abstract class Cliente extends Pessoa {

	private String endereço;
	
	public Cliente(){
		
	}
	public Cliente(String nome, String endereço){
		super(nome);
		this.endereço = endereço;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public String toString(){
		super.toString();
		String modelo="";
		modelo = "Endereço:"+this.endereço;
		return modelo;
	}
}
