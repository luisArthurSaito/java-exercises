package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		System.out.println("*** PROGRAMA QUE VERIFICA SE DOIS NÚMEROS SÃO MÚLTIPLOS ***\n");
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print(">Digite o primeiro número: ");
		num1 = sc.nextInt();
		
		System.out.print(">Digite o segundo número: ");
		num2 = sc.nextInt();
		
		if (num1 / num2 == 0 || num2 / num1 == 0 ) {
			System.out.println(">Os dois números são múltiplos!\n");
		}
		else {
			System.out.println(">Os dois números não são múltiplos!\n");
		}
		
		System.out.println("__FIM DO PROGRAMA__");
		
		sc.close();
	}

}
