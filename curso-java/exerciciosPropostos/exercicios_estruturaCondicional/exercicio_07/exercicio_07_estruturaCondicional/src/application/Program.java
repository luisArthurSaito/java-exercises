package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("*** PROGRAMA QUE SIMULA UM PLANNO CARTESIANO ***\n");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		System.out.print(">Digite a coordenada de x: ");
		x = sc.nextDouble();
		
		System.out.print(">Digite a coordenada de y: ");
		y = sc.nextDouble();
		
		if (x == 0 && y == 0) {
			System.out.println("->Coordenada: Origem");
		}
		else if (x == 0) {
			System.out.println("->Eixo X");
		}
		else if (y == 0) {
			System.out.println("->Eixo Y");
		}
		else if (x > 0 && y > 0) {
			System.out.println("->Coordenada: Q1");
		}
		else if (x > 0 && y < 0) {
			System.out.println("->Coordenada: Q4");
		}
		else if (x < 0 && y > 0) {
			System.out.println("->Coordenada: Q2");
		}
		else {
			System.out.println("->Coordenada: Q3");
		}
		
		System.out.println("\n");
		System.out.println("__FIM DO PROGRAMA__");
		
		sc.close();
	}

}
