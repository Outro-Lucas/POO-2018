package br.ufc.cc.quixada.model;

public class Oper�rio extends Empregado{

	private double valorProdu��o;
	private double comissao;
	double sal;
	public Oper�rio(String nome, String endere�o, String telefone, int codigoSetor, double salarioBase, double imposto,
			double valorProdu��o, double comissao){
		super(nome, endere�o, telefone,
				codigoSetor, salarioBase, imposto);
		this.valorProdu��o = valorProdu��o;
		this.comissao = comissao ;
	}
	public Oper�rio(){
		super();
	}
	public void calcularSalarioo(){
		sal  = this.comissao + calcularSalario();
	}
	public double getValorProdu��o() {
		return valorProdu��o;
	}
	public void setValorProdu��o(double valorProdu��o) {
		this.valorProdu��o = valorProdu��o;
	}
	public double getComissao(){
		return comissao;
	}
	public void setComissao(double comissao){
		this.comissao = comissao ;
	}
	public void mostraO(){
		mostraE();
		System.out.println("Valor de Produ��o = R$"+this.valorProdu��o);
		System.out.println("Valor da Comissao = R$"+this.comissao);
		System.out.println("Sal�rio Final do Oper�rio = R$"+sal);
	}
}
