package condicionalExercicios;

import java.util.Scanner;

public class numeroEPar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Infome um numero inteiro");
		numero = sc.nextInt();
		if(numero % 2 == 0) {
			System.out.println("numero e par");	
		}else {
			System.out.println("numero e impar");
		}
	}
}
