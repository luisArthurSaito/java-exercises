package application;

import java.security.DrbgParameters.NextBytes;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("*** CÁLCULO DA DIFERENÇA DO PRODUTO DE A E B PELO PRODUTO DE C E D ***");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, produto1, produto2, diferencaDosProdutos;
		
		System.out.print("Digite o valor de a: ");
		a = sc.nextInt();
		
		System.out.print("Digite o valor de b: ");
		b = sc.nextInt();
		
		System.out.print("Digite o valor de c: ");
		c = sc.nextInt();
		
		System.out.print("Digite o valor de d: ");
		d = sc.nextInt();
		
		produto1 = a * b;
		produto2 = c * d;
		
		diferencaDosProdutos = produto1 - produto2;
		
		System.out.print("A diferença dos produtos é igual a: ");
		System.out.println(diferencaDosProdutos);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
