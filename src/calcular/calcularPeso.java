package calcular;

import java.util.Scanner;

public class calcularPeso {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sexo;
		double altura, pesoIdeal = 0;
		System.out.printf("Informe o sexo M ou F: ");
		sexo = sc.next();
		System.out.printf("Informe a altura (em metros) com "," para separar tamanho: ");
		altura = sc.nextDouble();
		if (sexo.equalsIgnoreCase("M")) {
			pesoIdeal = (72.7 * altura) - 58;
			System.out.println(pesoIdeal);
		} else if (sexo.equalsIgnoreCase("F"))
			pesoIdeal = (62.1 * altura) - 44.7;
		System.out.printf("\nPeso Ideal = %.2f kgs\n", pesoIdeal);
	}

}
