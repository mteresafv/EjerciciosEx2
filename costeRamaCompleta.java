package Tema2;

public class costeRamaCompleta {
	public static int costeRamaCompleta (Habilidad raiz) {
	
	if (raiz == null) return 0; // lo primero de todo
	//double puntos = raiz.getCoste();
	int puntos = raiz.getCoste(); // poner int porque el metodo es int
		
	//if (raiz.getDesbloqueables() != 0) {
	if (raiz.getDesbloqueables() != null) {
		for (Habilidad h:raiz.getDesbloqueables() ) {
			puntos += costeRamaCompleta(h);
		}
		
	}
	
		return puntos;
	}

}
