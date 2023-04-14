package ejercicio2;

import java.util.Scanner;

public class main {

	public static Scanner sc = new Scanner(System.in);
	public static PERSONAS[] PERSONAS=new PERSONAS[50];
	
	public static int leerEdad() {
		boolean resuelto=false;
		int edad=0;
		
		do {
			try{
				System.out.println("Escriba la edad");
				edad=sc.nextInt();
				resuelto=true;
			}catch(Exception e) {
				System.out.println("Introduzca una edad valida");
				sc.next();
			}
		}while(!resuelto);
		
		return edad;
	}
	
	public static boolean leerSexo() {
		
		while(true) {
			System.out.println("Hombre: M o Mujer: F");
			char respuesta=sc.next().charAt(0);
			if(respuesta=='M') return true;
			else if(respuesta=='F') return false;	
			else System.out.println("Introduzca una opcion valida");
		}
	}
	
	public static PERSONAS crearPersona() {
		int edad=leerEdad();
		boolean sexo=leerSexo();
		
		return new PERSONAS(sexo,edad);
	}
	
	public static void LEER_PERSONAS() {
		for(int i=0;i<PERSONAS.length;i++){
			System.out.println("Persona "+(i+1));
			PERSONAS[i]=crearPersona();
		}
	}
	
	public static double calcularPorcentaje(double num) {
		return (num/PERSONAS.length)*100;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LEER_PERSONAS();
		
		int mayoresEdad=0, 
			menoresEdad=0,
			masculinasMayoresEdad=0,
			femeninasMenoresEdad=0,
			femeninas=0;
		
		for(int i=0;i<PERSONAS.length;i++) {
			if(PERSONAS[i].getEDAD()>17) {
				mayoresEdad++;
				if(PERSONAS[i].getSEXO()=="Masculino") masculinasMayoresEdad++;
			}
			if(PERSONAS[i].getEDAD()<=17) {
				menoresEdad++;
				if(PERSONAS[i].getSEXO()=="Femenino") femeninasMenoresEdad++;
			}
			if(PERSONAS[i].getSEXO()=="Femenino") femeninas++;
		}
		
		double porcentajeMayoresEdad=calcularPorcentaje(mayoresEdad);
		double porcentajeMujeres=calcularPorcentaje(femeninas);
		
		System.out.println("Mayores de edad: "+mayoresEdad+
				"\nMenores de edad: "+menoresEdad+
				"\nHombres mayores de edad: "+masculinasMayoresEdad+
				"\nMujeres menores de edad: "+femeninasMenoresEdad+
				"\nMayores de edad(%): "+porcentajeMayoresEdad+"%"+
				"\nMujeres(%): "+porcentajeMujeres+"%");
	}

}
