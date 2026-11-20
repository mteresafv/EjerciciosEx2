package Tema2;

public class presupuestoEquipo {

	public static double presupuestoEquipo (Empleado jefe) {
			if (jefe == null) return 0.0;
			double salarioTotal = jefe.getSalario();

			//if (jefe != null)
			if (jefe.getSubordinados() != null){
			for(Empleado e : jefe.getSubordinados()){
			 //salarioTotal +=  jefe.getSalario(); // estoy sumando el salario del jefe 4 veces!
				//salarioTotal += e.getSalario();
				salarioTotal += presupuestoEquipo(e);
			}
			}
			// CON 1 BUCLE ES SUFICIENTE
			
			//for(Empleado e : jefe.subordinados.getSubordinados()){
			//for(Empleado e : jefe.getSubordinados()){
			 //salarioTotal +=  presupuestoEquipo(e);
			//}
			return salarioTotal;
			}
		
		
	}
}
