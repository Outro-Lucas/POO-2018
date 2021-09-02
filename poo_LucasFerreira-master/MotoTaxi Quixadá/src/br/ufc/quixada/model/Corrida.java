package br.ufc.quixada.model;

public class Corrida {

	private String partida;
	private String destino;
	private float pre�oKm;
	private float pre�oCorrida;
	
	public Corrida(){
		
	}
	public Corrida(String partida, String destino, float pre�oKm,float pre�oCorrida){
		this.partida=partida;
		this.destino=destino;
		this.pre�oKm=pre�oKm;
		this.pre�oCorrida=pre�oCorrida;
	}
	public String getPartida() {
		return partida;
	}
	public void setPartida(String partida) {
		this.partida = partida;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public float getPre�oKm() {
		return pre�oKm;
	}
	public void setPre�oKm(float pre�oKm) {
		this.pre�oKm = pre�oKm;
	}
	public float getPre�oCorrida() {
		return pre�oCorrida;
	}
	public void setPre�oCorrida(float pre�oCorrida) {
		this.pre�oCorrida = pre�oCorrida;
	}
	public String toString(){
		String modelo = "";
		modelo = "Partida: "+this.partida+ "\n"+
				 "Destino: "+this.destino+ "\n"+
				 "Pre�o por Km: "+this.pre�oKm+"\n"+
				 "Pre�o da Corrida: R$"+this.pre�oCorrida+"\n";
		return modelo;
	
	}
	
	public float calcularValorCorrida(int distancia){
		float valor = (distancia*pre�oKm)+5;
		return valor;
	}
}
