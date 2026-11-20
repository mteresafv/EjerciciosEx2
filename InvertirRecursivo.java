package Tema2;

public class InvertirRecursivo {
	
	//funciona la pila de llamadas (LIFO: Last In, First Out — el último en entrar es el primero en salir)
	// ocurre en la memoria donde Java guarda cada llamada pendiente de invertirRecursivo
	
	// "NodoLista" cada vagón o eslabón individual de la lista
	// "actual" es la referencia al nodo concreto (completo: objeto NodoLista q contiene dato y siguiente) que estás visitando 
	// en ese momento de la recursión —sí, va cambiando según qué llamada recursiva esté activa
	public static NodoLista invertirRecursivo (NodoLista actual) {
		// Caso base: lista vacía o único elemento
		if (actual == null || actual.siguiente == null) {
		return actual;
		}
		// Paso recursivo:
		// TODO: Complete este código
		NodoLista nuevaCabecera = invertirRecursivo(actual.siguiente);
		
		actual.siguiente.siguiente = actual;
		actual.siguiente = null;
		
		return nuevaCabecera;
		}
}
