package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		System.out.println("*** ÁREA DE CÍRCULO ***\n");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, area;
		
		// VALOR DE PI É FIXO
		
		double pi = 3.14159;
		
		System.out.print("Digite o valor do raio: ");
		raio = sc.nextDouble();
		
		area = pi * raio * raio;
		
		System.out.printf("Valor da área do círculo: %.4f%n\n", area);
		
		System.out.println("--FIM DO PROGRAMA--");
	}

}
