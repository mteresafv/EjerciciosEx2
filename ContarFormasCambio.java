package Tema2;

public class ContarFormasCambio {

	public static int contarFormasCambio (int objetivo, int[] monedas) {
		int forma = 0;
		
		// casos base
		if (objetivo == 0) return forma = 1;
		if (objetivo < 0) return 0;
		//if (monedas == null) return 0; 
		// comprueba si el array en sí no existe (no está inicializado en memoria), 
		// no si te has quedado sin monedas dentro del array
		
		if (monedas[0] == 0 && monedas[1] == 0 && monedas[2] == 0 ) return 0;

		
		// recursividad
		
		
		
		
	}
	
	
}
