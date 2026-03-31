package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("*** CALCULANDO O IMPOSTO DE RENDA ***\n");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, valorDoImposto;
		
		System.out.print(">Informe seu salário: ");
		salario = sc.nextDouble();
		
		// ATÉ R$ 2000.00, ISENTO DE IMPOSTO
		if (salario <= 2000.00) {
			System.out.print("->Valor do imposto: Isento");
		}
		// DE R$ 2000.01 ATÉ R$ 3000.00, IMPOSTO DE 8%
		else if (2000.01 <= salario && salario <= 3000.00) {
			valorDoImposto = (salario - 2000.00) * 0.08;
			System.out.printf("->Valor do imposto: R$ %.2f%n", valorDoImposto);
		}
		// DE R$ 3000.01 ATÉ R$ 4500.00, IMPOSTO DE 18%
		else if (salario <= 4500.00) {
			valorDoImposto = (salario - 3000.00) * 0.18 + 1000.00 * 0.08;
			System.out.printf("->Valor do imposto: R$ %.2f%n", valorDoImposto);
		}
		// ACIMA DE R$ 4500.00, IMPOSTO DE 28%
		else if (salario > 4500.00) {
			valorDoImposto = (salario - 4500.00) * 0.28 + (1500.00 * 0.18) + (1000.00 * 0.08); 
			System.out.printf("->Valor do imposto: R$ %.2f%n", valorDoImposto);
		}
		
		System.out.println("\n");
		System.out.println("__FIM DO PROGRAMA__");
		
		sc.close();
	}

}
