package j1;

import java.util.Scanner;

public class j1d {

	
		public static void calificacion (double notas[],  Scanner teclado)
		{
			for (int x=0; x<notas.length; x++)
			{
			
			System.out.print("ingrese la calificacion:");
			notas[x]= teclado.nextDouble();
			}
		}
			
		public static double promedio (double notas[])
		{
			double prom, suma =0;
			for( int x=0; x < notas.length; x++)
			suma  += notas[x];
			prom= suma/ notas.length;
			return prom;
		}

		public static void mostrar (double notas [], double promedio)
		{
		System.out.printf("%.30s %.30s%n%n","notas de", "alumnos");
		for (int x=0; x < notas.length; x++)
		{
			System.out.println("las notas son:"  +notas[x]);
		}
		System.out.println("\nEl promedio grupal es: "+promedio);
		}

		public static void mayor (double notas[])
		{
			double mayor =0;
			
			
			for (int x=0; x < notas.length; x++)
				if(notas[x]> mayor);
			{
			int x=0;
			mayor= notas [x];

		}
			
		}

		public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.out.println("Bienvenidos al sistema de calificación");
		Scanner teclado= new Scanner (System.in);
		double notas[];

		int c;
		double promedio;

		System.out.println("Ingrese la cantidad de alumnos:");

			c = teclado .nextInt();
			notas= new double[c];
			
			
			calificacion (notas,  teclado);
			promedio=promedio(notas);
		 mostrar (notas,  promedio);
		mayor (notas);
		
		
	}

	}