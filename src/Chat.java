import java.util.Scanner; //Strings//
public class Chat {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String name;
		String nickName;
		
		System.out.println("Enter your name");
		name=input.nextLine();
		
		System.out.println("Enter nickname");
		nickName=input.nextLine();
		
		if(name.equals(nickName)) {
			System.out.println("Comon man!");
		}else {
			System.out.println("Welcome "+ name + " " + nickName);
		}
		
		System.out.println("How are you today?");
		String answer=input.nextLine();
		
		if(answer.toLowerCase().contains("good")) {
			System.out.println("That's great!");
		} else if(answer.toLowerCase().contains("bad")) {
			System.out.println("Cheer up coding can be tough.");
		} else {
			System.out.println("hmmm...");
		}
		
		System.out.println("What do you think of We Can Code It?");
		answer=input.nextLine();
		
		if(answer.endsWith("!")) {
			System.out.println("Ok, ok you dont have to shout.");
		} else if(answer.endsWith(".")) {
			System.out.println("Ya they're pretty cool.");
		} else if(answer.startsWith("Why")) {
			System.out.println("Don't ask questions!");
		} else {
			System.out.println("Keep your opinions to yourself.");
		}
		
		
		
		

	}

}
