package br.ufc.quixada.cc.model;

public class Retangulo extends Figura {

	private int lado;
	private int altura;
	
	public Retangulo(String cor, int lado, int altura){
		super(cor);
		this.setLados(lado);
		this.setAltura(altura);
	}
	public Retangulo (){
		super();
	}
	public int getLados() {
		return lado;
	}
	public void setLados(int lado) {
		this.lado = lado;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public int areaR(int lado, int altura){
		int a = this.altura * this.lado;
		return a;
	}
	public int perimetroR(int lado, int altura){
		int p = 2* (this.altura + this.lado);
		return p;
	}
}
