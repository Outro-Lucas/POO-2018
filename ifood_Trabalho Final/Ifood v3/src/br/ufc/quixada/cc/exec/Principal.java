package br.ufc.quixada.cc.exec;

import br.ufc.quixada.cc.model.Cliente;




import br.ufc.quixada.cc.model.Conta;
import br.ufc.quixada.cc.model.Moderador;
import br.ufc.quixada.cc.model.NotaFiscal;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Principal {
    private static Scanner sc;
	private static int res;
	static String salvarDados="salvarDados";
	static Map<Integer, Cliente> map = new HashMap<>();
	static Moderador mod = new Moderador("Moderador", "xxx.xxx.xxx-xx", 
            "xxxxxxxxxxx", 123);        
    
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
                           "Escolha sua op��o: ");
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
        if(map.get(senha) != null) {
           // clear();
            System.out.println("--> Tente novamente" + '\n');
            criarConta(conta);            
        }
        conta.setCpf(cpf);
        conta.setNome(nome);
        conta.setNumFone(numFone);
        conta.setSenha(senha);
        map.put(senha, conta);
        try{
        	File arqBin = new File(salvarDados);
        	FileOutputStream out = new FileOutputStream(arqBin);
	        ObjectOutputStream obj = new ObjectOutputStream(out);
	        obj.writeObject(map); //erro esta nessa linha
	        out.close();
	        obj.close();
        }catch(Exception e){
        	System.out.println("Erro ao criar arquivo");
        }
       // clear();
        System.out.println("--> Conta adicionada." + '\n');
        Cliente contaa = new Cliente();
        menu(contaa, mod);
    }
    
    public static void login(Cliente conta) {
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        System.out.print("------------------------------------------" + '\n' +
                           "---------------- iFood UFC ---------------" + '\n' +
                           "------------------------------------------" + '\n' +
                           '\n' + '\n' +
                           "--> Login <--" + '\n');
        System.out.println("Senha: ");
        int senha = in.nextInt();
        try{
        	File arqBin = new File(salvarDados);
        	InputStream inp = new FileInputStream(arqBin);
        	ObjectInputStream obj = new ObjectInputStream(inp);
        	map=(HashMap<Integer,Cliente>)obj.readObject(); //erro esta aqui
        }catch(ClassNotFoundException e1){
        	System.out.println("Erro na leitura");
        }catch(IOException e2) {
        	System.out.println("Erro na leitura");
        }
        if(map.get(senha)!=null){
        	conta=map.get(senha);
        	NotaFiscal nota = new NotaFiscal();
        	fazerPedido(conta, nota);
        }
        else {
            //clear();
            System.out.println('\n' + "--> Conta inexistente");
            menu(conta, mod);
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
        if(senha==123) painelMod(mod);
        else {
            //clear();
            System.out.println('\n' + "--> Acesso negado");
            menu(conta, mod);
        }
    }
    
    public static void fazerPedido(Conta conta, NotaFiscal nota) {
        Map<Integer, String> pedidos = new HashMap<Integer, String>();
        ArrayList<String> list = new ArrayList<>();
        float preco=0;
    	@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
            System.out.println("------------------------------------------" + '\n' +
                    "---------------- iFood UFC ---------------" + '\n' +
                    "------------------------------------------" + '\n' +
                    '\n' + '\n' +
                    "--> Card�pio <--" + '\n');
            pedidos.put(1, "Ma��");
            pedidos.put(2, "Melancia");
            pedidos.put(3, "Pa�oquita");
            pedidos.put(4, "Cocada");
            pedidos.put(5, "Arroz");
            pedidos.put(6, "Macarr�o");
            pedidos.put(7, "Feij�o");
            pedidos.put(8, "Feijoada");
            pedidos.put(9, "Carne de Boi");
            pedidos.put(10, "Carne de Porco");
            pedidos.put(11, "Frango");
            pedidos.put(12, "Bola de Quijo");
            pedidos.put(13, "Yakisoba");
            
            System.out.println("Escolha ou uma fruta(1) ou um doce(2)!");
            int k = ler.nextInt();
            int com;
            if(k == 1){
            	System.out.println("Op��es para Fruta:");
                System.out.println("1."+(String)pedidos.get(1));
                System.out.println("2."+(String)pedidos.get(2));
                System.out.println("Sua Escolha: ");
                com = ler.nextInt();
                if(com==1){
                list.add(pedidos.get(1));
                preco=(float) (preco+0.5);
                }else if(com==2) { 
                	list.add(pedidos.get(2));
                	preco=(float) (preco+0.4);
                }
            }else if(k == 2){
            	System.out.println("Op��es para Doce:");
                System.out.println("3."+(String)pedidos.get(3));
                System.out.println("4."+(String)pedidos.get(4));	
                com = ler.nextInt();
                if(com==3){
                list.add(pedidos.get(3));
                preco=(float) (preco+0.8);
                }else if(com==4) { 
                	list.add(pedidos.get(4));
                	preco=(float) (preco+0.9);
                }
            }
            
            System.out.println("Arroz: (Sim .1 | N�o .2)");
            System.out.println("5."+(String)pedidos.get(5));
            com = ler.nextInt();
            if(com==1) {
            	list.add(pedidos.get(5));
            	preco=(float) (preco+1.2);
            }
            System.out.println("Macarr�o: (Sim .1 | N�o .2)");
            System.out.println("6."+(String)pedidos.get(6));
            com = ler.nextInt();
            if(com==1) {
            	list.add(pedidos.get(6));
            	preco=(float) (preco+1.5);
            }
            System.out.println("Feij�o:  (Sim .1 | N�o .2)");
            System.out.println("7."+(String)pedidos.get(7));
            com=ler.nextInt();
            if(com==1) { 
            	list.add(pedidos.get(7));
            	preco=(float) (preco+1.3);
            }
        	System.out.println("Escolha uma op��o de carne(3) ou o vegetariano(4)!");
        	k=ler.nextInt();
        	if(k==3){
        	System.out.println("Op��es de Carne:");
        	System.out.println("8."+(String)pedidos.get(8));
        	System.out.println("9."+(String)pedidos.get(9));
        	System.out.println("10."+(String)pedidos.get(10));
        	System.out.println("11."+(String)pedidos.get(11));
        	com = ler.nextInt();
        	if(com==8){
        		list.add(pedidos.get(8));
        		preco=(float) (preco+1.8);
        	}else if(com==9){
        		list.add(pedidos.get(9));
        		preco=(float) (preco+1.6);
        	}else if(com==10){
        		list.add (pedidos.get(10));
        		preco=(float) (preco+1.7);
        	}else if (com==11){
        		list.add(pedidos.get(11));
        		preco=(float) (preco+1.9);
        	}
        	}else if(k==4){
        	System.out.println("Op��es Vegetarianas:");
        	System.out.println("12."+(String)pedidos.get(12));
        	System.out.println("13."+(String)pedidos.get(13));
        	com = ler.nextInt();
        	if(com==12){
        		list.add(pedidos.get(12));
        		preco=(float) (preco+2.5);
        	}else if(com==13){
        		list.add(pedidos.get(12));
        		preco=(float) (preco+2.6);
        	}
        	}
        	System.out.println("Confirma seus pedidos? Sim(1) N�o(2)");
        	for (int i=0;i<list.size();i++){
        		System.out.println(list.get(i));
        	}
        	System.out.println("pre�o: "+preco);
        	int confirma = ler.nextInt();
        	if (confirma==1){
        		System.out.print("Seu pedido foi confirmado..");
        		entrega(conta, nota, preco, list);
        		System.out.println("Deseja imprimir seu historico de compras?\n (1) sim\n (2) nao\n");
        		int sim;
        		sim = sc.nextInt();
        		if(sim==1) {
        			((Cliente)conta).imprimirHistorico();
        		}
        		menu((Cliente) conta, mod);
        	} else if(confirma == 2){
        		fazerPedido(conta, nota);
        	}
        	
    }
    
    public static void entrega(Conta conta, NotaFiscal nota, float preco, ArrayList<String> list){
    	sc = new Scanner(System.in); 
    	System.out.println(" Informe o local da entrega: ");
    	System.out.println("1. Blco Administrativo;");
    	System.out.println("2. Area de Conviv�ncia;");
    	System.out.println("3. Bloco 1;");
    	System.out.println("4. Bloco 2;");
    	System.out.println("5. Bloco 3;");
    	System.out.println("6. Bloco 4;");
    	res = sc.nextInt();
    	if(res==1){
    		System.out.println("Frete: R$ 1,50, aguarde enquanto realizaremos a entrega.");
    		nota.setLocaliza��o("Bloco Administrativo");
    		preco=(float) (preco+1.50);
    		String s = ""+ preco;
    		list.add("Valor pago: "+s);
    		nota.setPedido(list);
    		((Cliente) conta).registrarCompra(nota);
    		nota.gerarNota();
    	}
    	if(res==2){
    		System.out.println("Frete: R$ 2,10 aguarde enquanto realizaremos a entrega.");
    		preco=(float) (preco+2.10);
    		nota.setLocaliza��o("Area de Conviv�ncia");
    		String s = ""+ preco;
    		list.add("Valor pago: "+s);
    		nota.setPedido(list);
    		((Cliente) conta).registrarCompra(nota);
    		nota.gerarNota();
    	}
    	if(res==3){
    		System.out.println("Frete: R$ 3,10 aguarde enquanto realizaremos a entrega.");
    		nota.setLocaliza��o("Bloco 1");
    		preco=(float) (preco+3.10);
    		String s = ""+ preco;
    		list.add("Valor pago: "+s);
    		nota.setPedido(list);
    		((Cliente) conta).registrarCompra(nota);
    		nota.gerarNota();
    	}
    	if(res==4){
    		System.out.println("Frete: R$ 4,10 aguarde enquanto realizaremos a entrega.");
    		nota.setLocaliza��o("Bloco 2");
    		preco=(float) (preco+4.10);
    		String s = ""+ preco;
    		list.add("Valor pago: "+s);
    		nota.setPedido(list);
    		((Cliente) conta).registrarCompra(nota);
    		nota.gerarNota();
    	}
    	if(res==5){
    		System.out.println("Frete: R$ 3,10 aguarde enquanto realizaremos a entrega.");
    		nota.setLocaliza��o("Bloco 3");
    		preco=(float) (preco+3.10);
    		String s = ""+ preco;
    		list.add("Valor pago: "+s);
    		nota.setPedido(list);
    		((Cliente) conta).registrarCompra(nota);
    		nota.gerarNota();
    	}
    	if(res==6){
    		System.out.println("Frete: R$ 4,10 aguarde enquanto realizaremos a entrega.");
    		nota.setLocaliza��o("Bloco 4");
    		preco=(float) (preco+4.10);
    		String s = ""+ preco;
    		list.add("Valor pago: "+s);
    		nota.setPedido(list);
    		((Cliente) conta).registrarCompra(nota);
    		nota.gerarNota();
    	}
    }
    
    public static void painelMod(Moderador mod) {
        System.out.println("Menu do Moderador: (1) Listar Contas: \n (2) Remover conta: (3) Ver historico de compras de um cliente \n outro valor para sair: \n");
        sc= new Scanner(System.in);
        int opcao=sc.nextInt();
        if(opcao==1) {
        	mod.mostrarContas((HashMap<Integer, Cliente>) map);
        	painelMod(mod);
        }
        else if(opcao==2) {
        	System.out.println("Insira o codigo da conta a ser removida: ");
        	int codigo=sc.nextInt();
        	mod.remover((HashMap<Integer, Cliente>) map, codigo);
        	painelMod(mod);
        }
        else if(opcao==3) {
        	System.out.println("Insira o codigo da conta do cliente: ");
        	int codigo=sc.nextInt();
        	Cliente contaH = map.get(codigo);
        	if(contaH!=null) {
        		mod.exibirCompras(contaH);
        	}
        }
        else {
        	Cliente conta = new Cliente();
        	menu(conta, mod);
        }
    }
    public static void abrirArquivo() throws IOException {
    	File arqBin = new File(salvarDados);
    	if(!arqBin.exists()){
    		 arqBin.createNewFile();
    	}
    }
    public static void main(String[] args) throws IOException {
        Cliente conta = new Cliente();
        abrirArquivo();
        menu(conta, mod);

    }
}