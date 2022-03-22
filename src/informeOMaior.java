import java.util.Scanner;

public class informeOMaior {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int primeiroNumero, segundoNumero;
		System.out.println("Informe primeiro numero");
		primeiroNumero = sc.nextInt();
		System.out.println("Informe o segundo numero");
		segundoNumero = sc.nextInt();
		if (primeiroNumero > segundoNumero) {
			System.out.println("O primeiro numero e maior que o segundo");
		}else {
			System.out.println("O segundo numero e maior");
		}
	}
}
