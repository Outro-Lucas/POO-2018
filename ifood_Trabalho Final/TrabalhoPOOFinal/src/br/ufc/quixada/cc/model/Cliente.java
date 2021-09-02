package br.ufc.quixada.cc.model;
import java.util.ArrayList;
import java.util.List;
import br.ufc.quixada.cc.model.Conta;

public class Cliente extends Conta {
    private List <NotaFiscal> historico = new ArrayList <>();
    public Cliente() {
    	
    }
    public Cliente(String nome, String cpf, String numFone, int senha) {
        super(nome, cpf, numFone, senha);
    } 
    public void registrarCompra(NotaFiscal nota) {
    	historico.add(nota);
    }
    public void imprimirHistorico() {
    	for(int i=0;i<historico.size();i++) {
    		historico.get(i).gerarNota();
    	}
    }
    public String toString() {
    	String to="\nNome: "+getNome()+'\n'
    			+"CPF: "+getCpf()+'\n'
    			+"Numero de Telefone: "+getNumFone()+'\n';
    	return to;
    }
}
