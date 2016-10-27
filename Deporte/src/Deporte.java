import java.util.Scanner;
public class Deporte {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);						// meter número por teclado
	float temp;
	
	System.out.print("Introduce la temperatura");
	temp=teclado.nextFloat();										// reiniciar la temp
	
	if(temp > 29) {
		System.out.println("El deporte apropiado es Natación");		// Si se cumple acaba el programa
	
	}	else if (temp > 21){										// Sino pasa al siguiente
		System.out.println("El deporte apropiado es el Tenis");		
	
	}	else if (temp > 0) {
		System.out.println("El deporte apropiado es el Golf");			
	
	}	else if (temp > (-12)){
		System.out.println("El deporte apropiado es el Esqui");
	
	}	else 
		System.out.println("El deporte apropiado son las Damas o no");
				
		}

}
