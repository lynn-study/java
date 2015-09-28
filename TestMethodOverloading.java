public class TestMethodOverloading {
	public static void main(String[] args) {
		int x = 1 , y = 2, z = 3;
		double a = 1.0, b = 4.12, c = 6.44;

		System.out.printf("The bigger one is %d between %d %d\n", max(x, y), x, y);
		System.out.printf("The bigger one is %f between %f %f\n", max(a, b), a, b);
		System.out.printf("The biggest one is %f between %f %f %f\n", max(a, b, c), a, b, c);
	}

	public static int max(int x, int y) {
		if (x > y)
			return x;
		else
			return y;
	}

	public static double max(double x, double y) {
		if (x > y)
			return x;
		else
			return y;
	}

	public static double max(double x, double y, double z) {
		return max(max(x, y), z);
	}
}
