package condicionalExercicios;

import java.util.Scanner;

public class dobrarNumeroInteiroTriplicarNegativo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Por favor informe um valor");
		numero = sc.nextInt();
		if(numero > 0) {
			numero = numero*2;
			System.out.println(numero);
		}else if(numero < 0) {
			numero = numero*3;
			System.out.println(numero);
		}
	}
}
