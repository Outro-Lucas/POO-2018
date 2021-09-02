package br.ufc.quixada.cc.model;

public class Quadrado extends Figura{

	private int lados;
	public Quadrado(String cor ,int lados){
		
		super(cor);
		this.lados = lados;
		
	}
	public int getLados() {
		return lados;
	}
	public Quadrado(){
		super();
	}
	public void setLados(int lados) {
		this.setLados(lados);
	}
	
	public int perimetroQ(int lados){
		int p= this.lados*4;
		return p;
	}
	public int areaQ(int lados){
		int a= this.lados*this.lados;
		return a;
	}
}
