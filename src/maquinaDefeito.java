import java.util.Scanner;

public class maquinaDefeito {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double pecasTotal, pecasDefeito, porcentagem;
		System.out.println("Informe a quantidade de pe�as produzidas:");
		pecasTotal = sc.nextDouble();
		System.out.println("Informe a quantidade de pe�as com defeitos:");
		pecasDefeito = sc.nextDouble();
		porcentagem = pecasTotal * 0.10;
		if (pecasDefeito > porcentagem) {
			System.out.println("Maquina precisa de conserto");
		} else {
			System.out.println("Maquina ainda n�o precisa de conserto");
		}
	}
}
