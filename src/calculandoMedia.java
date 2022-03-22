import java.util.Scanner;

public class calculandoMedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		Double nota1, nota2, nota3, media;

		System.out.println("Informar o nome do aluno");
		nome = sc.next();
		System.out.println("Informe a nota da primeiro semestre");
		nota1 = sc.nextDouble();
		System.out.println("Informe a nota da segundo semestre");
		nota2 = sc.nextDouble();
		System.out.println("Informe a nota da terceiro semestre");
		nota3 = sc.nextDouble();
		media = (nota1 + nota2 + nota3 / 3);
		if (media >= 7) {
			System.out.println(nome + "Aprovado" + media);
		} else if (media <= 5) {
			System.out.println("Aluno está reprovado sua nota: " + media);
		} else if (media < 7 && media > 5) {
			System.out.println(nome + "Esta de recuperação sua nota:" + media);

		}

	}
}
