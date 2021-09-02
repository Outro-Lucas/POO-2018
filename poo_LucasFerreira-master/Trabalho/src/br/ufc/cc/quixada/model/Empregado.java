package br.ufc.cc.quixada.model;

public class Empregado extends Pessoa{

	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	double salario;
	
	public Empregado(String nome, String endereço, String telefone, int codigoSetor, double salarioBase, double imposto){
		super(nome, endereço, telefone);
		this.setCodigoSetor(codigoSetor);
		this.setSalarioBase(salarioBase);
		this.setImposto(imposto);
	}
	public Empregado(){
		super();
	}
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	public double calcularSalario(){
		salario = this.salarioBase - this.imposto;
		return salario;
	}
	public void mostraE(){
		mostraP();
		System.out.println("Código no Setor = "+this.codigoSetor);
		System.out.println("Salario Base = R$"+this.salarioBase);
		System.out.println("Imposto = R$"+this.imposto);
		System.out.println("Salário Final do Empregado = R$"+salario);
	}
	
}
