package Tema2;

public class FusionarListas {

	public static NodoLista fusionarListas (NodoLista l1, NodoLista l2) {
	// El tipo de retorno del método es NodoLista, igual que los parámetros l1 y l2 que recibe	
		
	// ERROR: Cuando una lista está vacía en Java, lo que vale null es el nodo completo (l1 == null), no su atributo l1.dato
	//if (l1.dato == null && l2.dato != null) return l2;	
	//if (l2.dato == null && l1.dato != null) return l1;
	
	if (l1 == null && l2 != null) return l2;	
	if (l2 == null && l1 != null) return l1;
	if (l1 == null && l2 == null) return null;				
	 
	if (l1.dato <= l2.dato) {	
		l1.siguiente = fusionarListas (l1.siguiente, l2);
		return l1; // devuelve la dirección de memoria (referencia) del primer nodo de la lista ya ordenada
	} else {
		l2.siguiente = fusionarListas (l1, l2.siguiente);
		return l2;
	}
	
	
	}
}
