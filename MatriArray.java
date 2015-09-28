public class MatriArray {
	public static void main(String[] args) {
		int[][] array = new int[5][5];
		int[][][] array3 = new int[5][5][5];

		array[1][1] = 1;

		int[][] array1 = {
			{1, 2, 3},
			{2, 3, 5},
			{3, 4, 5},
		};

		ShowArray(array1);

		int[][] array2 = {
			{1, 2, 3, 4},
			{1, 2, 3},
			{1, 2},
			{1},
		};
	}

	public static void ShowArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("\n");
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("array[%d][%d] = %d ", i, j, array[i][j]);
			}
		}
		System.out.printf("\n");
	}
}
