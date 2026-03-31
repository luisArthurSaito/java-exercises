package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("*** CALCULANDO SALÁRIO ***");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario;
		double horasTrabalhadas, salarioFinal, valorGanhoPorHora;
		
		System.out.print("Informe seu número de funcionário: ");
		numeroFuncionario = sc.nextInt();
		
		System.out.print("Digite a quantidade de horas trabalhadas: ");
		horasTrabalhadas = sc.nextDouble();
		
		System.out.print("Digite quanto você ganha por hora: ");
		valorGanhoPorHora = sc.nextDouble();
		
		salarioFinal = horasTrabalhadas * valorGanhoPorHora;
		
		System.out.print("Salário: R$");
		System.out.println(salarioFinal);
		
		
		
	}

}
