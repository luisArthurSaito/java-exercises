package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("\n---- CALCULADORA DE MÉDIA COM NOTAS VÁLIDAS ----\n");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double soma = 0, nota, media;
		int contador = 1;
		
		do {
			
			do {
			System.out.print("-> Informe o valor da nota " + contador + " (0 a 10): ");
			nota = sc.nextDouble();
			
			if (nota < 0 || nota > 10) {
				System.out.println("-> Nota incorreta! Digite um valor entre 0 e 10.");
			}
			
			} while (nota < 0 || nota > 10);
			
			soma += nota;
			contador++;
			
		} while (contador <= 5);
		
		
		media = soma / 5;
		
		System.out.printf("-> A sua média foi: %.2f%n", media);
		
		if (media >= 6) {
			System.out.println("-> Resultado: Aprovado!");
		}
		else {
			System.out.println("-> Resultado: Reprovado!");
		}
		
		sc.close();
	}

}

