package br.ufc.quixada.cc.poo.exec;

import br.ufc.quixada.cc.poo.model.Pessoa;
import br.ufc.quixada.cc.poo.model.Vendedor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import br.ufc.quixada.cc.poo.model.Cliente;
import br.ufc.quixada.cc.poo.model.ClientePessoaFisica;
import br.ufc.quixada.cc.poo.model.ClientePessoaJuridica;
import br.ufc.quixada.cc.poo.model.Funcionario;
import br.ufc.quixada.cc.poo.model.Motorista;
import br.ufc.quixada.cc.poo.model.Onibus;
import br.ufc.quixada.cc.poo.model.Passagem;

public class Principal {
	static ArrayList<Pessoa> Pessoas = new ArrayList<>();
	static ArrayList<Onibus> Operadoras = new ArrayList<>();	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate datanasc = LocalDate.of(2000, 06, 17);
		LocalDate datapar = LocalDate.of(2018,12,25);
		
		Funcionario v1 = new Vendedor("Pedro", "111", "687", 1000, 24);
		Funcionario v3 = new Vendedor("Mario", "222", "665", 1000, 24);
		
		Motorista m = new Motorista("José", "555", "685", 1000, "688");
		Motorista m2 = new Motorista("Josué", "555", "685", 1000, "688");
		
		Cliente cp1 = new ClientePessoaFisica("Lucas", "Quixada", "555", datanasc);
		Cliente cj1 = new ClientePessoaJuridica("Lucs", "Q", "545", datanasc);
		
		Passagem p1 = new Passagem();
		p1.setCodPassagem(6);
		p1.setCliente(cj1);
		p1.setVendedor(v1);
		p1.setDataPartida(datapar);
		p1.setHorario(12);
		p1.setPoltrona(26);
		p1.setValorPassagem(16);
		
		Passagem p2 = new Passagem();
		p1.setCodPassagem(2);
		p1.setCliente(cp1);
		p1.setVendedor(v3);
		p1.setDataPartida(datapar);
		p1.setHorario(15);
		p1.setPoltrona(56);
		p1.setValorPassagem(16);
		
		Onibus onibus = new Onibus();
		onibus.setCodOnibus(6);
		onibus.setMotorista(m2);
		
		Onibus o = new Onibus();
		o.setCodOnibus(1);
		o.setMotorista(m);
		
		o.adicionarPassagemOnibus(p1);
		o.adicionarPassagemOnibus(p2);
		o.mostrarPassagens();

		menu();

	}

	
	public static void menu(){
		Scanner ler = new Scanner(System.in);

		int res = ler.nextInt();
		boolean o=true;
		while (o){
		System.out.println("1.Cadastrar um ônibus.");
		System.out.println("2.Cadastrar um cliente.");
		System.out.println("3.Cadastrar um funcionário.");
		System.out.println("4.Cadastrar uma passagem.");
		

		
		if (res==1){
				String cpf = ler.nextLine();
				for (int i=0; i<Pessoas.size();i++){
				if(Pessoas.get(i) instanceof Motorista){
					if (((Motorista)Pessoas.get(i)).getCPF().equals(cpf)){
						int cod = ler.nextInt();
						Onibus onibus2 = new Onibus(cod, (Motorista) Pessoas.get(i));
						Operadoras.add(onibus2);
						}
					}
				}
			}
		}
		if(res==2){
			int pessoa;
			System.out.println("Escolha o tipo de pessoa. Pessoa Física 1, Pessoa Jurídica 2");
			pessoa= ler.nextInt();
			if(pessoa==1){
				for (int i=0; i<Pessoas.size();i++){
					if(Pessoas.get(i) instanceof ClientePessoaFisica){
						ClientePessoaFisica fis = new ClientePessoaFisica();
						Pessoas.add(fis);
					}
			}
			}else if(pessoa==2){
				for (int i=0; i<Pessoas.size();i++){
					if(Pessoas.get(i) instanceof ClientePessoaFisica){
						ClientePessoaJuridica jur = new ClientePessoaJuridica();
						Pessoas.add(jur);
					}
			}
		}
		if(res==3){
			
		}
		if(res==4){
			
		}
		}

	
	
}
