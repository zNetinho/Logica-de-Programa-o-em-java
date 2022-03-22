import java.util.Scanner;

public class diferencaValor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero1, numero2, soma, diferenca;
		System.out.println("Informe o primeiro numero:");
		numero1 = sc.nextInt();
		System.out.println("informe o segundo numero");
		numero2 = sc.nextInt();
		diferenca = (numero1 - numero2);
		
		System.out.println("a diferença e: " + diferenca);
	}
}
