public class VarArgsDemo {
	public static void main(String[] args) {
		printMax(34, 46, 64.0);
		printMax(new double[]{1, 2, 3} );
	}

	public static void printMax(double... numbers) {
		if (numbers.length == 0) {
			System.out.printf("No arguments passed\n");
			return;
		}

		double result = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > result)
				result = numbers[i];

		}
		System.out.printf("The max value is %f\n", result);
	}
}
