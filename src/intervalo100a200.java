import java.util.Scanner;

public class intervalo100a200 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Informe um numero");
		numero = sc.nextInt();
		if (numero > 100 && numero < 200) {
			System.out.println("O num�ro est� no intervalo dos numeros 100 a 200");
		} else {
			System.out.println("O numero n�o est� no intervalo dos numeros 100 a 200");
		}
	}
}
