package exerciosMisturados;

public class informeDe1000a1999 {
	public static void main(String[] args) {
		int maximo = 1999;
		
		for (int i = 1000; i <= maximo; i++) {
				if(i % 11 == 5) {
				System.out.println(i);
			}
		}
	}
}
