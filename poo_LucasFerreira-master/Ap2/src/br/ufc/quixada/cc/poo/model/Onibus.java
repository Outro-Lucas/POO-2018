package br.ufc.quixada.cc.poo.model;

import java.util.List;
import java.util.ArrayList;
import br.ufc.quixada.cc.poo.interfac.Imprimivel;
import br.ufc.quixada.cc.poo.model.Cliente;
public class Onibus implements Imprimivel {

	private int codOnibus;
	private Motorista motorista;
	private List <Cliente> passageiros;
	private List <Passagem> passagens;
	
	public Onibus(){
		this.passageiros = new ArrayList<>();
		this.passagens = new ArrayList<>();
}

	public Onibus(int codOnibus, Motorista motorista){
		this.codOnibus = codOnibus;
		this.motorista = motorista;
		this.setPassageiros(new ArrayList<>());
		this.setPassagens(new ArrayList<>());
	}
	public void adicionarPassagemOnibus(Passagem p){
		if(this.passagens.size()>63){
			System.out.println("Erro! Nenhuma passagem disponível");
		}else{
		this.passagens.add(p);
		}
	}
	public int getCodOnibus() {
		return codOnibus;
	}

	public void setCodOnibus(int codOnibus) {
		this.codOnibus = codOnibus;
	}

	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}
	
	public String ToString(){
		String modelo = "";
		modelo = "Còdigo do Onibus:"+this.codOnibus+"\n"+
				"Motorista:"+this.motorista;
		return modelo;
	}

	public List <Passagem> getPassagens() {
		return passagens;
	}

	public void setPassagens(List <Passagem> passagens) {
		this.passagens = passagens;
	}

	public List <Cliente> getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(List <Cliente> passageiros) {
		this.passageiros = passageiros;
	}

	@Override
	public void mostrarPassagens() {
		// TODO Auto-generated method stub
			for(int i=0; i<this.passagens.size();i++){
				System.out.println(passagens.get(i));
			}
		}


}
