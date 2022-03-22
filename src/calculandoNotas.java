import java.util.Scanner;

public class calculandoNotas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome, sexo;
		Double nota1, nota2, nota3, nota4, media;
		boolean passou = false;
		System.out.println("Informar o nome do aluno");
		nome = sc.next();
		System.out.println("Informe a nota do primeiro semestre");
		nota1 = sc.nextDouble();
		System.out.println("Informe a nota do segundo semestre");
		nota2 = sc.nextDouble();
		System.out.println("Informe a nota do terceiro semestre");
		nota3 = sc.nextDouble();
		System.out.println("Informe a nota do quarto semestre");
		nota4 = sc.nextDouble();
		System.out.println("Digite o sexo M ou F");
		sexo = sc.next();
		media = ((nota1 + nota2 + nota3 + nota4) / 4);
		if (media >= 6 && sexo.equalsIgnoreCase("F")) {
			passou = true;
			System.out.println("Cara aluna voce foi aprovado : " + nome + " Seu resultado e : " + media);
		} else {
			System.out.println("Caro aluno voce foi aprovado : " + nome + " Seu resultado e : " + media);
		}
		if (media < 6 && sexo.equalsIgnoreCase("F")) {
			System.out.println(" Aluna reprovada nota: " + media);
		} else if (media < 6 && sexo.equalsIgnoreCase("M")) {
			System.out.println("Aluno reprovado nota: " + media);
		}

	}
}
