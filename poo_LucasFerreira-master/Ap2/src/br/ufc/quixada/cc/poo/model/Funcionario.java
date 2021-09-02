package br.ufc.quixada.cc.poo.model;

public abstract class Funcionario extends Pessoa {

	private String CPF;
	private String matricula;
	protected float sal�rio;
	
	public Funcionario(){
	}
	public Funcionario(String nome, String CPF, String matricula, float sal�rio){
		super(nome);
		this.setCPF(CPF);
		this.setMatricula(matricula);
		this.setSal�rio(sal�rio);
	}
	public abstract void darBonifica��o();
	
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
	public float getSal�rio() {
		return sal�rio;
	}
	public void setSal�rio(float sal�rio) {
		this.sal�rio = sal�rio;
	}
	public String toString(){
		String modelo="";
		modelo = "CPF:"+this.CPF + "\n" +
				"Matricula"+this.matricula+"\n"+
				"Sal�rio:"+ this.sal�rio;
		return modelo;
	}
	
}
