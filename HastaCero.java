package Paquete1;

import java.util.Scanner;

public class HastaCero { //ingresar n° hasta que uno de ellos sea cero
	//al ingresar cero, se detiene el bucle y se suman los n° ingresados

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in); 
		int num, suma=0;
		
		do {
			System.out.println("Ingrese un numero");
			num=sc.nextInt();
			
			suma=suma+num;
		} while(num!=0);
		
		System.out.println("La suma de los n° ingresados es: " + suma);
		
		sc.close();
	}

}
