package al3;

public class ejercicioClase {


		public class Circulo {
		private double radio;

		public Circulo(){
		this.radio=1;
		}

		public void setRadio(double radioParam){
		this.radio=radioParam;
		}
		public double getRadio(){
			return this.radio;
		}

		public Circulo(double radioParam){
			this.radio=radioParam;
		}
		public double getArea(){
			return Math.PI*radio*radio;
		}
		}













		public class Ejercicio1 {

			public void main(String[] args) {
				// TODO Auto-generated method stub
		Circulo cir1=new Circulo();
		cir1.setRadio(10);
		double result=cir1.getRadio();


		System.out.println("area cr1:"+cir1.getArea());
			}

		}
}

