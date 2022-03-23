package condicionalExercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class leiaEOrganizaDecrescente {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int numero1, count = 3;
		for(int i = 0; i < count; i++) {
		System.out.println("infome um valor");
		numero1 = sc.nextInt();
		numeros.add(numero1);
		}
		Collections.sort(numeros);
		Collections.reverse(numeros);;
		System.out.println(numeros);
//		System.out.println("a lista: " + Collections.reverse(numeros));
	}
}
