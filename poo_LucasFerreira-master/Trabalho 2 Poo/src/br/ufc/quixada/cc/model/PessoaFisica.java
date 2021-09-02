package br.ufc.quixada.cc.model;

import java.time.LocalDate;

public class PessoaFisica extends Pessoa{

	private int CPF;
	private String estadocivil;
	LocalDate datanasc;
	
	public PessoaFisica(String nome, String endereço, String email, int CPF, String estadocivil, LocalDate datanasc){
		super(nome, endereço, email);
		this.setCPF(CPF);
		this.setEstadocivil(estadocivil);
		this.datanasc = datanasc;
	}
	public PessoaFisica(){
		super();
	}
	public String getEstadocivil() {
		return estadocivil;
	}
	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}
	
}
