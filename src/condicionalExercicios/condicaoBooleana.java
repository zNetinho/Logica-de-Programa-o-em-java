package condicionalExercicios;

import java.util.Scanner;

public class condicaoBooleana {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean condicao1, condicao2;
		int numero1, numero2;
		System.out.println("por favor diga um valor");
		numero1 = sc.nextInt();
		System.out.println("por favor informe um outro valor");
		numero2 = sc.nextInt();
		condicao1 = (numero1 == numero2);
		condicao2 = (numero1 > numero2);
		System.out.println("a primeira condi��o compara se os numeros s�o iguais: " + condicao1);
		System.out.println("a segunda compara��o verifica se o primeiro numero e maior que o segundo: " + condicao2);
	}
}
