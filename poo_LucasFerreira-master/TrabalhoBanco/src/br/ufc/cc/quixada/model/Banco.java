package br.ufc.cc.quixada.model;
import java.util.ArrayList;
import java.util.Scanner;

public class Banco implements Imprimivel{
	private ArrayList<ContaBancaria> Contas = new ArrayList<>();
	Scanner ler = new Scanner(System.in);
	public ArrayList<ContaBancaria> getContas() {
		return Contas;
	}

	public void setContas(ArrayList<ContaBancaria> contas) {
		Contas = contas;
	}
	public void inserirContaCorrente(ContaCorrente contacorrente1){
		this.Contas.add(contacorrente1);
		System.out.println("Conta Corrente Adicionada");
	}
	public void removerContaCorrente(ContaCorrente contacorrente1){
		this.Contas.remove(contacorrente1);
		System.out.println("Conta Corrente Removida");
	}
	public void inserirContaPoupanša(ContaPoupanša contapoupanša1){
		this.Contas.add(contapoupanša1);
		System.out.println("Conta Poupanša Adicionada");
	}
	public void removerContaPoupanša(ContaPoupanša contapoupanša1){
		this.Contas.remove(contapoupanša1);
		System.out.println("Conta Poupanša Removida");
	}
	public int procurarConta(int numerodaconta){
		for (int i=0; i<this.Contas.size();i++){
			ContaBancaria contabancaria1 = Contas.get(i);
			if(numerodaconta==contabancaria1.getNumerodaconta()){
				System.out.println("Conta Encontrada");
				return numerodaconta;
			}else{
				System.out.println("NŃo Encontrada");
				return -1;
			}	 
		}
		return 0;
	}

	@Override
	public void mostrarDados() {
		// TODO Auto-generated method stub
		for (int i=0; i<this.Contas.size(); i++){
			ContaBancaria conta = Contas.get(i);
			if(conta instanceof ContaCorrente){
				((ContaCorrente) conta).mostrarDados();
			}
			if(conta instanceof ContaPoupanša){
				((ContaPoupanša) conta).mostrarDados();
			}
		}
	}
}
