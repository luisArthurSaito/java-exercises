package application;

import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n==== CAIXA ELETRÔNICO ====\n");
		
		/*LOGIN*/
		while (true) {
			System.out.print("-> Informe a senha: ");
			int senha = sc.nextInt();
			
			if (senha == 1234) {
				break;
			}
			else {
				System.out.println("-> Senha incorreta! Tente novamente.");
			}
		}
		
		/*SALDO INCIADO COM R$ 1000.0*/
		double saldo = 1000;
		double valor;
		int opcao;
		
		
		/*MENU*/
		do {
			System.out.println("\n\n---- CAIXA ELETRÔNICO ----\n");
			System.out.println("1 - Sacar");
			System.out.println("2 - Depositar");
			System.out.println("3 - Consultar saldo");
			System.out.println("99 - Sair\n");
			
			System.out.print("-> Digite a opção desejada: ");
			opcao = sc.nextInt();
			
			if (opcao == 1) {
				System.out.print("-> Informe o valor que deseja sacar: R$");
				valor = sc.nextDouble();
				
				if (valor <= saldo && valor > 0) {
					saldo -= valor;
				}
				else if (valor < 0) {
					System.out.println("-> Operação inválida! Valor negativo.");
				}
				else if (valor > saldo) {
					System.out.println("-> Operação inválida! Saldo insuficiente.");
				}
				
			}
			
			else if (opcao == 2) {
				System.out.print("-> Informe o valor que deseja depositar: R$");
				valor = sc.nextDouble();
				
				if (valor > 0) {
					saldo += valor;
				}
				else {
					System.out.println("-> Operação inválida! Valor negativo.");
				}
			}
			
			else if (opcao == 3) {
				System.out.println("-> Saldo bancário: R$" + saldo);
			}
			
		} while (opcao != 99);
		
		System.out.println("-> Caixa eletrônico fechado!");
		sc.close();
	}

}
