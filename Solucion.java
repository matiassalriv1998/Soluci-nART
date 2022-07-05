import java.util.Random;

public class Solucion {

	public static void main(String[] args) {
		int suma=0;
		int resultado;
		
		do {
			for(int i=0; i<7; i++) {
				suma = suma + aleatorio5();
			}
		}while(suma==49); //Para que todos los resultados sean equiprobables
		
		resultado = 1+suma%7;

		System.out.println("El resultado es: "+resultado);
	}
	
	
	/////////////////////////////////////////////////////////////
	
	public static int aleatorio5() {
		Random rnd = new Random();
		int numero=(int) (rnd.nextDouble()*7+1);
		
		return numero;
	}

}
