package condicionalExercicios;

import java.util.Scanner;

public class somandoAeBseIgual {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero1, numero2, soma;
		
		System.out.println("Infome um valor");
		numero1 = sc.nextInt();
		System.out.println("Infome um valor");
		numero2 = sc.nextInt();
		if(numero1 == numero2) {
			soma = numero1+numero2;
			System.out.println(soma);
		}else {
			soma = numero1*numero2;
			System.out.println(soma);
		}
		
	}
}
