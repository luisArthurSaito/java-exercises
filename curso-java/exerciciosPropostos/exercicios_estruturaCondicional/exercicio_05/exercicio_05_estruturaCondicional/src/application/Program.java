package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("*** PROGRAMA QUE SIMULA UM CARDÁPIO SIMPLES ***\n");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, quantidade;
		double valor, totalPagar;
		
		System.out.println("---- CARDÁPIO ----\n"
				+ "> 1 - Cachorro Quente | R$ 4.00\n"
				+ "> 2 - X-Salada | R$ 4.50\n"
				+ "> 3 - X-Bacon | R$ 5.00\n"
				+ "> 4 - Torrada simples | R$ 2.00\n"
				+ "> 5 - Refrigerante | R$ 1.50\n");
		
		System.out.print(">Informe qual opção você deseja: ");
		codigo = sc.nextInt();
		
		System.out.print(">Informe a quantidade que deseja: ");
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			totalPagar = quantidade * 4.00;
			System.out.printf("Valor a ser pago: R$ %.2f\n", totalPagar);
		}
		else if (codigo == 2) {
			totalPagar = quantidade * 4.50;
			System.out.printf("Valor a ser pago: R$ %.2f\n", totalPagar);
		}
		else if (codigo == 3) {
			totalPagar = quantidade * 5.00;
			System.out.printf("Valor a ser pago: R$ %.2f\n", totalPagar);
		}
		else if (codigo == 4) {
			totalPagar = quantidade * 2.00;
			System.out.printf("Valor a ser pago: R$ %.2f\n", totalPagar);
		}
		else if (codigo == 5) {
			totalPagar = quantidade * 1.50;
			System.out.printf(">Valor a ser pago: R$ %.2f\n", totalPagar);
		}
		
		System.out.println("\n");
		System.out.println("__FIM DO PROGRAMA__");
		
		sc.close();
	}

}
