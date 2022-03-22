package condicaoCase;

import java.util.Scanner;

public class escolhaCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sexo;
		System.out.println("informe o genero");
		sexo = sc.next();
		switch (sexo) {
		case ("M"):
			System.out.println("Genero e masculino");
			break;
		case ("F"):
			System.out.println("Genero e feminino");
			break;
		default:
			System.out.println("Genero não definido");

		}
	}

}
