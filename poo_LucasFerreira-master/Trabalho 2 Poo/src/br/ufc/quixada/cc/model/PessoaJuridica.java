package br.ufc.quixada.cc.model;

public class PessoaJuridica extends Pessoa {

	private int CNPJ;
	private String insestadual;
	private String raz�oSocial;
	
	public PessoaJuridica(String nome, String endere�o, String email, int CNPJ, String insestadual, String raz�oSocial){
		super(nome, endere�o, email);
		this.setCNPJ(CNPJ);
		this.setInsestadual(insestadual);
		this.setRaz�oSocial(raz�oSocial);
	}
	public PessoaJuridica(){
		super();
	}

	public String getInsestadual() {
		return insestadual;
	}
	public void setInsestadual(String insestadual) {
		this.insestadual = insestadual;
	}
	public String getRaz�oSocial() {
		return raz�oSocial;
	}
	public void setRaz�oSocial(String raz�oSocial) {
		this.raz�oSocial = raz�oSocial;
	}
	public int getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(int cNPJ) {
		CNPJ = cNPJ;
	}
}
