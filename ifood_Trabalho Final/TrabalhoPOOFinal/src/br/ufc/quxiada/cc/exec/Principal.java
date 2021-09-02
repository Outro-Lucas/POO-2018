package br.ufc.quxiada.cc.exec;

import br.ufc.quixada.cc.model.Cliente;
import br.ufc.quixada.cc.model.Conta;
import br.ufc.quixada.cc.model.Moderador;
import java.util.Scanner;

public class Principal {
    public static void clear() {
        for(int i = 0; i < 50; i++) System.out.println();
    }
    
    public static void menu(Cliente conta, Moderador mod) {
        Scanner in = new Scanner(System.in);
        System.out.println("------------------------------------------" + '\n' +
                           "---------------- iFood UFC ---------------" + '\n' +
                           "------------------------------------------" + '\n' +
                           '\n' + '\n' +
                           "1. Criar conta" + '\n' +
                           "2. Login" + '\n' +
                           "3. Login Moderador" + '\n' +
                           "4. Finalizar");
        int x = in.nextInt();
        switch(x) {
            case 1 : 
                clear();
                criarConta(conta, mod);
            
            case 2 :
                clear();
                login(conta, mod);
                
            case 3 : 
                clear();
                loginMod(conta, mod);
            
            case 4 :
                System.exit(0);
            
            default :
                clear();
                menu(conta, mod);
        }
    }
    
    public static void criarConta(Cliente conta, Moderador mod) {
        Scanner in = new Scanner(System.in);
        System.out.println("------------------------------------------" + '\n' +
                           "---------------- iFood UFC ---------------" + '\n' +
                           "------------------------------------------" + '\n' +
                           '\n' + '\n' +
                           "--> Criando conta <--" + '\n' +
                           "Nome: ");
        String nome = in.next();
        System.out.println('\n' + "CPF: ");
        String cpf = in.next();
        System.out.println('\n' + "numFone: ");
        String numFone = in.next();
        System.out.println('\n' + "Senha: ");
        int senha = in.nextInt();
        if(conta.login(senha) != null) {
            clear();
            System.out.println("--> Tente novamente" + '\n');
            criarConta(conta, mod);            
        }
        Cliente cliente = new Cliente(nome, cpf, numFone, senha);
        conta.inserir(cliente, senha);
        clear();
        System.out.println("--> Conta adicionada." + '\n');
        menu(conta, mod);
    }
    
    public static void login(Cliente conta, Moderador mod) {
        Scanner in = new Scanner(System.in);
        System.out.println("------------------------------------------" + '\n' +
                           "---------------- iFood UFC ---------------" + '\n' +
                           "------------------------------------------" + '\n' +
                           '\n' + '\n' +
                           "--> Login <--" + '\n');
        System.out.println("Senha: ");
        int senha = in.nextInt();
        if((conta.login(senha)) != null) fazerPedido(conta, mod);
        else {
            clear();
            System.out.println('\n' + "--> Conta inexistente");
            menu(conta, mod);
        }
    }
    
    public static void loginMod(Cliente conta, Moderador mod) {
        Scanner in = new Scanner(System.in);
        System.out.println("------------------------------------------" + '\n' +
                           "---------------- iFood UFC ---------------" + '\n' +
                           "------------------------------------------" + '\n' +
                           '\n' + '\n' +
                           "--> Login Moderador <--" + '\n');
        System.out.println("Senha: ");
        int senha = in.nextInt();
        if((mod.login(senha)) != null) painelMod(conta, mod);
        else {
            clear();
            System.out.println('\n' + "--> Acesso negado");
            menu(conta, mod);
        }
    }
    
    public static void fazerPedido(Conta conta, Moderador mod) {
        
    }
    
    public static void painelMod(Conta conta, Moderador mod) {
        
    }
    
    public static void main(String[] args) {
        Cliente conta = new Cliente();
        Moderador mod = new Moderador("Moderador", "xxx.xxx.xxx-xx", 
                                      "xxxxxxxxxxx", 123);
        menu(conta, mod);
    }
}
