package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("*** PROGRAMA QUE VERIFICA SE O NÚMERO É POSITIVO OU NEGATIVO ***");
		
		Scanner sc = new Scanner(System.in);
		
		int num1;
		
		System.out.print(">Digite um número: ");
		num1 = sc.nextInt();
		
		if (num1 < 0){
			System.out.println(">Esse número é Negativo!\n");
		}
		else {
			System.out.println(">Esse número é Positivo!\n");
		}
		
		System.out.println("__FIM DO PROGRAMA__");
		
		sc.close();

	}

}
