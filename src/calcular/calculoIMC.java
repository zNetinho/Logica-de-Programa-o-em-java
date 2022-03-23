package calcular;

import java.util.Scanner;

public class calculoIMC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;
		double peso, altura;

		System.out.println("informe sua idade: ");
		idade = sc.nextInt();
		System.out.println("informe a sua altura: ");
		altura = sc.nextDouble();
		System.out.println("informe o seu peso: ");
		peso = sc.nextDouble();

		if (idade >= 18 && peso < 18) {
			System.out.println("De acordo com calculos do ICM você Abaixo do peso:\n " + peso);
		} else if (idade >= 18 && peso > 18 && peso < 25) {
			System.out.println("De acordo com calculos do ICM você está no peso normal:\n " + peso);
		} else if (idade >= 18 && peso > 25 && peso < 30) {
			System.out.println("De acordo com calculos do ICM você está acima do peso: \n" + peso);
		} else {
			System.out.println("de acordo com registro voce esta acima da media, por favor vá pra academia\n" + peso);
		}
	}
}
