import java.util.Scanner; 
public class RectangleArea {
	
	public static void main(String[] args) {
	
	//Step 1: Declare Variables	
	Scanner input = new Scanner(System.in);	
	double length, width;
	double area;
	
	
	System.out.println("Calculate the area of a rectangle\n");
	//Step 2: Get info from user
	System.out.println("Enter the length:");
	length = input.nextDouble();
	System.out.println("Enter the width:");
	width = input.nextDouble();
	
	//Step 3: make your formula
	area = length * width;
	
	//print your results
	System.out.println("Print area is: " + area);
	
	
	
	
		

	
	}

	
}
