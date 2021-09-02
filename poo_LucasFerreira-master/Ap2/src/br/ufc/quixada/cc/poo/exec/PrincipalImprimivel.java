package br.ufc.quixada.cc.poo.exec;

import java.time.LocalDate;

import br.ufc.quixada.cc.poo.model.Cliente;
import br.ufc.quixada.cc.poo.model.ClientePessoaFisica;
import br.ufc.quixada.cc.poo.model.ClientePessoaJuridica;
import br.ufc.quixada.cc.poo.model.Funcionario;
import br.ufc.quixada.cc.poo.model.Motorista;
import br.ufc.quixada.cc.poo.model.Onibus;
import br.ufc.quixada.cc.poo.model.Passagem;
import br.ufc.quixada.cc.poo.model.Vendedor;

public class PrincipalImprimivel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate datanasc = LocalDate.of(2000, 06, 17);
		LocalDate datapar = LocalDate.of(2018,12,25);
		Funcionario v1 = new Vendedor("Pedro", "111", "687", 1000, 24);
		Funcionario v3 = new Vendedor("Mario", "222", "665", 1000, 24);
		Funcionario v2 = new Vendedor("Josué", "24", "24", 1000, 24);
		Motorista m = new Motorista("José", "555", "685", 1000, "688");
		Cliente cp1 = new ClientePessoaFisica("Lucas", "Quixada", "555", datanasc);
		Cliente cj1 = new ClientePessoaJuridica("Lucs", "Q", "545", datanasc);
		Cliente cp2 = new ClientePessoaFisica("Luca", "xada", "535", datanasc);
		
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
		p1.setVendedor(v2);
		p1.setDataPartida(datapar);
		p1.setHorario(15);
		p1.setPoltrona(56);
		p1.setValorPassagem(16);
		
		Passagem p3 = new Passagem();
		p1.setCodPassagem(17);
		p1.setCliente(cp2);
		p1.setVendedor(v3);
		p1.setDataPartida(datapar);
		p1.setHorario(10);
		p1.setPoltrona(60);
		p1.setValorPassagem(16);
		
		Onibus o = new Onibus();
		o.setCodOnibus(1);
		o.setMotorista(m);
		
		o.adicionarPassagemOnibus(p1);
		o.adicionarPassagemOnibus(p2);
		o.adicionarPassagemOnibus(p3);
		o.mostrarPassagens();
	}

}
