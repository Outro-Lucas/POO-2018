package br.ufc.quixada.cc.model;
import java.util.HashMap;
import java.util.Map.Entry;

public class Moderador extends Conta {
    public Moderador() {
    	
    }
    public Moderador(String nome, String cpf, String numFone, int senha) {
        super(nome, cpf, numFone, senha);
    }
    public void remover(HashMap<Integer,Cliente>map, int codigo) {
    	
    }
    public void mostrarContas(HashMap<Integer,Cliente>map) {
    	for(Entry<Integer, Cliente> entry : map.entrySet()) {
    		System.out.println(entry.getValue());
    	}
    }  
}
