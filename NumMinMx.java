package Paquete;

import java.util.ArrayList;
import java.util.Scanner;

public class NumMinMx {
	//codigo Java para determinar, de N cantidades ingresadas por consola, 
	//cuántas son menores o iguales a cero y cuántas mayores a cero.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, m, c=0, d=0; //c y d son contadores
				
		Scanner sc= new Scanner(System.in);

		System.out.println("Definir la cantidad de numeros a consultar");
		
		n=sc.nextInt(); //n indica el largo del arraylist
		
		ArrayList<Integer> lista = new ArrayList<Integer>(n);
		
		for(int i=0; i<n;i++) {
			System.out.println("Ingrese numeros a consultar");
			m=sc.nextInt(); //m es la variable de ingreso de los num al arraylist
			lista.add(m);
			
			
			if(m<=0) {
				c++; //acumulador de num menores o iguales a cero
				
			} else {
				d++; //acumulador de num mayores a cero
			}
			
					
		}
		System.out.println("Hay " +c+ " valores menores o iguales a cero");
		System.out.println("Hay " +d+ " valores mayores a cero");
		
		sc.close();
				
	}
	
	

}
