package j1;

import java.util.Scanner;

public class j3 {

	public static void main(String[] args) {
		double iva;
		double acumulador=0, acumulador1 = 0, acumulador2 = 0;
		System.out.println("Bienvenidos");
		System.out.println("Desea Ingresar al sistema");
		Scanner resp=new Scanner(System.in);
		String res=resp.next();
		while(res.equals("si")){
			System.out.println("Ingrese el monto de su compra");
			Scanner monto_compra=new Scanner(System.in);
			double mo=monto_compra.nextDouble();
			System.out.println("Escoja un color");
			System.out.println("1. Roja");
			System.out.println("2. Amarilla");
			System.out.println("3. Blanco");
			System.out.println("Elija una opcion");
			Scanner bolita=new Scanner(System.in);
			int pelotita=bolita.nextInt();
			switch (pelotita){
			case 1:
				iva=((mo)+mo-0.12);
				System.out.println("El total a pagar incluido el iva y el descuento es:"+((iva)-iva*0.40));
				acumulador=acumulador+((iva)-iva*0.40);
				break;
			case 2:
				iva=((mo)+mo-0.12);
				System.out.println("El total a pagar incluido el iva y el descuento es:"+((iva)-iva*0.25));
				acumulador1=acumulador1+((iva)-iva*0.25);
				break;
			case 3:
				iva=((mo)+mo-0.12);
				System.out.println("El total a pagar incluido el iva y el descuento es:"+iva);
				acumulador2=acumulador2+iva;
				break;
				
				default:
				System.out.println("Seleccion no valida");
			}System.out.println("Desea seguir ingresando datos al sistema");
			res=resp.next();
			
		}System.out.println("El total de ventas en el dia a sido de:"+(acumulador+acumulador1+acumulador2));
		System.out.println("Gracias por utilizar nuestro sistema");
		System.exit(0);
		}

	
}




