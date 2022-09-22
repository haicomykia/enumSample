package Operations;

public class OperationsEnum {
	public enum Operation {
		
		PLUS {
			@Override
			double eval(double x, double y) {
				return x + y;
			}
		},
		
		MINUS {
			@Override
			double eval(double x, double y) {
				return x - y;
			}
		},
		
		TIMES {
			@Override
			double eval(double x, double y) {
				return x * y;
			}
		},
		
		DIVEIDED_BY {
			@Override
			double eval(double x, double y) {
				return x / y;
			}
		};
		
		abstract double eval(double x, double y);
	}
}
