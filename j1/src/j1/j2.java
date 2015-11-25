package j1;

import java.util.Scanner;

public class j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubScanner teclado= new Scanner (System.in);
		Scanner teclado= new Scanner (System.in);
		int x;
		double acumulador=0;
		System.out.println("Bienvenidos al sistema de calificacion");
		double[]numero=new double[50];
		for(x=0; x < 50; x++){
			System.out.println("Ingrese las notas:");
			numero[x]=teclado.nextDouble();
			acumulador=acumulador+numero[x];
		}
		acumulador=acumulador/50;
		System.out.println("El promedio es:"+acumulador);
		if(acumulador<7){
			System.out.println("La calificatoria es minina esta reprobado");
		}else if(acumulador>=7){

		System.out.println("La calificatoria es maxima esta aprobado");
	}

}
}