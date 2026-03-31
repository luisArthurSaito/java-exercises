package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("*** CALCULANDO O VALOR A SER PAGO ***\n");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoProduto1, codigoProduto2, numeroDePecas1, numeroDePecas2;
		double valorUnitario1, valorUnitario2, valorFinal;
		
		System.out.print("Digite o código do produto 1: ");
		codigoProduto1 = sc.nextInt();
		
		System.out.print("Informe a quantidade de peças do produto 1: ");
		numeroDePecas1 = sc.nextInt();
		
		System.out.print("Informe o valor unitário da peça 1: R$");
		valorUnitario1 = sc.nextDouble();
		
		System.out.print("Digite o código do produto 2: ");
		codigoProduto2 = sc.nextInt();
		
		System.out.print("Informe a quantidade de peças do produto 2: ");
		numeroDePecas2 = sc.nextInt();
		
		System.out.print("Informe o valor unitário da peça 2: R$");
		valorUnitario2 = sc.nextDouble();
		
		valorFinal = (numeroDePecas1 * valorUnitario1) + (numeroDePecas2 * valorUnitario2);
		
		System.out.println("------------------------");
		System.out.printf("Valor a pagar: R$ %.2f%n", valorFinal);
		System.out.println("------------------------");
		
		
		sc.close();
	}

}
