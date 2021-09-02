package br.ufc.cc.quixada.model;

public class ContaCorrente extends ContaBancaria implements Imprimivel{

	private int limite;
	
	public ContaCorrente(){
		super();
	}
	public ContaCorrente(int saldo, int numerodaconta, int limite){
		super(saldo, numerodaconta);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}

	@Override
	public void mostrarDados() {
		// TODO Auto-generated method stub
		System.out.println("Conta Corrente:");
		System.out.println("Saldo:"+this.saldo);
		System.out.println("Numero da Conta:"+this.numerodaconta);
	}

	@Override
	public double sacar(double a) {
		// TODO Auto-generated method stub
		if (this.limite>0){
			super.saldo = super.saldo - a;
		}
		return 0;
	}

	@Override
	public double depositar(double b) {
		// TODO Auto-generated method stub
		if(this.limite>0){
			super.saldo = super.saldo + b;
		}
		return 0;
	}
}
