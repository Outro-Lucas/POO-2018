package br.ufc.quixada.model;

public class Corrida {

	private String partida;
	private String destino;
	private float preçoKm;
	private float preçoCorrida;
	
	public Corrida(){
		
	}
	public Corrida(String partida, String destino, float preçoKm,float preçoCorrida){
		this.partida=partida;
		this.destino=destino;
		this.preçoKm=preçoKm;
		this.preçoCorrida=preçoCorrida;
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
	public float getPreçoKm() {
		return preçoKm;
	}
	public void setPreçoKm(float preçoKm) {
		this.preçoKm = preçoKm;
	}
	public float getPreçoCorrida() {
		return preçoCorrida;
	}
	public void setPreçoCorrida(float preçoCorrida) {
		this.preçoCorrida = preçoCorrida;
	}
	public String toString(){
		String modelo = "";
		modelo = "Partida: "+this.partida+ "\n"+
				 "Destino: "+this.destino+ "\n"+
				 "Preço por Km: "+this.preçoKm+"\n"+
				 "Preço da Corrida: R$"+this.preçoCorrida+"\n";
		return modelo;
	
	}
	
	public float calcularValorCorrida(int distancia){
		float valor = (distancia*preçoKm)+5;
		return valor;
	}
}
