package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
	System.out.println("====VERIFICADOR DE NÚMEROS ÍMPARES====\n");	
		
	Scanner sc = new Scanner(System.in);
		
	int num;
	
	System.out.print("->Digite um número: ");
	num = sc.nextInt();
	
	while (num < 1 || num > 1000) {
		System.out.println("->Número inválido!");
		System.out.print("->Digite novamente uma valor entre 1 e 1000: ");
		num = sc.nextInt();
	}
	
	for (int i = 0; i <= num; i++) {
		if (i % 2 != 0) {
			System.out.println(i);
		}
	}
	
	System.out.printf("->Os valores ímpares encontrados até o número %d são esses!", num);
	
	sc.close();
		
	}

}
