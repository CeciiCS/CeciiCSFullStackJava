package Paquete1;

import java.util.Scanner;

public class Acum {
	//Pedir un n�mero N, y mostrar todos los n�meros del 1 al N

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int num, i=1; //i es acum
		
		System.out.println("Introduzca un numero");
		num=sc.nextInt();
		
		while(i <= num) {
			System.out.println(i);
			i++;
		}
		
		

	}

}
