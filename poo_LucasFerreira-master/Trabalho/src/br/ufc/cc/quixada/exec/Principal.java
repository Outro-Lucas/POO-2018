package br.ufc.cc.quixada.exec;

import br.ufc.cc.quixada.model.Administrador;
import br.ufc.cc.quixada.model.Empregado;
import br.ufc.cc.quixada.model.Fornecedor;
import br.ufc.cc.quixada.model.Operário;
import br.ufc.cc.quixada.model.Pessoa;
import br.ufc.cc.quixada.model.Vendedor;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa Eu = new Pessoa("Lucas", "Quixadá", "88735167");
		Empregado ep = new Empregado("Igor", "Quixadá", "6666666666",5, 1000, 50);
		Administrador Admin = new Administrador("João", "Quixadá", "5558547",5, 1000, 50, 1000);
		Fornecedor f1 = new Fornecedor("Romes", "Quixadá", "8252167", 1000, 400);
		Vendedor v1 = new Vendedor("Outro Igor", "Quixadá", "665656456",5, 1000, 50, 5000, 60);
		Operário op = new Operário("Irineu", "Quixada", "665656456",5, 1000, 50, 1000, 60);
		
		ep.calcularSalario();
		Admin.calcularSalarioa();
		f1.obterSaldo();
		v1.calculaSalariov();
		op.calcularSalarioo();

		Eu.mostraP();
		System.out.println("\n");
		ep.mostraE();
		System.out.println("\n");
		Admin.mostraA();
		System.out.println("\n");
		f1.mostraF();
		System.out.println("\n");
		v1.mostraV();
		System.out.println("\n");
		op.mostraO();
		
	}

}
