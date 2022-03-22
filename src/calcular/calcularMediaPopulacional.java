package calcular;

import java.util.Scanner;

public class calcularMediaPopulacional {
	public static void main(String[] args) {
		boolean iniciar = true;
		while(iniciar) {
		Scanner sc = new Scanner(System.in);
		double planetaA, planetaB, taxaA, taxaB;
		int anos = 0;
		double crescimentoA, crescimentoB;
		System.out.println("informe a população do primeiro pais");
		planetaA = sc.nextDouble();
		System.out.println("informe a população do segundo pais");
		planetaB = sc.nextDouble();
		System.out.println("informe a taxa de crescimento do primeiro pais");
		taxaA = sc.nextDouble();
		System.out.println("informe a taxa de crescimento do segundo pais");
		taxaB = sc.nextDouble();
		}
	}
}