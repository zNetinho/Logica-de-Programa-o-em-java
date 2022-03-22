import java.util.Scanner;

public class informaSexo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sexo;
		
		
		System.out.println("informe o genero com a letra M para masculino e F para feminino");
				sexo = sc.next();
		if(sexo.equalsIgnoreCase("F")||sexo.equalsIgnoreCase("M") ) {
			System.out.println("Voce escolheu o genero valido");
		}else {
			System.out.println("Voce escolheu o sexo Invalido");
		}
	}
}
