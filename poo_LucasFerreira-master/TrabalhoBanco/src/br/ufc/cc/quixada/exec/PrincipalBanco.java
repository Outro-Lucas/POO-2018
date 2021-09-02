package br.ufc.cc.quixada.exec;
import java.util.Scanner;
import br.ufc.cc.quixada.model.Banco;
import br.ufc.cc.quixada.model.ContaCorrente;
import br.ufc.cc.quixada.model.ContaPoupança;
import br.ufc.cc.quixada.model.Relatorio;

//import br.ufc.cc.quixada.model.Banco;

public class PrincipalBanco {
	private static Scanner ler;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ler = new Scanner(System.in);
		Banco banco = new Banco();
		Relatorio relatorio = new Relatorio(); 
		boolean o=true;
		while(o){	
		System.out.println("1. Criar Conta.");
		System.out.println("2. Selecionar Conta.");
		System.out.println("3. Remover Conta.");
		System.out.println("4. Gerar Relatório.");
		System.out.println("5. Finalizar Operações.");
		System.out.println("Escolha uma opção: ");
		int res = ler.nextInt();
		
		
		if (res==1){
			System.out.println("Qual conta irá criar Conta Corrente ou Conta Poupannça? ( 1 || 2 )");
			int rr = ler.nextInt();
			if(rr==1){
				System.out.println("Informe um número para conta: ");
				int conta = ler.nextInt();
				ContaCorrente contac = new ContaCorrente(0, conta, 1000);	
				banco.inserirContaCorrente(contac);
			}
			if(rr==2){
				System.out.println("Informe um número para conta: ");
				int contacp = ler.nextInt();
				ContaPoupança contap = new ContaPoupança(0, contacp, 0.0);
				banco.inserirContaPoupança(contap);
			}

		}
		
		
		
		if (res==2){
			System.out.println("Insira o Número da sua conta:");
			int num = ler.nextInt();
			banco.procurarConta(num);
			if(num!=-1){
				//mostrar o menu
				int resposta = ler.nextInt();
				System.out.println("1. Depositar.");
				if(res==1){
					
				}
				System.out.println("2. Sacar.");
				if(res==2){
					
				}
				System.out.println("3. Transferir.");
				if(res==3){
					
				}
				System.out.println("4. Gerar relatório");
				if(res==4){
					banco.mostrarDados();
				}
				System.out.println("5. Retornar ao menu anterior.");
				if(resposta == 5){
					
				}
			}
		}
		
		
		if (res==3){
			System.out.println("Sua conta é corrente ou poupança?(1 || 2)");
			int cod = ler.nextInt();
			
			
			if(cod==1){
				System.out.println("Insira o Número da sua conta:");
				int num= ler.nextInt();
				ContaCorrente aux1 = new ContaCorrente();
				banco.procurarConta(num);
				if(num!=-1){
					banco.removerContaCorrente(aux1);
				}
			}
			
			if (cod==2){
				System.out.println("Insira o Número da sua conta:");
				int num= ler.nextInt();
				ContaPoupança aux2 = new ContaPoupança();
				banco.procurarConta(num);
				if(num!=-1){
					banco.removerContaPoupança(aux2);
				}
			}

		}
		
		if (res==4){
			//relatorio.gerarRelatorio(banco);
			banco.mostrarDados();
		}
		
		
		if (res==5){
			System.exit(0);
		}
		}
	}

}
