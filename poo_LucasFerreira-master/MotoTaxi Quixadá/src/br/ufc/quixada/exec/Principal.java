package br.ufc.quixada.exec;
import java.util.Scanner;
import br.ufc.quixada.model.Cliente;
import br.ufc.quixada.model.Corrida;
import br.ufc.quixada.model.MotoTaxi;

public class Principal {
	static Scanner ler = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotoTaxi mt1= new MotoTaxi("José", "3434", "62770CD", 5);
		MotoTaxi mt2= new MotoTaxi("Chico", "6665", "56465C", 10);		
		Cliente cliente1= new Cliente("Lucas", "666-06", "Estudante");
		Cliente cliente2= new Cliente("Igor", "789-05", "Policial");
		Cliente cliente3= new Cliente("Tércio", "326-56", "Professor");
		Corrida corrida1=new Corrida("Centro", "Cedro", 5, 6);
		Corrida corrida2=new Corrida("Centro", "Cedro", 5, 6);
		Corrida corrida3=new Corrida("Cedro", "Centro", 4, 5);

		cliente1.solicitarDesconto(corrida1.calcularValorCorrida(5));
		System.out.println(cliente1);
		cliente2.solicitarDesconto(corrida2.calcularValorCorrida(6));
		System.out.println(cliente2);
		cliente3.solicitarDesconto(corrida3.calcularValorCorrida(6));
		System.out.println(cliente3);
		mt1.realizarCorrida(cliente1, corrida1);
		System.out.println(mt1);
		mt1.realizarCorrida(cliente2, corrida2);
		System.out.println(mt2);
		mt1.realizarCorrida(cliente3, corrida3);
		System.out.println(mt2);
		System.out.println(corrida1.calcularValorCorrida(5));
		System.out.println(corrida2.calcularValorCorrida(6));		
		System.out.println(corrida3.calcularValorCorrida(6));
	}
	

}
