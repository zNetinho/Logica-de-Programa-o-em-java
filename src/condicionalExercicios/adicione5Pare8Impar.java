package condicionalExercicios;

import java.util.Scanner;

public class adicione5Pare8Impar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero1;

		System.out.println("infome um numero: ");
		numero1 = sc.nextInt();
		if (numero1 % 2 == 0) {
			numero1 = numero1 + 5;
			System.out.println("o numero e par então foi adicionado +5 o resultado: " + numero1);
		} else {
			numero1 = numero1 + 8;
			System.out.println("o numero e impar então foi adicionado +8 o resultado: " + numero1);
		}
	}
}
