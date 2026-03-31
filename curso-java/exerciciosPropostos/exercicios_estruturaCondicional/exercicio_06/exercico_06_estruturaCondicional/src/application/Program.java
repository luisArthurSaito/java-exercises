package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
	System.out.println("*** INTERVALO DE VALORES ***\n");
	 
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	double num1;
	
	System.out.print(">Digite um número: ");
	num1 = sc.nextDouble();
	
	if (num1 < 0 || num1 > 100) {
		System.out.println("Número fora do intervalo!");
	}
	else if (num1 <= 25) {
		System.out.println(">Intervalo (0, 25)");
	}
	else if (num1 <= 50) {
		System.out.println(">Intervalo (25, 50)");
	}
	else if ( num1 <= 75) { 
		System.out.println(">Intervalo (50, 75)");
	}
	else {
		System.out.println(">Intervalo (75, 100)");
	}
	
	System.out.println("\n");
	System.out.println("__FIM DO PROGRAMA__");
	
	}

}
