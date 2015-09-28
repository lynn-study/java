import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
	public static void main(String[] args) {
		final double PI = 3.14;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble();

		double area = radius * radius * PI;

		System.out.println("The area for the circle of randius " + radius + " is " + area);
	}
}
