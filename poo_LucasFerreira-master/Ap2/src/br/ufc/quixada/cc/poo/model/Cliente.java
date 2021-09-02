package br.ufc.quixada.cc.poo.model;

public abstract class Cliente extends Pessoa {

	private String enderešo;
	
	public Cliente(){
		
	}
	public Cliente(String nome, String enderešo){
		super(nome);
		this.enderešo = enderešo;
	}
	public String getEnderešo() {
		return enderešo;
	}
	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}
	public String toString(){
		super.toString();
		String modelo="";
		modelo = "Enderešo:"+this.enderešo;
		return modelo;
	}
}
