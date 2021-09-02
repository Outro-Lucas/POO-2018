package br.ufc.quixada.cc.model;

public class Pedido implements Imprimival{
    Map<Integer, Pedido> pedidos = new HashMap<>();
    
    public Pedido(){
    }
    pedidos.put(1, "Maçã");
    pedidos.put(2, "Melancia");
    pedidos.put(3, "Paçoquita");
    pedidos.put(4, "Cocada");
    pedidos.put(5, "Arroz");
    pedidos.put(6, "Macarrão");
    pedidos.put(7, "Feijão");
    pedidos.put(8, "Feijoada");
    pedidos.put(9, "Carne de Boi");
    pedidos.put(10, "Carne de Porco");
    pedidos.put(11, "Frango");
    pedidos.put(12, "Bola de Quijo");
    pedidos.put(13, "Yakisoba");
    
    public void cardapio(){
        System.out.println("------------------------------------------" + '\n' +
                "---------------- iFood UFC ---------------" + '\n' +
                "------------------------------------------" + '\n' +
                '\n' + '\n' +
                "--> Cardápio <--" + '\n');
        
        System.out.println("Opções para Fruta:");
        System.out.println("1."(String)mapa.get(1));
        System.out.println("2."(String)mapa.get(2));
        System.out.println("Opções para Doce:");
        System.out.println(""(String)mapa.get(3));
        System.out.println(""(String)mapa.get(4));
        System.out.println("Opções de Grãos:");
        System.out.println(""(String)mapa.get(5));
        System.out.println(""(String)mapa.get(6));
        System.out.println(""(String)mapa.get(7));
    	System.out.println(""(String)mapa.get(8));
        System.out.println("Opções de Carne:");
    	System.out.println(""(String)mapa.get(9));
    	System.out.println(""(String)mapa.get(10));
    	System.out.println(""(String)mapa.get(11));
        System.out.println("Opções Vegetarianas:");
    	System.out.println(""(String)mapa.get(12));
    	System.out.println(""(String)mapa.get(13));
    }
}
