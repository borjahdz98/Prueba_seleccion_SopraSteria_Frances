package ejercicio3;

import java.util.Scanner;

public class main {
	
	public static Scanner sc = new Scanner(System.in);
	public static final int LIMITE=40;
	public static final double INCREMENTO=1.5;
	public static int HORASTRABAJADAS;
	public static double TARIFA;
	
	public static void LEER_HORASTRABAJADAS() {
		boolean resuelto=false;
		
		do {
			try{
				System.out.println("Horas trabajadas: ");
				HORASTRABAJADAS=sc.nextInt();
				resuelto=true;
			}catch(Exception e) {
				System.out.println("Introduzca un número sin decimales.");
				sc.next();
			}
		}while(!resuelto);
	}

	public static void LEER_TARIFA() {
		// TODO Auto-generated method stub
		boolean resuelto=false;
		
		do {
			try{
				System.out.println("Tarifa: ");
				TARIFA=sc.nextDouble();
				resuelto=true;
			}catch(Exception e) {
				System.out.println("Introduzca un número, puede contener decimales.");
				sc.next();
			}
		}while(!resuelto);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LEER_HORASTRABAJADAS();
		LEER_TARIFA();
		double sueldo=0;
		
		if(HORASTRABAJADAS<=40) sueldo=HORASTRABAJADAS*TARIFA;
		else {
			int horasExtra=HORASTRABAJADAS-LIMITE;
			sueldo=LIMITE*TARIFA;
			sueldo+=horasExtra*(TARIFA*INCREMENTO);
		}
		
		System.out.println("SUELDO: "+sueldo);
	}

}
