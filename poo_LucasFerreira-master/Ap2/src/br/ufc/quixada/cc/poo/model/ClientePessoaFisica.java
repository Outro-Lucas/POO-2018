package br.ufc.quixada.cc.poo.model;

import java.time.LocalDate;

public class ClientePessoaFisica extends Cliente {

	private String cpf;
	private LocalDate datanasc;
	
	public ClientePessoaFisica(){	
	}
	public ClientePessoaFisica(String nome, String Endere�o, String cpf, LocalDate datanasc){
		super(nome, Endere�o);
		this.cpf = cpf;
		this.datanasc = datanasc;
	}

	public LocalDate getDatanasc() {
		return datanasc;
	}

	public void setDatanasc(LocalDate datanasc) {
		this.datanasc = datanasc;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String toString(){
		super.toString();
		String modelo="";
		modelo = "CPF::"+this.cpf+"\n"+
				"Data de Nascimento:"+this.datanasc;
		return modelo;
	}
}
