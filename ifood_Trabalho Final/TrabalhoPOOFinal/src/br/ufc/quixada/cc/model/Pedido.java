package br.ufc.quixada.cc.model;

public class Pedido implements Imprimival{
    Map<Integer, Pedido> pedidos = new HashMap<>();
    
    public Pedido(){
    }
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
    
    public void cardapio(){
        System.out.println("------------------------------------------" + '\n' +
                "---------------- iFood UFC ---------------" + '\n' +
                "------------------------------------------" + '\n' +
                '\n' + '\n' +
                "--> Card�pio <--" + '\n');
        
        System.out.println("Op��es para Fruta:");
        System.out.println("1."(String)mapa.get(1));
        System.out.println("2."(String)mapa.get(2));
        System.out.println("Op��es para Doce:");
        System.out.println(""(String)mapa.get(3));
        System.out.println(""(String)mapa.get(4));
        System.out.println("Op��es de Gr�os:");
        System.out.println(""(String)mapa.get(5));
        System.out.println(""(String)mapa.get(6));
        System.out.println(""(String)mapa.get(7));
    	System.out.println(""(String)mapa.get(8));
        System.out.println("Op��es de Carne:");
    	System.out.println(""(String)mapa.get(9));
    	System.out.println(""(String)mapa.get(10));
    	System.out.println(""(String)mapa.get(11));
        System.out.println("Op��es Vegetarianas:");
    	System.out.println(""(String)mapa.get(12));
    	System.out.println(""(String)mapa.get(13));
    }
}
