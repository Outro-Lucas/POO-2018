package br.ufc.quixada.model;

public class Cliente {

	private String nome;
	private String cpf;
	private String tipo;
	
	public Cliente(){
		
	}
	public Cliente(String nome, String cpf, String tipo){
		this.nome=nome;
		this.cpf=cpf;
		this.tipo=tipo;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float solicitarDesconto(float Valor){
		if("Estudante".equals(tipo)){
			Valor= Valor*0.5f;
			return Valor;
		}else if("Professor".equals(tipo)){
			Valor= Valor*0.9f;
			return Valor;
		}
		else if("Policial".equals(tipo)){
			Valor= Valor*0.8f;
			return Valor;
		}
		else if("Idoso".equals(tipo)){
			Valor= Valor*0.5f;
			return Valor;
		}else{
			return Valor;
	}
	}
	
	public String toString(){
		String modelo = "";
		modelo = "Nome do Cliente: "+this.nome+ "\n"+
				 "Numero do CPF do CLiente: "+this.cpf+ "\n"+
				 "O Cliente é: "+this.tipo+"\n";
		return modelo;
	
	}

}
