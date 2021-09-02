package br.ufc.quixada.cc.exec;

import br.ufc.quixada.cc.model.Cliente;
import br.ufc.quixada.cc.model.Conta;
import br.ufc.quixada.cc.model.Moderador;
import br.ufc.quixada.cc.model.NotaFiscal;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Principal {
    private static Scanner sc;
	private static int res;
    
    public static void menu(Cliente conta, Moderador mod) {
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        System.out.print("------------------------------------------" + '\n' +
                           "---------------- iFood UFC ---------------" + '\n' +
                           "------------------------------------------" + '\n' +
                           '\n' + '\n' +
                           "1. Criar conta" + '\n' +
                           "2. Login" + '\n'+
                           "3. Login Moderador" + '\n' +
                           "4. Finalizar" + '\n' +
                           "Escolha sua opção: ");
        int x = in.nextInt();
        switch(x) {
            case 1 : 
                criarConta(conta);
            
            case 2 :
                login(conta);
                
            case 3 : 
                loginMod(conta, mod);
            
            case 4 :
                System.exit(0);
            
            default :
                menu(conta, mod);
        }
    }
    
    public static void criarConta(Cliente conta) {
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        System.out.print("------------------------------------------" + '\n' +
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
           // clear();
            System.out.println("--> Tente novamente" + '\n');
            criarConta(conta);            
        }
        try{
        FileWriter filewriter = new FileWriter("/Users/Lucas/Desktop/Nova pasta/arquivo.txt");
        PrintWriter printwriter = new PrintWriter(filewriter);
        printwriter.print("Nome:");
        printwriter.println(nome);
        printwriter.print("Senha:");
        printwriter.println(senha);
        filewriter.close();
        }catch(Exception e){
        	System.out.println("Erro ao criar arquivo");
        }
        
        Cliente cliente = new Cliente(nome, cpf, numFone, senha);
        conta.inserir(cliente, nome, senha);
       // clear();
        System.out.println("--> Conta adicionada." + '\n');
        menu(conta, null);
    }
    
    public static void login(Cliente conta) {
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        System.out.print("------------------------------------------" + '\n' +
                           "---------------- iFood UFC ---------------" + '\n' +
                           "------------------------------------------" + '\n' +
                           '\n' + '\n' +
                           "--> Login <--" + '\n');
        System.out.print("Nome: ");
        String nom = in.nextLine();
        if((conta.loginNick(nom))!= null){
        	fazerPedido(conta, null, null);
        }
        System.out.println("Senha: ");
        int senha = in.nextInt();
        if((conta.login(senha)) != null){
        	fazerPedido(conta, null, null);
        }
        else {
            //clear();
            System.out.println('\n' + "--> Conta inexistente");
            menu(conta, null);
        }
    }
    
    public static void loginMod(Cliente conta, Moderador mod) {
        @SuppressWarnings("resource")
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
            //clear();
            System.out.println('\n' + "--> Acesso negado");
            menu(conta, mod);
        }
    }
    
    public static void fazerPedido(Conta conta, Moderador mod, NotaFiscal nota) {
        Map<Integer, String> pedidos = new HashMap<Integer, String>();
        ArrayList<String> list = new ArrayList<>();
    	@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
            System.out.println("------------------------------------------" + '\n' +
                    "---------------- iFood UFC ---------------" + '\n' +
                    "------------------------------------------" + '\n' +
                    '\n' + '\n' +
                    "--> Cardápio <--" + '\n');
            pedidos.put(1, "Maçã");
            pedidos.put(2, "Melancia");
            pedidos.put(3, "Paçoquita");
            pedidos.put(4, "Cocada");
            pedidos.put(5, "Arroz Parbolizado");
            pedidos.put(6, "Macarrão");
            pedidos.put(7, "Feijão");
            pedidos.put(8, "Feijoada");
            pedidos.put(9, "Carne de Boi");
            pedidos.put(10, "Carne de Porco");
            pedidos.put(11, "Frango");
            pedidos.put(12, "Bola de Quijo");
            pedidos.put(13, "Yakisoba");
            
            System.out.println("Escolha uma fruta(1) ou um doce(2)!");
            int k = ler.nextInt();
            int com;
            if(k == 1){
            	System.out.println("Opções para Fruta:");
                System.out.println("1."+(String)pedidos.get(1));
                System.out.println("2."+(String)pedidos.get(2));
                System.out.println("Sua Escolha: ");
                com = ler.nextInt();
                if(com==1){
                list.add(pedidos.get(1));
                }else if(com==2) list.add(pedidos.get(2));
            }else if(k == 2){
            	System.out.println("Opções para Doce:");
                System.out.println("3."+(String)pedidos.get(3));
                System.out.println("4."+(String)pedidos.get(4));	
                com = ler.nextInt();
                if(com==3){
                list.add(pedidos.get(3));
                }else if(com==4) list.add(pedidos.get(4));
            }
            
            System.out.println("Arroz: (Sim .1 | Não .2)");
            System.out.println("5."+(String)pedidos.get(5));
            com = ler.nextInt();
            if(com==1)list.add(pedidos.get(5));
            else;
            System.out.println("Macarrão: (Sim .1 | Não .2)");
            System.out.println("6."+(String)pedidos.get(6));
            com = ler.nextInt();
            if(com==1)list.add(pedidos.get(6));            
            else;
            System.out.println("Feijão:  (Sim .1 | Não .2)");
            System.out.println("7."+(String)pedidos.get(7));
            com=ler.nextInt();
            if(com==1) list.add(pedidos.get(7));
            else;
        	System.out.println("Escolha uma opção de carne(3) ou o vegetariano(4)!");
        	k=ler.nextInt();
        	if(k==3){
        	System.out.println("Opções de Carne:");
        	System.out.println("8."+(String)pedidos.get(8));
        	System.out.println("9."+(String)pedidos.get(9));
        	System.out.println("10."+(String)pedidos.get(10));
        	System.out.println("11."+(String)pedidos.get(11));
        	com = ler.nextInt();
        	if(com==8){
        		list.add(pedidos.get(8));
        	}else if(com==9){
        		list.add(pedidos.get(9));
        	}else if(com==10){
        		list.add (pedidos.get(10));
        	}else if (com==11){
        		list.add(pedidos.get(11));
        	}
        	}else if(k==4){
        	System.out.println("Opções Vegetarianas:");
        	System.out.println("12."+(String)pedidos.get(12));
        	System.out.println("13."+(String)pedidos.get(13));
        	com = ler.nextInt();
        	if(com==12){
        		list.add(pedidos.get(12));
        	}else if(com==13){
        		list.add(pedidos.get(12));
        	}
        	}
        	System.out.println("Confirma seus pedidos? Sim(1) Não(2)");
        	for (int i=0;i<list.size();i++){
        		System.out.println(list.get(i));
        	}
        	int confirma = ler.nextInt();
        	if (confirma==1){
        		System.out.print("Seu pedido foi confirmado..");
        		entrega(conta, nota);
        		menu((Cliente) conta, null);
        	} else if(confirma == 2){
        		fazerPedido(conta, null, nota);
        	}
        	
    }
    
    public static void entrega(Conta conta, NotaFiscal nota){
    	sc = new Scanner(System.in); 
    	System.out.println(" Informe o local da entrega: ");
    	System.out.println("1. Blco Administrativo;");
    	System.out.println("2. Area de Convivência;");
    	System.out.println("3. Bloco 1;");
    	System.out.println("4. Bloco 2;");
    	System.out.println("5. Bloco 3;");
    	System.out.println("6. Bloco 4;");
    	res = sc.nextInt();
    	if(res==1){
    		System.out.println("Frete: R$ 1,50, aguarde enquanto realizaremos a entrega."); 
    		//nota.gerarNota();
    	}
    	if(res==2){
    		System.out.println("Frete: R$ 2,10 aguarde enquanto realizaremos a entrega."); 
    		//nota.gerarNota();
    	}
    	if(res==3){
    		System.out.println("Frete: R$ 3,10 aguarde enquanto realizaremos a entrega."); 
    		//nota.gerarNota();
    	}
    	if(res==4){
    		System.out.println("Frete: R$ 4,10 aguarde enquanto realizaremos a entrega."); 
    		nota.gerarNota();
    	}
    	if(res==5){
    		System.out.println("Frete: R$ 3,10 aguarde enquanto realizaremos a entrega."); 
    		//nota.gerarNota();
    	}
    	if(res==6){
    		System.out.println("Frete: R$ 4,10 aguarde enquanto realizaremos a entrega."); 
    		//nota.gerarNota();
    	}

    	
    }
    
    public static void painelMod(Conta conta, Moderador mod) {
        
    }
    
    public static void main(String[] args) {
        Cliente conta = new Cliente();
        Moderador mod = new Moderador("Moderador", "xxx.xxx.xxx-xx", 
                                      "xxxxxxxxxxx", 123);
        NotaFiscal nota = new NotaFiscal("Av. José de Freitas Queiroz, 5003 - Cedro, Quixadá - CE, 63900-000", "5555");        
        menu(conta, mod);

    }
}
