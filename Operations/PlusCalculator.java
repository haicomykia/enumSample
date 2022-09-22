package Operations;

public class PlusCalculator implements ICalculator {
	@Override
	public double eval(double x, double y) {
		return x + y;
	}
}
