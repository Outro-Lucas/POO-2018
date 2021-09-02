package br.ufc.quixada.cc.poo.model;

import java.time.LocalDate;

public class ClientePessoaJuridica extends Cliente{

	private String cnpj;
	private LocalDate dataAbertura;
	
	public ClientePessoaJuridica(){
	}
	public ClientePessoaJuridica(String nome, String Endereço, String cnpj, LocalDate dataAbertura){
		super(nome, Endereço);
		this.setCnpj(cnpj);
		this.setDataAbertura(dataAbertura);
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public LocalDate getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(LocalDate dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public String toString(){
		super.toString();
		String modelo="";
		modelo = "CNPJ::"+this.cnpj+"\n"+
				"Data de Abertura:"+this.dataAbertura;
		return modelo;
	}
	
}
