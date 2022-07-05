import java.util.Random;

public class Solucion {

	public static void main(String[] args) {
		int valor;
		
		int num1=0;
		int num2=0;
		int num3=0;
		int num4=0;
		int num5=0;
		int num6=0;
		int num7=0;
		
		for(int i=0; i<1000; i++) {
			valor=solucion();
			
			switch(valor) {
				case 1:
					num1++;
					break;
				case 2:
					num2++;
					break;
				case 3:
					num3++;
					break;
				case 4:
					num4++;
					break;
				case 5:
					num5++;
					break;
				case 6:
					num6++;
					break;
				case 7:
					num7++;
					break;
					
				default:
			}
		}
		
		System.out.println("Histograma: ");  
	    System.out.println("1 ha aparecido: " + num1 + " veces");
	    System.out.println("2 ha aparecido: " + num2 + " veces");
	    System.out.println("3 ha aparecido: " + num3 + " veces");
	    System.out.println("4 ha aparecido: " + num4 + " veces");
	    System.out.println("5 ha aparecido: " + num5 + " veces");
	    System.out.println("6 ha aparecido: " + num6 + " veces");
	    System.out.println("7 ha aparecido: " + num7 + " veces");
	}
	
	
	/////////////////////////////////////////////////////////////
	
	public static int aleatorio5() {
		Random rnd = new Random();
		int numero=(int) (rnd.nextDouble()*5+1);
		
		return numero;
	}
	
	public static int solucion() {
		int suma=0;
		int resultado;
		
		for(int i=0; i<7; i++) {
			suma = suma + aleatorio5();
		}
		
		resultado = 1+suma%7;		
		
		return resultado;
	}
	
}
