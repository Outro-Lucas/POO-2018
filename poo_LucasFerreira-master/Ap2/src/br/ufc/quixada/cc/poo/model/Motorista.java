package br.ufc.quixada.cc.poo.model;

public class Motorista extends Funcionario {

	private String cnh;
	
	public Motorista(){
	}
	public Motorista(String nome, String CPF, String matricula, float salário, String cnh){
		super(nome, CPF, matricula, salário);
		this.setCnh(cnh);
	}
	public String getCnh() {
		return cnh;
	}
	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
	public void realizarViagem(){

	}
	public String toString(){
		super.toString();
		String modelo = "";
		modelo = "Cateira Nacional de Habilitação:"+this.cnh;
		return modelo;
	}
	@Override
	public void darBonificação() {
		// TODO Auto-generated method stub
		float p = (float) (super.salário *0.5);
		super.salário = super.salário + p;
	}
}
