
public class OperatorsAndExpressions {
	
	public static void main(String [] args)  {
		
		int a = 10;
		int b = 15;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(b/a);
		System.out.println(b%a); //Mod aka Modulus Remainder
		
		a++;  //a=a+1;
		System.out.println(a);
		a--;
		System.out.println(a);
		a+=2; //a =a+2
		System.out.println(a);
		
		int c =10;
		int d =15;
		
		System.out.println(c==d); //check if c and d the same
		System.out.println(c!=d); //! not equal
		System.out.println(c < d);	
		
		//Comninational Logic
		boolean e =true;
		boolean f =false;
		boolean g =true;
		
		System.out.println(e && f); //Logical AND-looking for false
		System.out.println(e || f); //Logiacal OR-looking for true
		System.out.println(e || f && g);
		
		
		
		
		
		
		
		
		
		
		
	}

}
