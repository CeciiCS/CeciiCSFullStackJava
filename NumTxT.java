package Paquete1;

import java.util.Scanner;

public class NumTxT { //transformar numero a texto

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int num;
		
		System.out.println("Ingrese un numero del 0 al 10: ");
		num=sc.nextInt();
		
		switch(num) {
		case 0:
			System.out.println("CERO");
			break;
		case 1:
			System.out.println("UNO");
			break;
		case 2:
			System.out.println("DOS");
			break;
		case 3:
			System.out.println("TRES");
			break;
		case 4:
			System.out.println("CUATRO");
			break;
		case 5:
			System.out.println("CINCO");
			break;
		case 6:
			System.out.println("SEIS");
			break;
		case 7:
			System.out.println("SIETE");
			break;
		case 8:
			System.out.println("OCHO");
			break;
		case 9:
			System.out.println("NUEVE");
			break;
		case 10:
			System.out.println("DIEZ");
			break;
		default:
			System.out.println("INGRESE NUMERO CORRECTO");
			break;
			
		
		}sc.close();
		

	}

}
