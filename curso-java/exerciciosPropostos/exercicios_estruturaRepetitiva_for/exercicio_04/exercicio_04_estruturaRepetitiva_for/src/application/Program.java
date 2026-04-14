package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== DIVISÃO DE NÚMEROS ====\n");
		
		int num;
		double divisao;
		
		/*INFORMANDO A QUANTIDADE DE VEZES QUE VAI REPETIR OS COMANDOS*/
		System.out.print("->Digite um número inteiro: ");
		num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			System.out.print("->Digite o primeiro número: ");
			double x = sc.nextDouble();
			
			System.out.print("->Digite o segundo número: ");
			double y = sc.nextDouble();
			
			if (y == 0) {
				System.out.println("->Divisão indisponível!");
			}
			
			else {
			divisao = x / y;
			System.out.printf("->Resultado: %.1f%n", divisao);
			
			}
			
		}
		
		System.out.println("\n__FIM DO PROGRAMA__");
		
		sc.close();
	}

}
