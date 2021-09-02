package br.ufc.quixada.model;

public class MotoTaxi {

	private String nome;
	private String cnh;
	private String placa;
	private float nota;
	
	public MotoTaxi(){
		
	}
	public MotoTaxi(String nome,String cnh, String placa, float nota){
		this.nome=nome;
		this.cnh=cnh;
		this.placa=placa;
		this.nota=nota;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}
	
	public void realizarCorrida(Cliente cliente, Corrida Corrida){
		System.out.println("Nome do Clinte: "+cliente.getNome());
		System.out.println("Nome do Moto Táxi: "+MotoTaxi.this.nome);
		System.out.println("Nota do Moto Táxi: "+MotoTaxi.this.nota);
		System.out.println("Local de Partida e Destino: "+Corrida.getPartida() +Corrida.getDestino());
	}
	
	public String toString(){
		String modelo = "";
		modelo = "Nome do Moto Táxi: "+this.nome+ "\n"+
				 "Numero da CNH: "+this.cnh+ "\n"+
				 "Placa da Motocicleta: "+this.placa+"\n"+
				 "Nota do Moto Táxi: "+this.nota+"\n";
		return modelo;
	
	}

}
