import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int heightInInches = 42;
		System.out.println("Enter your height:");
		heightInInches = input.nextInt();

		if (heightInInches >= 60) {
			System.out.println("You are tall enough to ride.");
			System.out.println("You are growing like a weed");
		} else if (heightInInches >= 40) {
			System.out.println("You can ride the teacups");
			System.out.println("Eat your wheaties");
		} else {
			System.out.println("Sorry not tall enough to ride");
		}

	}

}
