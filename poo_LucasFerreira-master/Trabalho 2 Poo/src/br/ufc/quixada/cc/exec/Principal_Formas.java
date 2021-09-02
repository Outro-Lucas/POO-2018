package br.ufc.quixada.cc.exec;

import br.ufc.quixada.cc.model.Circulo;
import br.ufc.quixada.cc.model.Quadrado;
import br.ufc.quixada.cc.model.Retangulo;

public class Principal_Formas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circulo c1 = new Circulo("Verde", 5.00);
		Quadrado q1 = new Quadrado("Amarelo", 4);
		Retangulo r1 = new Retangulo("Azul", 4, 10);
		System.out.println("Perimetro do Circulo: "+c1.perimetroC(5.00));
		System.out.println("Área do Circulo: "+c1.areaC(5.00));
		System.out.println("Perimetro do Quadrado: "+q1.perimetroQ(4));
		System.out.println("Área do Quadrado: "+q1.areaQ(4));
		System.out.println("Perimetro do Retangulo: "+r1.perimetroR(4, 10));		
		System.out.println("Área do Retangulo: "+r1.areaR(4, 10));
		
	}

}
