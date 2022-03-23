package calcular;

import java.util.Scanner;

public class calculeOValor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double preco, desconto, etiqueta;
		String modoPagamento;

		System.out.println("Informe o valor da etiqueta");
		etiqueta = sc.nextDouble();
		System.out.println("informe o modo de pagamento");
				sc.nextLine();
		modoPagamento = sc.next();
		if (modoPagamento.equalsIgnoreCase("vista")|| modoPagamento.equalsIgnoreCase("a") || modoPagamento.equalsIgnoreCase("dinheiro")) {
			desconto = etiqueta * 0.1;
			preco = -desconto;
			System.out.println("o desconto e: " + preco + "R$");
			System.out.println("o valor do produto a vista e: " + (etiqueta - desconto));
		} else if (modoPagamento.equalsIgnoreCase("credito") || modoPagamento.equalsIgnoreCase("cartão")) {
			desconto = etiqueta * 0.15;
			preco = -desconto;
			System.out.println("o desconto e: " + preco);
			System.out.println("o valor do produto a vista e: " + (etiqueta - desconto));
		} else if (modoPagamento.equalsIgnoreCase("2x") || modoPagamento.equalsIgnoreCase("dividir")) {
			System.out.println("Desculpe não temos desconto para essa opção de pagamento o valor do item e: " + etiqueta);
		}else if(modoPagamento.equalsIgnoreCase("3x") || modoPagamento.equals("parcelar")) {
			desconto = etiqueta * 0.1;
			preco = +desconto;
			System.out.println("o produto parcelado tem acrescimo de 10% o seu valor e: " + preco);
		}
		
	}

}
