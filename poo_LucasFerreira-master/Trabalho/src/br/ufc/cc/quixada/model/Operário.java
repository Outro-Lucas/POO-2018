package br.ufc.cc.quixada.model;

public class Operário extends Empregado{

	private double valorProdução;
	private double comissao;
	double sal;
	public Operário(String nome, String endereço, String telefone, int codigoSetor, double salarioBase, double imposto,
			double valorProdução, double comissao){
		super(nome, endereço, telefone,
				codigoSetor, salarioBase, imposto);
		this.valorProdução = valorProdução;
		this.comissao = comissao ;
	}
	public Operário(){
		super();
	}
	public void calcularSalarioo(){
		sal  = this.comissao + calcularSalario();
	}
	public double getValorProdução() {
		return valorProdução;
	}
	public void setValorProdução(double valorProdução) {
		this.valorProdução = valorProdução;
	}
	public double getComissao(){
		return comissao;
	}
	public void setComissao(double comissao){
		this.comissao = comissao ;
	}
	public void mostraO(){
		mostraE();
		System.out.println("Valor de Produção = R$"+this.valorProdução);
		System.out.println("Valor da Comissao = R$"+this.comissao);
		System.out.println("Salário Final do Operário = R$"+sal);
	}
}
