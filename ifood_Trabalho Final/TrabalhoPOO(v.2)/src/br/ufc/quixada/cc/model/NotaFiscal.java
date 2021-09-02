package br.ufc.quixada.cc.model;

import br.ufc.quixada.cc.inter.Imprimivel;

public class NotaFiscal implements Imprimivel{

	private String localiza��o;
	private String cnpj;
	
	public NotaFiscal(){
		
	}
	public NotaFiscal(String localiza��o, String cnpj){
		this.setLocaliza��o(localiza��o);
		this.setCnpj(cnpj);
	}
	public String getLocaliza��o() {
		return localiza��o;
	}
	public void setLocaliza��o(String localiza��o) {
		this.localiza��o = localiza��o;
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
		System.out.println("Endere�o: "+this.localiza��o);
		System.out.println("CNPJ: "+this.cnpj);
		
	}
}
