package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("*** SIMULAÇÃO DE UM POSTO DE COMBUSTÍVEIS ***\n");
		
		Scanner sc = new Scanner(System.in);
		
		int tipoCombustivel;
		
		// QUANTIDADES INICIANDO COM O VALOR 0, POIS NÃO FOI INSERIDO NENHUM COMBUSTÍVEL 
		
		int quantidadeAlcool = 0;
		int quantidadeGasolina = 0;
		int quantidadeDiesel = 0;
		
		System.out.println("-- COMBUSTÍVEIS --\n"
				+ "> 1 - Álcool\n"
				+ "> 2 - Gasolina\n"
				+ "> 3 - Diesel\n"
				+ "> 4 - Encerrar\n");
		
		System.out.print(">Informe o combustível desejado conforme a tabela acima: ");
		tipoCombustivel = sc.nextInt();
		
		
		while (tipoCombustivel != 4) {
			if (tipoCombustivel <= 0 || tipoCombustivel > 4) {
				System.out.print("->Código inválido, informe novamente seguindo a tabela acima: ");
				tipoCombustivel = sc.nextInt();
			}
			else if (tipoCombustivel == 1) {
				quantidadeAlcool += 1;
			}
			else if (tipoCombustivel == 2) {
				quantidadeGasolina += 1;
			}
			else {
				quantidadeDiesel += 1;
			}
			
			System.out.print(">Informe o combustível desejado conforme a tabela acima: ");
			tipoCombustivel = sc.nextInt();
		}
		
		System.out.println(">Muito obrigado pela preferência!");
		System.out.printf("->Álcool: %d%n", quantidadeAlcool);
		System.out.printf("->Gasolina: %d%n", quantidadeGasolina);
		System.out.printf("->Diesel: %d%n", quantidadeDiesel);
		
		System.out.println("\n");
		System.out.println("__FIM DO PROGRAMA__");
		
		sc.close();
	}

}
