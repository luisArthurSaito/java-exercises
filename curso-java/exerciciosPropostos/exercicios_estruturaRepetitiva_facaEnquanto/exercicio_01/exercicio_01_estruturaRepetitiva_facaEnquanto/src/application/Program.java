package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("\n---- PROGRAMA QUE CONVERTE CELSIUS EM FAHRENHEIT ----\n");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double celsius, fahrenheit;
		char opcao;
		
		do {
			System.out.print("->Digite a temperatura em Celsius: ");
			celsius = sc.nextDouble();
			
			fahrenheit = (9 * celsius) / 5 + 32;
			System.out.print("->Equivalente em Fahrenheit: ");
			System.out.printf("%.1f%n", fahrenheit);
			
			System.out.print("->Deseja repetir (s/n)? ");
			opcao = sc.next().charAt(0);
			
		} while (opcao == 's');
		
		System.out.println("->Programa encerrado com sucesso!");
		sc.close();
	}

}
