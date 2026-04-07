package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("---- CONTAGEM SIMPLES ----");
		Scanner sc = new Scanner(System.in);	
		
		int num = 1;
		
		do {
			System.out.printf("%d%n", num);
			num = num + 1;
		} while (num <= 10);
		
		System.out.println("->Programa encerrado!");
		sc.close();
		
	}

}
