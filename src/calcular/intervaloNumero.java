package calcular;

import java.util.Scanner;

public class intervaloNumero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valorInicial, valorFinal;
		System.out.println("Informe um numero ");
		valorInicial = sc.nextInt();
		System.out.println("Informe um numero ");
		valorFinal = sc.nextInt();
		for (int i = valorInicial; i <= valorFinal; i++) {
			System.out.println(i);

		}
	}
}