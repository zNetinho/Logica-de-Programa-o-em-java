import java.util.Scanner;

public class valorDeSaque {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double caixa = 1000;
		double saque ;
		System.out.println("Informe o valor do saque");
		 saque = sc.nextDouble();
		if (saque > caixa) {
			System.out.println("Saque não permitido, valor indisponivel");
		} else {
			System.out.println("Sacando");
		}
	}
}