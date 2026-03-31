package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("*** CALCULANDO ÁREAS ***\n");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, areaTrianguloRetangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		
		// VALOR FIXO DE PI
		double PI = 3.14159;
		
		System.out.print("Digite um valor para a: ");
		a = sc.nextDouble();
		
		System.out.print("Digite um valor para b: ");
		b = sc.nextDouble();
		
		System.out.print("Digite um valor para c: ");
		c = sc.nextDouble();
		
		System.out.println("----------------------------------------------------");
		areaTrianguloRetangulo = (a * c) / 2.0;
		System.out.printf("Área do Triângulo Retângulo: %.3f%n", areaTrianguloRetangulo);
		
		areaCirculo = PI * c * c;
		System.out.printf("Área do Círculo: %.3f%n", areaCirculo);
		
		areaTrapezio = (a + b) * c / 2.0;
		System.out.printf("Área do Trapézio: %.3f%n", areaTrapezio);
		
		areaQuadrado =  b * b;
		System.out.printf("Área do Quadrado: %.3f%n", areaQuadrado);
		
		areaRetangulo = a * b;
		System.out.printf("Área do Retângulo: %.3f%n", areaRetangulo);
		System.out.println("----------------------------------------------------");
		
		sc.close();
	}

}
