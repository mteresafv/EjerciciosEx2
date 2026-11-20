package Tema2;

public class EsBSTAux {

	private static boolean esBSTAux (Nodo nodo, Nodo min, Nodo max) {
		
	//if (nodo == null) return false; // Se compara siempre con null, no con 0
	if (nodo == null) return true; 
	// Si llegas a un hijo que es null (vacío), significa que no hay 
	// ningún nodo ahí que rompa la regla de orden. Un árbol vacío es 
	// un BST válido, así que debe devolver true. Si devolviera false, 
	// cualquier hoja sin hijos haría fallar todo el árbol.
	
	
	//if (min< nodo && max>nodo) return true; // no está bien pues min y max son de tipo Nodo
	if (min != null && nodo.valor <= min.valor) return false;
	if (max != null && nodo.valor >= max.valor) return false;
	
	
	/*
	for(Nodo n: nodo) {
		return esBSTAux(n, min, max);
	}*/
	
	return esBSTAux(nodo.izq, min, nodo) && esBSTAux(nodo.der, nodo, max);
		
	}
	
}
