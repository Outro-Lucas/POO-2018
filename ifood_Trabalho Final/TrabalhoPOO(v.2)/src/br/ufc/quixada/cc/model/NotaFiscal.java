package br.ufc.quixada.cc.model;

import br.ufc.quixada.cc.inter.Imprimivel;

public class NotaFiscal implements Imprimivel{

	private String localização;
	private String cnpj;
	
	public NotaFiscal(){
		
	}
	public NotaFiscal(String localização, String cnpj){
		this.setLocalização(localização);
		this.setCnpj(cnpj);
	}
	public String getLocalização() {
		return localização;
	}
	public void setLocalização(String localização) {
		this.localização = localização;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	@Override
	public void gerarNota() {
		// TODO Auto-generated method stub
		System.out.println('\t'+'\t'+"CUPOM FISCAL");
		System.out.println("Endereço: "+this.localização);
		System.out.println("CNPJ: "+this.cnpj);
		
	}
}
