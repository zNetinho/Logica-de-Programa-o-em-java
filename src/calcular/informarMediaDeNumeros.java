package calcular;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class informarMediaDeNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int media = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("informe um valor");
			media += sc.nextInt();
//			numeros.add(numero1);
		}
		media = media / 5;
		System.out.println();
	}
}
