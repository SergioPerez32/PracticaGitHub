package practica;

public class Auto {

		String marca;
		int a�o;
		
		public Auto (String m, int a){
			marca=m;
			a�o=a;
		}
		
		public void descripcion (){
			System.out.println("Marca: "+marca+" A�o: "+a�o);
		}
}
