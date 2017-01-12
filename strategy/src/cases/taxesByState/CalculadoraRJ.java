package cases.taxesByState;

public class CalculadoraRJ implements ICMSCalculavel {

	@Override
	public float calcularICMS(float valorBase) {
		return valorBase * 0.18f;
	}

}
