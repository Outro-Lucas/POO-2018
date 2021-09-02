package br.ufc.quixada.cc.model;

public class Circulo extends Figura{

	private double raio;
	public Circulo(String cor , double raio){
		super(cor);
		this.raio=raio;
		
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public double areaC(double raio){
		double a = (3.14*(this.raio * this.raio));
		return a;
	}
	public double perimetroC(double raio){
		double p = (2*3.14)*this.raio;
		return p;
	}
}
