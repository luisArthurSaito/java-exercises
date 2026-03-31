package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("==== PROGRAMA QUE CALCULA A MÉDIA PONDERADA ====\n");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num;
		double nota1, nota2, nota3, mediaPonderada;
		
		
		System.out.print("->Digite um número: ");
		num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			System.out.print("->Informe o valor da primeira nota: ");
			nota1 = sc.nextDouble();
			System.out.print("->Informe o valor da segunda nota: ");
			nota2 = sc.nextDouble();
			System.out.print("->Informe o valor da terceira nota: ");
			nota3 = sc.nextDouble();
			
			/*PRIMEIRO PESO = 2.0, SEGUNDO PESO = 3.0, TERCEIRO PESO = 5.0*/
			mediaPonderada = (nota1 * 2.0 + nota2 * 3.0 + nota3 * 5.0) / (2.0 + 3.0 + 5.0);
			System.out.printf("->Média Ponderada: %.1f%n", mediaPonderada);
		}
		
		System.out.println("\n__Fim do programa__");
		
		sc.close();
	}

}
