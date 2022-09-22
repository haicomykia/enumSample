package Operations;

public class EnumSample {

	enum Oprations {
		PLUS(new PlusCalculator()),
		MINUS(new MinusCalculator()),
		TIMES(new TimesCalculator()),
		DIVIDE(new DivideCalculator());
		
		private final ICalculator calculator;
		
		private Oprations(ICalculator calculator) {
			this.calculator = calculator;
		}
		
		double eval(double x, double y) {
			return calculator.eval(x, y);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Oprations.MINUS.eval(21, 12));
	}
}
