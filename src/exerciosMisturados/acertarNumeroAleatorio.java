package exerciosMisturados;

import java.util.Random;
import java.util.Scanner;

public class acertarNumeroAleatorio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random numero = new Random();
		int numeroAleatorio = numero.nextInt(100), escolha;
		boolean controle = true;

		while (controle) {
			System.out.println("Tente advinhar o numero: ");
			escolha = sc.nextInt();

			if (escolha == numeroAleatorio) {
				System.out.println("Voce adivinhou");
			controle = false;
			} else if(escolha < numeroAleatorio){
				System.out.println("Tente denovo, o numero sortido e um pouco maior");
//				System.out.println(numeroAleatorio);
			}else if(escolha > numeroAleatorio) {
				System.out.println("O numero sortido e um pouco menor");
			}
		}
	}
}
