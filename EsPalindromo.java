package Tema2;

public class EsPalindromo {

	public static boolean esPalindromo (String texto) {
		
		// Casos base: longitud 0 o 1 siempre es palíndromo
		if(texto == null || texto.length() <= 1) return true; 
		
		
			
		if(texto.charAt(0) != texto.charAt(texto.length() - 1)) { // los índices empiezan en 0
			return false;
		}
		// si el if anterior es false (es decir, los caracteres son iguales), 
		// continúa y va al return final que recorta la cadena para volver a comparar
		
		// Caso recursivo	
		return esPalindromo(texto.substring(1, texto.length() - 1));
		
	}
	
	
	
}
