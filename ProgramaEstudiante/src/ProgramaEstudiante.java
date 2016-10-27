import java.util.Scanner;

public class ProgramaEstudiante {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dia;
		int horas,ausencias,id;
		
		System.out.println("Introduce las horas completas del módulo");
		horas=teclado.nextInt();
		System.out.println("Introduce identificador del alumno");
		id=teclado.nextInt();
		System.out.println("Introduce las ausencias del alumno");
		ausencias=teclado.nextInt();
		
				
		
		int porcentaje = (ausencias*100)/horas;	 					// Sacar % 
				
		if (porcentaje >= 15){										// Para más del 15%
			System.out.println("- El alumno con id " + id);
			System.out.println("- Tiene un " + porcentaje + "% de ausencias");
			System.out.println("- Ha perdido la evaluación continua con " + ausencias + " faltas");		
			
		} else if (porcentaje >= 10){								// Para más del 10%
			System.out.println("El alumno con id " + id + " tiene " + ausencias + " ausencias, que es un " + porcentaje + "%");
			
		} else if (porcentaje >= 5){								// Para más del 5%
			System.out.println("El alumno con id " + id + " tiene " + ausencias + " ausencias, que es un " + porcentaje + "%");
			
		}
 	}
}
