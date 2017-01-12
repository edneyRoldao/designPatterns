package cases.taxesByState;

public class CalculadoraSP implements ICMSCalculavel {

	@Override
	public float calcularICMS(float valorBase) {
		return valorBase * 0.15f;
	}

}
