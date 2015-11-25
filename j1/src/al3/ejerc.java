package al3;

public class ejerc {

	

		public class Descuento {
		private double descuento;
		private double total_compra;


		public double getDescuento() {
			return descuento;
		}
		public void setDescuento(double descuento) {
			this.descuento = descuento;
		}
		public double getTotal_compra() {
			return total_compra;
		}
		public void setTotal_compra(double total_compra) {
			this.total_compra = total_compra;
		}
		public Descuento(double descuentoParam,double total_compraParam){
			this.descuento=descuentoParam;
			this.total_compra=total_compraParam;
			
		}
		public double getTotal(){
			double total=total_compra-total_compra*descuento;
			return total;
		}
		}








		

		public class Ejercicio2 {

			public void main(String[] args) {
				// TODO Auto-generated method stub
		Descuento des1=new Descuento(0.1,100);
		des1.setTotal_compra(150);

		double total=des1.getTotal();
		System.out.println("Total_compra:"+total);
		System.out.println("Total_compra:"+des1.getTotal());
			}

		}
}





