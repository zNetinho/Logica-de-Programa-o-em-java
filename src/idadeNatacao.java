import java.util.Scanner;

public class idadeNatacao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;
		System.out.println("Informe a idade do competidor");
		idade = sc.nextInt();
		if (idade <= 10) {
			System.out.println("Nadador estará classificado para categoria infantil");
		} else if (idade > 10 && idade <= 17) {
			System.out.println("Nadador estará classificado para categoria juvenil");
		} else if (idade > 17) {
			System.out.println("Nadador estará classificado para categoria sênior");
		}

	}
}
