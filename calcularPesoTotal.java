package Tema2;

public class calcularPesoTotal {
	
	public static double calcularPesoTotal(Carpeta inicio) {
		
		double pesoTotal = 0.0; // variable acumuladora
		
		for (int i = 0; i<inicio.getArchivos().size; i++) {
			
			pesoTotal += archivo.getPesoMB();
			
		}
		
		
		return pesoTotal;
	}
}
