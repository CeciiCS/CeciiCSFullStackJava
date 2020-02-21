package Paquete1;

import java.util.Scanner;

public class NumPosNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int num=0;
		
		System.out.println("Introduzca un numero");
		num=sc.nextInt();
		
		if(num < 0)
			System.out.println("El numero es negativo");
		
		else //Suponiendo que cero es positivo
			System.out.println("El numero es positivo");
	
		sc.close();

	} 
	
}
