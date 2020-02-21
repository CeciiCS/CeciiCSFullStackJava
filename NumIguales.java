package Paquete; //Pedir dos números y decir si son iguales o no

import java.util.Scanner;

public class NumIguales {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n,z;
		
		System.out.println("Ingrese un numero 1: ");
		n=sc.nextInt();
		System.out.println("Ingrese un numero 2: ");
		z=sc.nextInt();
		
		if (n==z) 
			System.out.println("Son iguales");
		else
			System.out.println("No son iguales");
		
		
		}
}
