package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("*** PROGRAMA QUE VERIFICA SE A SENHA É VÁLIDA ***\n");
		
		Scanner sc = new Scanner(System.in);
		
		int senha;
		
		System.out.print(">Digite a senha: ");
		senha = sc.nextInt();
		
		// CONSIDERE A SENHA CORRETA 2002
		
		while (senha != 2002) {
			System.out.print("->Senha inválida, digite novamente a senha: ");
			senha = sc.nextInt();
		}
		
		System.out.println("->Acesso permitido!");
		System.out.println("\n");
		System.out.println("__FIM DO PROGRAMA__");
		
		sc.close();
		
	}

}
