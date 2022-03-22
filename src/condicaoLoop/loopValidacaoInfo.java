package condicaoLoop;

import java.util.Scanner;

public class loopValidacaoInfo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome = "", genero = "", estado = "";
		int idade, salario;
		boolean informacaoFalsa = true;
		boolean tentarNovamente = true;
		while (tentarNovamente) {
			while (informacaoFalsa) {
				System.out.println("Diga o seu nome");
				nome = sc.next();
				nome.length();
				if (nome.length() > 3) {
					informacaoFalsa = false;
				} else {
					informacaoFalsa = true;
					System.out.println("nome invalido");
					break;
				} // fim validadção
				System.out.println("digite a idade");
				idade = sc.nextInt();
				if (idade >= 0 && idade <= 150) {
					informacaoFalsa = false;
				} else {
					informacaoFalsa = true;
					System.out.println("idade invalida");
					break;
				} // fim idade

				System.out.println("informe o valor do seu salário");
				salario = sc.nextInt();
				if (salario > 0) {
					informacaoFalsa = false;
				} else {
					informacaoFalsa = true;
					break;
				} // fim salario

				System.out.println("Informe seu genero M ou F");
				genero = sc.next();
				if (genero.equalsIgnoreCase("M") || genero.equalsIgnoreCase("F")) {
					informacaoFalsa = false;
				} else {
					informacaoFalsa = true;
					break;
				} // fim genero

				System.out.println("Infome seu estado civil S, C, V, D");
				estado = sc.next();
				switch (estado) {
				case ("S"):
					System.out.println("Solteiro/a");
					break;
				case ("C"):
					System.out.println("Casado/a");
					break;
				case ("V"):
					System.out.println("Viuvo/a");
					break;
				case ("D"):
					System.out.println("Divorciado/a");
					break;
				default:
					informacaoFalsa = false;
					System.out.println("Genero não definido");
					break;
				}
				tentarNovamente = false;
			} // fecha while      
		}//while fecha while
	}// fecha main
}// fecha classe
