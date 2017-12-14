import java.util.Scanner;

//Switch Case
public class Seasons {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String month;
		
		System.out.println("Enter a month: ");
		month = input.nextLine().toLowerCase();
		
		switch(month) {
		case "december":
		case "january":
		case "february":
		System.out.println("Winter");
		break;
		case "march":
		case "april":
		case "may":
		System.out.println("Spring");
		break;
		default:
			System.out.println("Summer or Fall");
		}

	}

}
