import java.util.Scanner;
public class ProgramaCalculo {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int num1,num2,num3,suma,producto;
	
	
	System.out.print("Inserta el primer número");
	num1=teclado.nextInt();
	System.out.print("Inserte el segundo número");
	num2=teclado.nextInt();
	System.out.print("Inserte el tercer número");
	num3=teclado.nextInt();
	
	
	
	if(num1 < 0){
		producto=num1*num2*num3;
		System.out.print("El producto de los tres números es: ");
		System.out.println(producto);
		
	}else{
		suma=num1+num2+num3;
		System.out.print("La suma de los tres números es: ");
		System.out.println(suma);
	}
	
	
	
	}

}
