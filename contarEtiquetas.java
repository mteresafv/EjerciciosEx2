package Tema2;

public class contarEtiquetas {

	public static int contarEtiquetas (ElementoHTML elemento, String tagBuscado) {
		//if (elemento == null) return 0;
		if (elemento == null || tagBuscado == null) return 0;
		int num = 0;
		
		// if (elemento.getTag != 0) { // No devuelve un int sino un String, no puedo poner !=0
		//if (tagBuscado != null && tagBuscado.equals(elemento.getTag())) {	
		if (tagBuscado.equals(elemento.getTag())) {	
			num +=1;	
		}
		
		if (elemento.getHijos() != null) {
			for(ElementoHTML e:elemento.getHijos()) { // aquí 'e' es cada elemento dentro de getHijos()
				num += contarEtiquetas(e, tagBuscado);
				
			}
			
		}
		
		return num;
	}
}
