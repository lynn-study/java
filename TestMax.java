public class TestMax {
	public static void main(String[] args) {
		int i = 5;
		int j = 7;

		int k = max(i, j);

		System.out.printf("%d %d %d is bigger\n", i, j, k);
	}

	public static int max(int x, int y) {
		if (x > y)
			return x;
		else
			return y;
	}
}
