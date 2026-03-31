package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("*** CALCULANDO A DURAÇÃO DE UM JOGO ***\n");
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal, duracaoDoJogo;
		
		System.out.print(">Informe a hora que o jogo começou: ");
		horaInicial = sc.nextInt();
		
		System.out.print(">Informe a hora que o jogo terminou: ");
		horaFinal = sc.nextInt();
		
		if (horaInicial < horaFinal) {
			duracaoDoJogo = horaFinal - horaInicial;
			System.out.printf(">O jogo durou %d hora(s)\n", duracaoDoJogo);
		}
		else {
			duracaoDoJogo = 24 - horaInicial + horaFinal;
			System.out.printf(">O jogo durou %d hora(s)!\n", duracaoDoJogo);
		}
		
		System.out.println("\n");
		System.out.println("__FIM DO PROGRAMA__");
		
		sc.close();

	}

}
