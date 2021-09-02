package br.ufc.quixada.cc.model;

public abstract class Figura {

	private String cor;
	//private filled s;
	
	public Figura(){
	}
	
	public Figura(String cor){
		this.setCor(cor);
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
}
