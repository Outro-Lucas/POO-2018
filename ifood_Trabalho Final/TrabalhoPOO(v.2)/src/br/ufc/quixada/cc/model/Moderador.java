package br.ufc.quixada.cc.model;

import java.util.HashMap;
import java.util.Map;

public class Moderador extends Conta {
    Map<Integer, Moderador> mapMod = new HashMap<>();
    
    public Moderador() {}
    
    public Moderador(String nome, String cpf, String numFone, int senha) {
        super(nome, cpf, numFone, senha);
    }
    
    public Moderador login(int codigo) {
        return mapMod.get(codigo);
    } 
    
    public void remover(int codigo) {
   
    }

    public void mostrarContas() {
        
    }
    
}
