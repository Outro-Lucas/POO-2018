package br.ufc.quixada.cc.poo.model;

public class Servi�osGerais extends Funcionario {
	private int tempoServi�o;
	
	public Servi�osGerais(){
	}
	public Servi�osGerais(String nome, String CPF, String matricula, float sal�rio, int tempoServi�o){
		super(nome, CPF, matricula, sal�rio);
		this.setTempoServi�o(tempoServi�o);
	}
	@Override
	public void darBonifica��o() {
		// TODO Auto-generated method stub
		super.sal�rio = super.sal�rio +3;
	}
	public int getTempoServi�o() {
		return tempoServi�o;
	}
	public void setTempoServi�o(int tempoServi�o) {
		this.tempoServi�o = tempoServi�o;
	}
	public String toString(){
		super.toString();
		String modelo = "";
		modelo = "Tempo de Servi�o:"+this.tempoServi�o;
		return modelo;
	}
}
