package Paquete1;

import java.util.Scanner;

public class Alum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Dadas las edades y alturas de 5 alumnos, 
		mostrar la edad y la estatura media, la cantidad de
		alumnos mayores o igual de 18 años, y la cantidad de alumnos 
		que miden más o igual de 1.75.*/
		
		Scanner sc= new Scanner(System.in);
		int edad, sumaEdad=0, mediaEdad=0, alMay=0, mayEst=0; //alMay mayores de 18 años
		double est, sumaEst=0, mediaEst=0;
		
		for(int i=1; i<=5; i++) {
			System.out.println("Alumno " + i);
			System.out.println("Ingrese la edad");
			edad=sc.nextInt();
			System.out.println("Ingrese la altura");
			est=sc.nextDouble();
			//los decimales son con (,) 
			
			if(edad >= 18)
				alMay++; //acum
			if(est >= 1.75)
				mayEst++; //acum
			
			sumaEdad=sumaEdad+edad;
			sumaEst=sumaEst+est;
			
		}
		
		mediaEdad=sumaEdad/5;
		mediaEst=sumaEst/5;
		
		System.out.println("La edad media es de: " + mediaEdad);
		System.out.println("La estatura media es de: " + mediaEst);
		System.out.println("Mayores de 18 años son: " + alMay);
		System.out.println("Mayores de 1.75 de estatura son: " + mayEst);
		
		sc.close();

	}

}
