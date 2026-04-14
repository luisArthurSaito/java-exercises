package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== FATORAÇÃO ====\n");
		
		int num;
		int fatorial = 1;
		
		System.out.print("->Digite um número inteiro: ");
		num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			fatorial = fatorial * i;
			
		}
		
		System.out.printf("->O fatorial do número é %d%n", fatorial);
		
		sc.close();
	}

}
