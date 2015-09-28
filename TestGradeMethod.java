public class TestGradeMethod {
	public static void main(String[] args) {
		int score = 99;
		System.out.println(score + " is " + printGrade(score));

		score = 66;
		System.out.println(score + " is " + printGrade(score));
	}

	public static char printGrade(double score) {
		if (score >= 90.0)
			return 'A';
		else if (score >= 80.0)
			return 'B';
		else if (score >= 70.0)
			return 'C';
		else 
			return 'D';
	}
}
