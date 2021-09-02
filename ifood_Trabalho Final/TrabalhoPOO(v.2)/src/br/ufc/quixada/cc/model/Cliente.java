package br.ufc.quixada.cc.model;
import br.ufc.quixada.cc.model.Conta;


import java.util.HashMap;
import java.util.Map;

public class Cliente extends Conta {
    
	Map<Integer, Cliente> map = new HashMap<>();
    
    public Cliente() {}
    
    public Cliente(String nome, String cpf, String numFone, int senha) {
        super(nome, cpf, numFone, senha);
    }
    
    public void inserir(Cliente cliente, String nome, int codigo) {
        map.put(codigo, cliente);
    }
        
    public Cliente loginNick(String nome){
    	return map.get(nome);
    }
    public Cliente login(int codigo) {
        return map.get(codigo);
    }   
}
