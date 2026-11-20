package Tema2;

public class ContieneDefectos {

	public static boolean contieneDefectos (Pieza piezaPrincipal) {
		
		if(piezaPrincipal == null) return false;
		
		// Redundante if (piezaPrincipal != null) {
		
		
		// No hace falta == true: if(piezaPrincipal.isDefectuosa()== true)
		if(piezaPrincipal.isDefectuosa())
			return true;
	
		
		if (piezaPrincipal.getComponentes() != null) {
			for (Pieza p : piezaPrincipal.getComponentes()) {
				if (contieneDefectos(p)) return true;
			}
		}
		
		
		return false;
	}
	
}
