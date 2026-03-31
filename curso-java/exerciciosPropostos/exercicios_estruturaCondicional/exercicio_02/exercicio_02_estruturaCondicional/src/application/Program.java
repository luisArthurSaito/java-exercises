package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("*** PROGRAMA QUE LÊ UM NÚMERO E DIZ SE É PAR OU ÍMPAR ***\n");
		
		Scanner sc = new Scanner(System.in);
		
		int num1;
		
		System.out.print(">Digite um número: ");
		num1 = sc.nextInt();
		
		if (num1 % 2 == 0) {
			System.out.println(">Esse número é Par!\n");
		}
		else {
			System.out.println(">Esse número é Ímpar!\n");
		}
		
		System.out.println("__FIM DO PROGRAMA__");
		
		sc.close();
	}

}
