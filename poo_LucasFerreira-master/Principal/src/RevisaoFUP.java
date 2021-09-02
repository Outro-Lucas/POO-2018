import java.util.Scanner;

public class RevisaoFUP {
	//a)
	public static int mYor(int a, int b){
		if (a>b){
			return a;
		}
		else return b;
	}

	//b)
	public static int mEnor(int a, int b){
	if (a<b){
		return a;
	}
	else return b;
}


	//c)
public static String inserirNome(){
String nome=("Lucas");
return nome;
}

	//d)
public static void repeNome(){
	for(int i=0;i>100;){
		System.out.println("Lucas Ferreira");
}
}

	//e)
public static boolean calculaNota(double n1, double n2){
	int media=(n1+n2)/2;
	if(media>=7) {
		return true;
	}
	else{
		return false;
	}
}

	//f)
public static int oFatorial(int n){
	if(n==0)return 1;
	return (n*oFatorial(n-1));
}

	//g)
public static boolean pRimo(int n){
	if(n==2) return true;
	if(n%2==1){
		return true;
	}
	else return false;
}

	//h
public static void usandoAanterior(double n1, double n2){
	boolean b;
	b = calculaNota(n1, n2);
	double media = ((n1+n2)/2);
	if (b===true){
		System.out.println("Aprovado");
	}
	else if (b==false){
		System.out.println("Nota da af:");
		double mf = ler.nextDouble();
	}
	if ((media+mf)/2>5&&mf>=4){
		System.out.println("Aprovado por conceito B");
	}
	else {
		System.out.println("Reprovado");
	}
}



	//i)
public static void Calculadora(double a, double b) {
	Scanner ler= new Scanner(System.in);
	int v;
	double resultado;
	double n1, n2;
	System.out.println("Qual operacao quer ultilizar? 1-soma, 2-subtracao, 3-multiplicacao, 4-divisao.");
	v=ler.nextInt();
	System.out.print("Digite o primeiro numero: ");
	n1=ler.nextDouble();
	System.out.print("Digite o segundo numero: ");
	n2=ler.nextDouble();
	if (v==1){
		resultado=n1+n2;
		System.out.println(resultado);
	}
	else if(v==2){
		resultado=n1-n2;
		System.out.println(resultado);
	}
	else if(v==3){
		resultado=n1*n2;
		System.out.println(resultado);
	}
	else if(v==4){
		resultado=n1/n2;
		System.out.println(resultado);
	}
	else System.exit(1); 

}

	//j)
public static int vaiSafadao(int a, int b, int c){
	int safadeza=(((Soma(a))+(b/100))+(50-c));
	System.out.println(safadeza+"%");
	int anjo=100-safadeza;
	System.out.println(anjo+"%");
	return 0;
}

public static int Soma(int a){
	if(a==0)return 0;
	if(a==1)return 1;
	return (a+Soma(a-1));
}

	//k)
public static String coRes(int a, int b){
	String z=("AZUL");
	String r=("VERMELHO");
	String m=("AMARELO");
	if(a%2==0&&b%2==0) return z;
	if(a%2!=0&&b%2!=0) return r;
	else return m;
}


}