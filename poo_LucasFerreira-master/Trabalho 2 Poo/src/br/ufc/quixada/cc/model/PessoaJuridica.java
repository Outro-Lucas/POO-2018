package br.ufc.quixada.cc.model;

public class PessoaJuridica extends Pessoa {

	private int CNPJ;
	private String insestadual;
	private String razãoSocial;
	
	public PessoaJuridica(String nome, String endereço, String email, int CNPJ, String insestadual, String razãoSocial){
		super(nome, endereço, email);
		this.setCNPJ(CNPJ);
		this.setInsestadual(insestadual);
		this.setRazãoSocial(razãoSocial);
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
	public String getRazãoSocial() {
		return razãoSocial;
	}
	public void setRazãoSocial(String razãoSocial) {
		this.razãoSocial = razãoSocial;
	}
	public int getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(int cNPJ) {
		CNPJ = cNPJ;
	}
}
