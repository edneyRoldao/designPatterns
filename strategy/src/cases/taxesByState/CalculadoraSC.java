package cases.taxesByState;

public class CalculadoraSC implements ICMSCalculavel {

	@Override
	public float calcularICMS(float valorBase) {
		return valorBase * 0.22f;
	}

}
