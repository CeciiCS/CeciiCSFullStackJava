package Paquete1;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int nota;
		
		System.out.println("Introduzca notas del 0 al 7");
		nota=sc.nextInt();
		
		//If-else
		if (nota >= 0 & nota <=3)
			System.out.println("NOTA INSUFICIENTE");
		else 
			if (nota==4)
				System.out.println("NOTA SUFICIENTE");
			else
				if (nota==5)
					System.out.println("BUENA NOTA");
				else
					if (nota == 6 & nota ==7)
						System.out.println("NOTA SOBRESALIENTE");
		//sc.close();
		
	}

}
