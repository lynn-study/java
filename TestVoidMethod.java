public class TestVoidMethod {
	public static void main(String[] args) {
		int score = 99;

		System.out.printf("%d is ", score);
		printGrade(score);
		System.out.printf("\n");

		score = 66;
		System.out.printf("%d is ", score);
		printGrade(score);
		System.out.printf("\n");
	}

	public static void printGrade(double score) {
		if (score >= 90.0)
			System.out.println("A");
		else if (score >= 80.0)
			System.out.println("B");
		else if (score >= 70.0)
			System.out.println("C");
		else if (score >= 60.0)
			System.out.println("D");
	}
}
