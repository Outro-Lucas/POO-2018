package br.ufc.quixada.cc.exec;

import java.time.LocalDate;

import br.ufc.quixada.cc.model.Agenda;
import br.ufc.quixada.cc.model.PessoaFisica;
import br.ufc.quixada.cc.model.PessoaJuridica;
//import br.ufc.quixada.cc.model.Agenda;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate datanasc = LocalDate.of(1955, 03, 21);
		PessoaFisica p1 = new PessoaFisica("Bolsonaro","Rio de Janeiro","mito@gmail.com",17, "casado", datanasc);
		PessoaJuridica p2 = new PessoaJuridica("Haddad", "São Paulo", "haddadélula@gmail.com", 13, "algo", "PT");
		Agenda agenda = new Agenda();
		agenda.addPessoaFisica(p1);
		agenda.addPessoaJuridica(p2);
		agenda.mostrar();
		agenda.ordenaFisica(agenda.getFisica());
		agenda.ordenaJuridica(agenda.getJuridica());
	}
	

}
