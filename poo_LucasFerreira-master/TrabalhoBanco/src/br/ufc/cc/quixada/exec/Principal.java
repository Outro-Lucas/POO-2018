package br.ufc.cc.quixada.exec;

import br.ufc.cc.quixada.model.ContaBancaria;
import br.ufc.cc.quixada.model.ContaCorrente;
import br.ufc.cc.quixada.model.ContaPoupança;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContaBancaria contacorrente1 = new ContaCorrente(50, 1, 1000);
		ContaBancaria contapoupança1 = new ContaPoupança(60, 17, 5.0);
	}

}
