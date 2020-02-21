package MientrasWhile;

import java.util.Scanner;

public class SumaNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=0;
		int suma=0;
		int i=0; //contador
		
		System.out.println("Ingrese 15 numeros al azar");
		Scanner sc= new Scanner(System.in);
		
		//bucle while
		while(i<15) {
			
			numero=sc.nextInt();
			i++; //contador va en aumento en 1
		
			suma=suma+numero;
			
				
		}
		
		System.out.println("La suma de los 15 numeros es: " + suma);
		
		
				
		
	}

}
