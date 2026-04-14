package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("==== CALCULANDO OS DIVISORES DE UM NÚMERO ====\n");
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("->Digite um número: ");
		num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println("-> " + i);
			}
		}
		
		System.out.println("\n__FIM DO PROGRAMA__");
		
		sc.close();
	}

}
