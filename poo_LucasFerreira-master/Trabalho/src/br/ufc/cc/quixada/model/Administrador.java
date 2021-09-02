package br.ufc.cc.quixada.model;

public class Administrador extends Empregado {

	private double ajusteDeCusto;
	double saladmin;
	public Administrador(String nome, String endere�o, String telefone, int codigoSetor, 
			double salarioBase, double imposto, double ajusteDeCusto){
		super(nome, endere�o, telefone, 
				codigoSetor, salarioBase, imposto);
		this.setAjusteDeCusto(ajusteDeCusto);
	}
	public Administrador(){
		super();
	}
	public double getAjusteDeCusto() {
		return ajusteDeCusto;
	}
	public void setAjusteDeCusto(double ajusteDeCusto) {
		this.ajusteDeCusto = ajusteDeCusto;
	}
	public void calcularSalarioa(){
		saladmin = this.ajusteDeCusto + calcularSalario();
	}
	public void mostraA(){
		mostraE();
		System.out.println("Valor do Ajuste = R$"+this.ajusteDeCusto);
		System.out.println("Sal�rio Final do Administrador = R$"+saladmin);
	}
}
