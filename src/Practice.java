import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
//		String firstName;
//		String lastName;
//		
//		System.out.println("Enter your first name");
//		firstName=input.nextLine();
//		
//		System.out.println("Enter your last name");
//		lastName=input.nextLine();
//		
//		
//		if (firstName.length() == lastName.length()) {
//			System.out.println("Names are the same length!");
//		}
//		else if (firstName.length() > lastName.length()) {
//			System.out.println(firstName + "is longer");
//		} else {
//			System.out.println(lastName + "is longer");
//			
//		}
//		
//		System.out.println("Please enter your full name:");
//		firstName=input.next();
//		lastName=input.next().substring(0, 1);
//		
//		System.out.println(firstName.substring(0, 1).toUpperCase() 
//				+ firstName.substring(1).toLowerCase() + " " 
//				+ lastName.substring(0, 1).toUpperCase() + 
//				lastName.substring(1).toLowerCase());
		
		String password;
		String verifyPassword;
		
		System.out.println("Enter a password");
		password=input.nextLine();
		System.out.println("Please verify your password");
		verifyPassword=input.nextLine();
		
		if(password.equals(verifyPassword)) {
			System.out.println("Your passwords match");
		} else {
			System.out.println("Your passwords did not match up");
		}
		
		
		String userName;
		
		System.out.println("Create an 8 char user name containing" + "the word code somewhere");
		userName=input.nextLine();
		
		if(userName.contains ("code")  && userName.length()>=8) {
			System.out.println("Re try you did not follow directions");
		} else {
			System.out.println("re try");
		}
		
		
			   

	}

}
