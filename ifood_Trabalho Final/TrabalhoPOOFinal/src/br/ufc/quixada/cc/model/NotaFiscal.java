package br.ufc.quixada.cc.model;

import java.util.ArrayList;
import java.util.List;

import br.ufc.quixada.cc.inter.Imprimivel;

public class NotaFiscal implements Imprimivel{

	private String localizacao;
	private List <String> pedido= new ArrayList<>();
	
	public NotaFiscal(){
		
	}
	public NotaFiscal(String localizacao){
		this.setLocalizacao(localizacao);
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public List<String> getPedido() {
		return pedido;
	}
	public void setPedido(List<String> pedido) {
		this.pedido = pedido;
	}
	@Override
	public void gerarNota() {
		// TODO Auto-generated method stub
		System.out.println('\t'+'\t'+"CUPOM FISCAL");
		System.out.println("Endereco: "+this.localizacao);
		System.out.println("Compra realizada: ");
		for(int i=0;i<this.pedido.size();i++) {
			System.out.println(pedido.get(i));
		}
		System.out.println("\n");
	}
}
