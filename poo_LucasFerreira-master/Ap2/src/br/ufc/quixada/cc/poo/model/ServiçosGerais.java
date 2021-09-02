package br.ufc.quixada.cc.poo.model;

public class ServiçosGerais extends Funcionario {
	private int tempoServiço;
	
	public ServiçosGerais(){
	}
	public ServiçosGerais(String nome, String CPF, String matricula, float salário, int tempoServiço){
		super(nome, CPF, matricula, salário);
		this.setTempoServiço(tempoServiço);
	}
	@Override
	public void darBonificação() {
		// TODO Auto-generated method stub
		super.salário = super.salário +3;
	}
	public int getTempoServiço() {
		return tempoServiço;
	}
	public void setTempoServiço(int tempoServiço) {
		this.tempoServiço = tempoServiço;
	}
	public String toString(){
		super.toString();
		String modelo = "";
		modelo = "Tempo de Serviço:"+this.tempoServiço;
		return modelo;
	}
}
