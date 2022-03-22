package condicaoLoop;

import java.util.Scanner;

public class loop1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		do {
			System.out.println("informe um valor de 0 a 10");
			numero = sc.nextInt();
		} while (numero > 10);
	}
}
