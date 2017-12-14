import java.util.Scanner;
public class StreetAddress {
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int streetNum;
		String streetName;
		String city;
		
		System.out.println("Enter your street number:");
		streetNum = input.nextInt();
		input.nextLine();
		System.out.println("Enter your street:");
		streetName = input.nextLine();
		System.out.println("Enter your city:");
		city= input.nextLine ();
		input.close();
		
		//another way to do it
		System.out.println("Street Num: " + streetNum);
        System.out.println("Street Name: " + streetName);
        System.out.println("City " + city);
	}

}
