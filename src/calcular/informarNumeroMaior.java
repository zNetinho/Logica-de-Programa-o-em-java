package calcular;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class informarNumeroMaior {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int numero1;
		for (int i = 0; i < 5; i++) {
			System.out.println("informe um valor");
			numero1 = sc.nextInt();
			numeros.add(numero1);
		}
//		System.out.println(Collections.sort(numeros));
		System.out.println("o maior valor é: " + Collections.max(numeros));
	}
}
