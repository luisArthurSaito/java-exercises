package application;

import java.util.Random;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("\n---- ADIVINHE O NÚMERO ----\n");
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int numeroSecreto = random.nextInt(100) + 1;
		int palpite;
		int tentativas = 0;
		
		do {
			System.out.print("-> Qual seu palpite? ");
			palpite = sc.nextInt();
			tentativas ++;
			
			if (palpite > numeroSecreto) {
				System.out.println("-> Muito alto! Tente menor.");
			}
			
			else if (palpite < numeroSecreto) {
				System.out.println("-> Muito baixo! Tente maior.");
			}
			
			else {
				System.out.println("\n-> Parábens, você acertou em " + tentativas + " tentativa(s)!");
			}
		} while (palpite != numeroSecreto);
		
		sc.close();
	}

}
