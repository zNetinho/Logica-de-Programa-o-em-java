import java.util.Scanner;

public class informeMaior10 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Informe um numero de 1 a 9");
		numero = sc.nextInt();
		if (numero > 10) {
			System.out.println("Numero e maior que 10, por favor digite outro");
		}
			
	}

}
