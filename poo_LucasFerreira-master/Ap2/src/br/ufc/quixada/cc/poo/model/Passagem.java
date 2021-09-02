package br.ufc.quixada.cc.poo.model;

import java.time.LocalDate;

public class Passagem {

	private int codPassagem;
	private Cliente cliente;
	private Funcionario vendedor;
	private LocalDate dataPartida;
	private int horario;
	private int poltrona;
	private float valorPassagem;
	
	public Passagem(){
		
	}
	public Passagem(int codPassagem, Cliente cliente, Funcionario vendedor, LocalDate dataPartida, int horario, int poltrona, float valorPassagem ){
		this.codPassagem = codPassagem;
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.dataPartida = dataPartida;
		this.horario = horario;
		this.poltrona = poltrona;
		this.valorPassagem = valorPassagem;
	}
	public void passagem(){
		
	}

	public int getCodPassagem() {
		return codPassagem;
	}

	public void setCodPassagem(int codPassagem) {
		this.codPassagem = codPassagem;
	}
	public Funcionario getvendedor() {
		return vendedor;
	}

	public void setVendedor(Funcionario vendedor) {
		this.vendedor= vendedor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LocalDate getDataPartida() {
		return dataPartida;
	}

	public void setDataPartida(LocalDate dataPartida) {
		this.dataPartida = dataPartida;
	}

	public int getHorario() {
		return horario;
	}

	public void setHorario(int horario) {
		this.horario = horario;
	}

	public int getPoltrona() {
		return poltrona;
	}

	public void setPoltrona(int poltrona) {
		this.poltrona = poltrona;
	}

	public float getValorPassagem() {
		return valorPassagem;
	}

	public void setValorPassagem(float valorPassagem) {
		this.valorPassagem = valorPassagem;
	}
	public String toString(){
		String modelo = "";
		modelo= "Código da pasagem"+this.codPassagem+"\n"+
				"Cliente:"+this.cliente+"\n"+
				"Vendedor:"+this.vendedor+"\n"+
				"Data de Partida"+this.dataPartida+"\n"+
				"Horário:"+this.horario+"\n"+
				"Poltrona:"+this.poltrona+"\n"+
				"valorPassagem"+this.valorPassagem;
		return modelo;
	}
	
}
