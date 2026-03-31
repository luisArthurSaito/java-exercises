package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("*** SOMA DE DOIS VALORES ***\n");
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, soma;
		
		System.out.print("> Digite o primerio número: ");
		num1 = sc.nextInt();
		
		System.out.print("> Digite o segundo número: ");
		num2 = sc.nextInt();
		
		soma = num1 + num2;
		
		System.out.printf("-> SOMA: %d", soma);
		
		sc.close();
	}

}
