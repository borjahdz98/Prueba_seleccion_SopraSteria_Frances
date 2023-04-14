package ejercicio1;

import java.util.Scanner;

public class main {

	public static int NUMERO;
	public static Scanner sc = new Scanner(System.in);
	
	public static void LEERNUMERO() {
		boolean resuelto=false;
		
		do {
			try{
				System.out.println("Escriba un numero");
				NUMERO=sc.nextInt();
				resuelto=true;
			}catch(Exception e) {
				System.out.println("Introduzca un número sin decimales");
				sc.next();
			}
		}while(!resuelto);
	}
	
	public static String SacarNúmeros(int num) {
		String cadena="";
		
		while(num>=1) {
			cadena+=""+num+"\n";
			num-=2;
		}
		
		return cadena;
	}
	
	
	public static void main(String[] args) {
		//1: even and odd
		LEERNUMERO();
		
		String parimpar="";
		if(NUMERO%2==0) parimpar=NUMERO+" es par";
		else parimpar=NUMERO+" es impar";
		System.out.println(parimpar);
		
		String solucion=SacarNúmeros(NUMERO);
		System.out.print(solucion);
		
	}

}
