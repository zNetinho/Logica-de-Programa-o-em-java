package condicionalExercicios;

import java.util.Scanner;

public class leiaESoma {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, soma, C;
		System.out.println("Por favor digite um valor: ");
		A =sc.nextInt();
		System.out.println("Digite mais um valor");
		B = sc.nextInt();
		System.out.println("Digite mais um valor");
		C = sc.nextInt();
		soma = A+B;
		if (soma < C) {
			System.out.println(soma);
		}
	}
}
