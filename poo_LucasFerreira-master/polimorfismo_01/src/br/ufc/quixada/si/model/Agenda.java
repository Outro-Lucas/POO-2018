package br.ufc.quixada.si.model;

import java.util.Scanner;

public class Agenda {
    public static Scanner ler = new Scanner(System.in);
    private Pessoa[] pessoas = new Pessoa[50];
    
    public Agenda(Pessoa[] pessoas){
        this.pessoas = pessoas;
    }
    
    public Agenda(){
    
    }
    
    public void addPessoa(Pessoa p){
        for(int i = 0; i < pessoas.length; i++){
            if(pessoas[i] == null){
                pessoas[i] = p;
                break;
            }
        }
    }  
    
    public void removePessoa(){
        System.out.println("Digite o nome da pessoa que deseja remover: ");
        String remover = ler.next();
        
        for(int i = 0; i < pessoas.length; i++){
            if(pessoas[i].getNome().equals(remover)){
                pessoas[i] = null;
                break;
            }
        }
        System.out.println("-------------------------------");
    }
    
    public void buscarPessoa(){
        System.out.println("Digite o nome da pessoa que deseja achar: ");
        String busca = ler.next();
        
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getNome().equals(busca)) {
                System.out.println(pessoa);
                break;
            }
        }
    }
    
    public void imprimeAgenda(){
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof PessoaFisica) {
                System.out.println((PessoaFisica) pessoa);
                System.out.println("-------------------------------");
            } else if (pessoa instanceof PessoaJuridica) {
                System.out.println((PessoaJuridica) pessoa);
                System.out.println("-------------------------------");
            }
        }
    }
    
    public void ordenaVetor(){
        for(int i = 0; i < pessoas.length; i++){
            for(int j = 0; j < pessoas.length - 1; j++){
                if(pessoas[i] instanceof PessoaFisica && 
                   pessoas[j] instanceof PessoaJuridica){
                        Pessoa aux = pessoas[i];
                        pessoas[i] = pessoas[j];
                        pessoas[j] = aux;
                }
            }
        }
    }
}
