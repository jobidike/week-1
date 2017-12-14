import java.util.Scanner;
public class Address {
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		int streetNum;
		String street;
		
		System.out.println("Enter an address");
		streetNum = input.nextInt();
		street = input.nextLine();
		
		System.out.println("Street Num: " + streetNum);
		System.out.println("Street: " + street);
		
		input.close();
		System.out.println("Street Num: " + streetNum);
        System.out.println("Street : " + street);
      
		
		
		
		
		
		
	}

}
