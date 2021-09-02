package br.ufc.quixada.cc.poo.model;

public class Motorista extends Funcionario {

	private String cnh;
	
	public Motorista(){
	}
	public Motorista(String nome, String CPF, String matricula, float sal�rio, String cnh){
		super(nome, CPF, matricula, sal�rio);
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
		modelo = "Cateira Nacional de Habilita��o:"+this.cnh;
		return modelo;
	}
	@Override
	public void darBonifica��o() {
		// TODO Auto-generated method stub
		float p = (float) (super.sal�rio *0.5);
		super.sal�rio = super.sal�rio + p;
	}
}
