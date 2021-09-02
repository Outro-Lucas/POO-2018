package br.ufc.quixada.cc.model;

import java.util.ArrayList;
import java.util.List;

import br.ufc.quixada.cc.inter.Imprimivel;

public class NotaFiscal implements Imprimivel{

	private String localização;
	private List <String> pedido= new ArrayList<>();
	
	public NotaFiscal(){
		
	}
	public NotaFiscal(String localização){
		this.setLocalização(localização);
	}
	public String getLocalização() {
		return localização;
	}
	public void setLocalização(String localização) {
		this.localização = localização;
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
		System.out.println("Endereço: "+this.localização);
		System.out.println("Compra realizada: ");
		for(int i=0;i<this.pedido.size();i++) {
			System.out.println(pedido.get(i));
		}
		System.out.println("\n");
	}
}
