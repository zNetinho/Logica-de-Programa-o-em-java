package exerciosMisturados;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class arrayOrganizado {

	public static void main(String[] args) {
		Random numero = new Random();
		int numeroAleatorio = numero.nextInt(10);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		for (int i= 1; i <= 10; i++) {
			numeros.add(numero.nextInt());
		}
		Collections.sort(numeros);
		System.out.println(numeros);
	}

}
