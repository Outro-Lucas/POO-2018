package br.ufc.cc.quixada.model;

public class Fornecedor extends Pessoa{

	private double valorCredito;
	private double valorDivida;
	double saldo;
	public Fornecedor (String nome, String endereço, String telefone, double valorCredito, double valorDivida){
		super(nome, endereço, telefone);
		this.setValorCredito(valorCredito);
		this.setValorDivida(valorDivida);
	}
	public Fornecedor (){
		super();
	}
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	public void obterSaldo(){
		saldo = this.valorCredito - this.valorDivida;
	}
	public void mostraF(){
		mostraP();
		System.out.println("Valor do Crédito = R$"+this.valorCredito);
		System.out.println("Valor da Divida = R$"+this.valorDivida);
		System.out.println("Saldo Final = R$"+saldo);
	}
	
}
