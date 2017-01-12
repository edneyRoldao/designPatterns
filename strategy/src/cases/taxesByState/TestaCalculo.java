package cases.taxesByState;

public class TestaCalculo {
	
	public static void main(String[] args) {
		
		// SP
		ICMSCalculavel tipoCalculadora = new CalculadoraSP();
		CalculadoraImposto calculadora = new CalculadoraImposto(tipoCalculadora);
		System.out.println("Calculo ICMS estado de SP: " + calculadora.calcularICMS(1500.45f));
		
		// RJ
		tipoCalculadora = new CalculadoraRJ();
		calculadora = new CalculadoraImposto(tipoCalculadora);
		System.out.println("Calculo ICMS estado de RJ: " + calculadora.calcularICMS(1500.45f));
		
		// SC
		tipoCalculadora = new CalculadoraSC();
		calculadora = new CalculadoraImposto(tipoCalculadora);
		System.out.println("Calculo ICMS estado de SC: " + calculadora.calcularICMS(1500.45f));
		
	}

}
