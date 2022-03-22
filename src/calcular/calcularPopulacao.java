package calcular;

public class calcularPopulacao {
	public static void main(String[] args) {
		double planetaA = 80000;
		double planetaB = 200000;
		int anos = 0;
		double crescimentoA, crescimentoB;
		
		
		while(planetaA <= planetaB) {
			anos++;
			crescimentoA = planetaA * 0.03;
			crescimentoB = planetaB * 0.015;
			planetaA += crescimentoA;
			planetaB += crescimentoB;
		}
		System.out.println(planetaA);
		System.out.println(planetaB);
		System.out.println(anos);
		
	}
}
