package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("*** PROGRAMA QUE LÊ QUANTIDADE INDETERMINADA DE PONTOS NO SISTEMA CARTESIANO ***\n");
		// PORÉM SE X OU Y FOR NULO, O PROGRAMA ENCERRA
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		System.out.print(">Digite a coordenada de x: ");
		x = sc.nextDouble();
		
		System.out.print(">Digite a coordenada de y: ");
		y = sc.nextDouble();
	
		while (x != 0 || y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("->Primeiro Quadrante");
			}
			else if (x < 0 && y > 0) {
				System.out.println("->Segundo Quadrante");
			}
			else if (x < 0 && y < 0) {
				System.out.println("->Terceiro Quadrante");
			}
			else {
				System.out.println("->Quarto Quadrante");
			}
		}
		
		System.out.println("->Valor nulo, programa encerrado!");
		System.out.println("\n");
		
		sc.close();
	}

}
