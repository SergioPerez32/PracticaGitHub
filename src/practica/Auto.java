package practica;

public class Auto {

		String marca;
		int año;
		
		public Auto (String m, int a){
			marca=m;
			año=a;
		}
		
		public void descripcion (){
			System.out.println("Marca: "+marca+" Año: "+año);
		}
}
