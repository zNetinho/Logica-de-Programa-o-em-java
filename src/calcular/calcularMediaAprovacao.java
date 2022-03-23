package calcular;

import java.util.Scanner;

public class calcularMediaAprovacao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id, nota1, nota2, nota3, notaFinal;
		
		System.out.println("informe o id do aluno");
		id = sc.nextInt();
		System.out.println("informe a nota do primeiro semestre");
		nota1 = sc.nextInt();
		System.out.println("informe a nota do segundo semestre");
		nota2 = sc.nextInt();
		System.out.println("informe a nota do terceiro semestre");
		nota3 = sc.nextInt();
		notaFinal = nota1+nota2+nota3 / 3;
		System.out.println(notaFinal);
		if(notaFinal >= 90) {
			System.out.println(id + "o aluno passou de ano, sua media e: A ");
		}else if(notaFinal >=75 && notaFinal <= 90) {
			System.out.println(id + "o aluno passou de ano, sua media e: B");
		}else if(notaFinal >= 60 && notaFinal <= 75) {
			System.out.println(id + " o aluno passou de ano, sua media e: C");
		}else if (notaFinal >=40 && notaFinal < 60) {
			System.out.println("Sua notas estão abaixo da media sua nota : D");
		}else if (notaFinal < 40) {
			System.out.println("Sua notas estão abaixo da media sua nota : E");
		}
		
	}
}
