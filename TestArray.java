public class TestArray {
	public static void main(String[] args) {
		final int NUMBER_OF_ELEMENTS = 10;
		double[] buf = new double[NUMBER_OF_ELEMENTS];

		double array1[] = new double[NUMBER_OF_ELEMENTS];

		double[] array2;
		array2 = new double[NUMBER_OF_ELEMENTS];

		double[] array3 = {1.1, 23.2, 343.3};

		double sum = 0;

		java.util.Scanner input = new java.util.Scanner(System.in);

		for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
			System.out.printf("Enter a number: ");
			buf[i] = input.nextDouble();
			sum += buf[i];
		}

		double average = sum / NUMBER_OF_ELEMENTS;

		int count = 0;
		for (int i = 0; i < NUMBER_OF_ELEMENTS; i++){
			if (buf[i] > average)
				count++;
		}
		System.out.printf("Average is %f\n", average);
		System.out.printf("Number of elements above the average is %d\n", count);

		System.out.printf("the number of array2 is %d\n", array2.length);
		for (int i = 0; i < array2.length; i++) {
			array2[i] = i;
			System.out.printf("array2[%d] is %f\n", i, array2[i]);
		}

		int j = 0;
		for (double x: array3) { // for-each loop
			System.out.printf("array3[%d] is %f\n", j++, x);
		}

	}
}
