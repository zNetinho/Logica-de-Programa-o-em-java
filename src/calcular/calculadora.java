package calcular;

import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor1, valor2;
		String operacao, continuar;
		boolean controle = true;

		while (controle) {
			System.out.println("informe um valor");
			valor1 = sc.nextInt();
			System.out.println("informe outro valor");
			valor2 = sc.nextInt();

			System.out.println("escolha a opera��o:");
			operacao = sc.next();

			switch (operacao) {
			case "+":
				System.out.println("voce escolheu a op�ao soma o resultado e: " + (valor1 + valor2));
				break;
			case "-":
				System.out.println("voce escolheu a op��o subtra��o o resultado e: " + (valor1 - valor2));
				break;
			case "*":
				System.out.println("voce escolheu a op��o multiplica��o o resultado e: " + (valor1 * valor2));
				break;
			case "/":
				System.out.println("voce escolheu a op��o divis�o o resultado e: " + (valor1 / valor2));
				break;
			}
			System.out.println("deseja repetir a opera��o?");
			continuar = sc.next();
			if (continuar.equalsIgnoreCase("sim") || continuar.equalsIgnoreCase("s")) {
				controle = true;
			} else {
				controle = false;
				System.out.println("obrigado por usar !");
			}
		}
	}
}
