package br.ufc.cc.quixada.model;

public abstract class ContaBancaria {

	protected double saldo;
	protected int numerodaconta;
	
	public ContaBancaria(){
	}

	public ContaBancaria(int saldo, int numerodaconta){
		this.saldo = saldo;
		this.numerodaconta = numerodaconta;
	}
	public abstract double sacar(double a);
	public abstract double depositar(double b);

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumerodaconta() {
		return numerodaconta;
	}

	public void setNumerodaconta(int numerodaconta) {
		this.numerodaconta = numerodaconta;
	}	
	public void transferir(double saque, ContaBancaria contabancaria){
		sacar(saque);
		contabancaria.depositar(saque);
	}
}
