package br.ufc.cc.quixada.model;

public class Vendedor extends Empregado {

	private double valorVendas;
	private double comissao;
	double v;
	public Vendedor(String nome, String endereço, String telefone, int codigoSetor, double salarioBase, double imposto,
			double valorVendas, double comissao){
		super(nome, endereço, telefone,
				codigoSetor, salarioBase, imposto);
		this.valorVendas = valorVendas;
		this.comissao = comissao ;
	}
	public Vendedor(){
		super();
	}
	
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorDeVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	public void calculaSalariov(){
		v = this.comissao + calcularSalario();
	}
	public void mostraV(){
		mostraE();
		System.out.println("Valor das Vendas = R$"+this.valorVendas);
		System.out.println("Comissão = R$"+this.comissao);
		System.out.println("Salário Final do Vendedor = R$"+v);
	}
}
