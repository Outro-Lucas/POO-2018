package ProgramaEntradaDeCinema;
import java.util.Scanner;
import EntradaDeCinema.Cinema;
public class Principal {
	static Scanner ler= new Scanner(System.in);
	public static void main(String[] args) { 
		int dia, mês, ano, carteira, poltrona, e, fim;
		double preço;
		boolean o=true;
		Cinema Filme1= new Cinema("Deadpool", "15:00 horas", "1", 1, 20.00, true);
		Cinema Filme2= new Cinema("Deadpool", "15:00 horas", "1", 2, 20.00, true);
		Cinema Filme3= new Cinema("Deadpool", "15:00 horas", "1", 3, 20.00, true);
		while(o){
			System.out.println(Filme1);
			System.out.println("Escolha uma poltrona(1,2,3): ");
			poltrona=ler.nextInt();
			if (poltrona==1){
				System.out.println("Para ganhar desconto no valor do ingresso informe: ");
				System.out.println("Dia de nascimento: ");
				dia=ler.nextInt();
				System.out.println("Mês de nascimento: ");
				mês=ler.nextInt();
				System.out.println("Ano de nascimento: ");
				ano=ler.nextInt();
				System.out.println("É estudante(1-Sim/2-Não): ");
				e=ler.nextInt();
				if (e==1){
					System.out.println("Insira o número da sua carteira: ");
					carteira=ler.nextInt();	
				}else{
					carteira=-1;
				}
				preço=20.00;
				Filme1.calculaValorComDesconto(dia, mês, ano, carteira, preço);
				System.out.println("\n");
				System.out.println("Deseja finalizar a compra?(1-Sim/2-Não)");
				fim=ler.nextInt();
				if (fim==1){
					Filme1.realizaVenda();
					System.out.println("Venda concluida");
				}
			}	
			else if (poltrona==2){
				System.out.println("Para ganhar desconto no valor do ingresso informe: ");
				System.out.println("Dia de nascimento: ");
				dia=ler.nextInt();
				System.out.println("Mês de nascimento: ");
				mês=ler.nextInt();
				System.out.println("Ano de nascimento: ");
				ano=ler.nextInt();
				System.out.println("É estudante(1-Sim/2-Não): ");
				e=ler.nextInt();
				if (e==1){
				System.out.println("Insira o número da sua carteira: ");
				carteira=ler.nextInt();	
				}else{
					carteira=-1;
				}
				preço=20.00;
				Filme1.calculaValorComDesconto(dia, mês, ano, carteira, preço);
				System.out.println("\n");
				System.out.println("Deseja finalizar a compra?(1-Sim/2-Não)");
				fim=ler.nextInt();
				if (fim==1){
					Filme2.realizaVenda();
					System.out.println("Venda concluida");
				}
			}
			else if (poltrona==3){
				System.out.println("Para ganhar desconto no valor do ingresso informe: ");
				System.out.println("Dia de nascimento: ");
				dia=ler.nextInt();
				System.out.println("Mês de nascimento: ");
				mês=ler.nextInt();
				System.out.println("Ano de nascimento: ");
				ano=ler.nextInt();
				System.out.println("É estudante(1-Sim/2-Não): ");
				e=ler.nextInt();
				if (e==1){
					System.out.println("Insira o número da sua carteira: ");
					carteira=ler.nextInt();	
				}else{
					carteira=-1;
				}
				preço=20.00;
				Filme1.calculaValorComDesconto(dia, mês, ano, carteira, preço);
				System.out.println("\n");
				System.out.println("Deseja finalizar a compra?(1-Sim/2-Não)");
				fim=ler.nextInt();
				if (fim==1){
					Filme3.realizaVenda();
					System.out.println("Venda concluida");
				}
			}
			else{
				System.out.println("Entrada Inválida!");
			}
	}
}
}