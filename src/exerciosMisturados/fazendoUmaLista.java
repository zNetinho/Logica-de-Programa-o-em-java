package exerciosMisturados;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class fazendoUmaLista {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tamanhoLista = 0, numeroLido, numeroBusca;
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		System.out.println("Informe a quantida de itens da lista");
		tamanhoLista = sc.nextInt();
		for (int i = 0; i < tamanhoLista; i++) {
			System.out.println("Informe o numero");
			numeroLido = sc.nextInt();
			numeros.add(numeroLido);
		} // for preencher
		
		for (int i = 0; i < tamanhoLista; i++) {
			System.out.print("\n" + numeros.get(i));
		} // for imprimir
		
		System.out.println("Informe um numero para procurar na lista");
		numeroBusca = sc.nextInt();
		System.out.println(numeroBusca);
		System.out.print(numeros.indexOf(numeroBusca));
		if (numeros.indexOf(numeroBusca) == -1) {
			System.out.println("o numero não esta na lista");
		} else {
			System.out.println("o numero está na lista");
			System.out.println(numeros.indexOf(numeroBusca));
		}
		{
		}
	}

}
