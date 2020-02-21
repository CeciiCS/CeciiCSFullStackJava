package Paquete1;

import java.util.Scanner;

public class Notas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner (System.in);
		int notas;
		
		System.out.println("Introduzca notas del 1 al 7");
		notas=sc.nextInt();
		
		switch(notas) {
		case 0:
		case 1:
		case 2:
		case 3:
			System.out.println("NOTA INSUFICIENTE");
			break;
		case 4:
			System.out.println("NOTA SUFICIENTE");
			break;
		case 5:
			System.out.println("BUENA NOTA");
			break;
		case 6:
		case 7:
			System.out.println("NOTA SOBRESALIENTE");
			break;
		default:
			System.out.println("ERROR EN INGRESO DE NOTAS");
			break;
			
			
		
		}
		
		
	}

}
