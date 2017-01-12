package cases.taxesByState;

public class CalculadoraImposto {
	
	private final ICMSCalculavel icmsCalculadora;
	
	public CalculadoraImposto(ICMSCalculavel icmsCalculadora) {
		this.icmsCalculadora = icmsCalculadora;
	}
	
	public float calcularICMS(float valorBase) {
		return icmsCalculadora.calcularICMS(valorBase);
	}

}
