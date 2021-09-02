package br.ufc.quixada.cc.poo.model;

public abstract class Funcionario extends Pessoa {

	private String CPF;
	private String matricula;
	protected float salário;
	
	public Funcionario(){
	}
	public Funcionario(String nome, String CPF, String matricula, float salário){
		super(nome);
		this.setCPF(CPF);
		this.setMatricula(matricula);
		this.setSalário(salário);
	}
	public abstract void darBonificação();
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public float getSalário() {
		return salário;
	}
	public void setSalário(float salário) {
		this.salário = salário;
	}
	public String toString(){
		String modelo="";
		modelo = "CPF:"+this.CPF + "\n" +
				"Matricula"+this.matricula+"\n"+
				"Salário:"+ this.salário;
		return modelo;
	}
	
}
