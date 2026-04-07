package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("\n---- MENU INTERATIVO ----\n");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		Double num1, num2;
		
		do {
			
			System.out.println("\n=== MENU INTERATIVO ===");
			System.out.println("1 - Somar");
			System.out.println("2 - Multiplicação");
			System.out.println("3 - Dividisão");
			System.out.println("0 - Sair\n");
			
			do {
			System.out.print("-> Qual opção desejada? ");
			opcao = sc.nextInt();
			
			if (opcao < 0 || opcao > 3) {
				System.out.println("-> Opção incorreta! Informe a opção conforme a tabela a cima.");
			}
			
			} while (opcao < 0 || opcao > 3);
			
			switch (opcao) {
			
			case 1:
				System.out.print("-> Digite o primeiro número: ");
				num1 = sc.nextDouble();
				
				System.out.print("-> Digite o segundo número: ");
				num2 = sc.nextDouble();
				
				Double soma = num1 + num2;
				System.out.printf("Soma: %.2f%n", soma);
				break;
				
			case 2:
				System.out.print("-> Digite o primeiro número: ");
				num1 = sc.nextDouble();
				
				System.out.print("-> Digite o segundo número: ");
				num2 = sc.nextDouble();
				
				Double multiplicacao = num1 * num2;
				System.out.printf("Multiplicação: %.2f%n", multiplicacao);
				break;
				
			case 3:
				System.out.print("-> Digite o primeiro número: ");
				num1 = sc.nextDouble();
				
				System.out.print("-> Digite o segundo número: ");
				num2 = sc.nextDouble();
				
				Double divisao = num1 / num2;
				System.out.printf("Divisão: %.2f%n", divisao);
				break;
			}
			
		} while (opcao != 0);
		
		System.out.println("-> Programa encerrado com sucesso!");
		sc.close();
	}

}
