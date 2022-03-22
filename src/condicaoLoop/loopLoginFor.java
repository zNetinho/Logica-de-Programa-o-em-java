package condicaoLoop;

import java.util.Scanner;

public class loopLoginFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String user = "", senha = "";
		boolean errorLogin = false;
		
		while  (user.equalsIgnoreCase(senha)){
			if(errorLogin) {System.out.println("informe novamente");}
			System.out.println("informe o login");
			user = sc.next();
			System.out.println("informe a senha");
			senha = sc.next();
			errorLogin = true;
		} 
			System.out.println("logado com sucesso");
	}
}
