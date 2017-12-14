import java.util.Scanner;

public class ThursdayWarmup {

	  public static void main(String[] args) {
		  
		  Scanner input = new Scanner(System.in);

	 double testNumberOne;
	 double testNumberTwo;
	 
	 System.out.println("Enter number 1: ");
	 testNumberOne = input.nextDouble();
	 
	 System.out.println("Enter number 2:");
	 testNumberTwo = input.nextDouble();

	 double sum = testNumberOne + testNumberTwo; 
	  
	  	System.out.println("The sum of the two numbers" + sum);
	  	
	  }

}
