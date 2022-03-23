package condicionalExercicios;

import java.util.Scanner;

public class tempoCasamento {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome, genero, estado;
		int tempo;
		boolean controle = true;

		while (controle) {
			System.out.println("Digite o seu nome: ");
			nome = sc.next();
			System.out.println("Digite o seu genero: ");
			genero = sc.next();
			System.out.println("Digite o seu estado civil: ");
			estado = sc.next();
			if (genero.equalsIgnoreCase("F") && estado.equalsIgnoreCase("casada")) {
					System.out.println("quanto tempo de casamento:");
					tempo = sc.nextInt();
					controle = false;
			} // fim if
		} // fim while
	}
}
