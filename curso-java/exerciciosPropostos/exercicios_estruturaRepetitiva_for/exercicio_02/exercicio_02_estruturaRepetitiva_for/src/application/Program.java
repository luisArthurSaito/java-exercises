package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("==== ANALISANDO SE O NÚMERO ESTÁ DENTRO OU FORA DO INTERVALO ====\n");
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		int quantidadeForaDoIntervalo = 0;
		int quantidadeDentroDoIntervalo = 0;
		
		
		System.out.print("->Digite um número: ");
		num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			System.out.print("->Digite um número: ");
			int x = sc.nextInt();
			
			/*O INTERVALO DEFINIDO É [10, 20] */
			if (x < 10 || x > 20) {
				quantidadeForaDoIntervalo = quantidadeForaDoIntervalo + 1;
			}
			else {
				quantidadeDentroDoIntervalo = quantidadeDentroDoIntervalo + 1;
			}
			
		}
		
		System.out.printf("->Números dentro do intervalo [10, 20]: %d%n", quantidadeDentroDoIntervalo);
		System.out.printf("->Números fora do intervalo [10, 20]: %d%n", quantidadeForaDoIntervalo);
		
		sc.close();
	}

}
