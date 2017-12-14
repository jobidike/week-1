
public class Rides {

	public static void main(String[] args) {
		
		String ageGroup = "adult";

		switch (ageGroup) {
		case "adult":
			System.out.println("You can ride the rollercoaster!");
		case "youngster":
			System.out.println("The teacups are fun.");
			break;
		default:
			System.out.println("Oh, you must be a toddler. Toddle on!");
		}

	}

}
