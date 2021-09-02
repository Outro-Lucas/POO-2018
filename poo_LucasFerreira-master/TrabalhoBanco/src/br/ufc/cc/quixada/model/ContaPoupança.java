package br.ufc.cc.quixada.model;

public class ContaPoupança extends ContaBancaria implements Imprimivel{

	@Override
	public double sacar(double a) {
		// TODO Auto-generated method stub
		return (super.getSaldo() - a) - this.taxaDeOperação;
	}

	@Override
	public double depositar(double b) {
		// TODO Auto-generated method stub
		return (super.getSaldo() + b) - this.taxaDeOperação;
	}
	public double getTaxaDeOperação() {
		return taxaDeOperação;
	}

	public void setLimite(double taxaDeOperação) {
		this.taxaDeOperação = taxaDeOperação;
	}
	private double taxaDeOperação;
	
	public ContaPoupança(){
		super();
	}
	public ContaPoupança(int saldo, int numerodaconta, double taxaDeOperação){
		super(saldo, numerodaconta);
		this.taxaDeOperação = taxaDeOperação;
	}

	@Override
	public void mostrarDados() {
		// TODO Auto-generated method stub
		System.out.println("Conta Poupança:");
		System.out.println("Saldo:"+this.saldo);
		System.out.println("Numero da Conta:"+this.numerodaconta);
	}

}
