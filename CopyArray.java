import java.lang.System;

public class CopyArray {
	public static void main(String[] args) {
		int[] sourceArray = {1, 2, 3};
		int[] targetArray = new int[sourceArray.length];

		for (int i =0; i < sourceArray.length; i++) {
			targetArray[i] = sourceArray[i];
		}

		System.out.printf("Source Array is\n");
		showArray(sourceArray);
		System.out.printf("Target Array is\n");
		showArray(targetArray);

		System.out.printf("Use arraycopy method to copy array\n");
		java.lang.System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);
		System.out.printf("Source Array is\n");
		showArray(sourceArray);
		System.out.printf("Target Array is\n");
		showArray(targetArray);
	}

	public static void showArray(int[] array) {
		int i = 0;

		for (int x: array) {
			System.out.printf("array[%d] is %d\n", i++, x );
		}
	}
}
