package br.ufc.cc.quixada.model;

public class ContaPoupan�a extends ContaBancaria implements Imprimivel{

	@Override
	public double sacar(double a) {
		// TODO Auto-generated method stub
		return (super.getSaldo() - a) - this.taxaDeOpera��o;
	}

	@Override
	public double depositar(double b) {
		// TODO Auto-generated method stub
		return (super.getSaldo() + b) - this.taxaDeOpera��o;
	}
	public double getTaxaDeOpera��o() {
		return taxaDeOpera��o;
	}

	public void setLimite(double taxaDeOpera��o) {
		this.taxaDeOpera��o = taxaDeOpera��o;
	}
	private double taxaDeOpera��o;
	
	public ContaPoupan�a(){
		super();
	}
	public ContaPoupan�a(int saldo, int numerodaconta, double taxaDeOpera��o){
		super(saldo, numerodaconta);
		this.taxaDeOpera��o = taxaDeOpera��o;
	}

	@Override
	public void mostrarDados() {
		// TODO Auto-generated method stub
		System.out.println("Conta Poupan�a:");
		System.out.println("Saldo:"+this.saldo);
		System.out.println("Numero da Conta:"+this.numerodaconta);
	}

}
