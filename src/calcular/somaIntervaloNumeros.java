package calcular;

import java.util.Scanner;

public class somaIntervaloNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valorInicial, valorFinal, intervalo = 0;
		System.out.println("Informe um numero ");
		valorInicial = sc.nextInt();
		System.out.println("Informe um numero ");
		valorFinal = sc.nextInt();
		for (int i = valorInicial; i <= valorFinal; i++) {
		
			intervalo += i;
			System.out.println("valor " + i);
			System.out.println("valor de intervalo " + intervalo);
		}
		System.out.println(intervalo);
	}
}
