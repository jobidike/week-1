import java.util.Scanner;
public class TriangleArea {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		String userName;
		double base, height;
		double area;
		
		//Ask user for name
		System.out.println("Enter your name:\n");
		userName=input.nextLine();
		
		//Greet user
		System.out.println("Hello " + userName);
		//Read in info about a triangle
		//Output area of a triangle
		System.out.println("Enter the base");
		base = input.nextDouble();
		System.out.println("Enter the height");
		height = input.nextDouble();
		
		area = .5 *base * height; //another example area=(base*height)/2; or (1/2)*(base*height);
		
		System.out.println("The area of the triangle is " + area);
		input.close();
		
		
		
		
				
		

	}

}
