
public class WordProblems {
	
	public static void main(String [] args) {
		
	
	
	//Lisa is cooking muffins. The recipe calls for 7 cups of sugar. 
	//She has already put in 2 cups. How many more cups does she need to put in?
	int cupsFinal=7; 
	int cupsCurrent=2;
	int cupsNeeded=cupsFinal-cupsCurrent;
	System.out.println("Lisa needs" + cupsNeeded+"cups");
	
	//At a restaurant, Mike and his three friends decided to divide the bill evenly.
	//If each person paid $13 then what was the total bill?
	int totalFriends=4;
	double eachPayment=13.00;
	double totalBill=eachPayment/totalFriends;
	System.out.println(totalBill);
	
	//How many packages of diapers can you buy with $40 if one package costs $8?
	double moneyTotal=40.00; //import java.text.NumberFormat; for $
	double onePackage=8.00;
	double totalPackages=moneyTotal/onePackage;
	System.out.println(totalPackages);
	
	
	
	//Last Friday Trevon had $29. Over the weekend he received some money for cleaning the attic.
	//He now has $41. How much money did he receive?
	double currentTotal=41.00;
	double previousTotal=29.00;
	double totalNeeded=currentTotal-previousTotal;
	System.out.println(totalNeeded);
	
	//Last week Julia ran 30 miles more than Pranav.
	//Julia ran 47 miles. How many miles did Pranav run?
	int milesJulia=47;
	int morePranav=30;
	int pranavTotal=milesJulia-morePranav;
	System.out.println(pranavTotal);
	
	//How many boxes of envelopes can you buy with $12 if one box costs $3?
	double totalMoney=12.00;
	double oneBox=3.00;
	double totalBoxes=totalMoney/oneBox;
	System.out.println(totalBoxes);
	
//	//After paying $5.12 for a salad, Norachai has $27.10.
//	//How much money did he have before buying the salad?
	double totalSalad=5.12;
	double moneyLeftover=27.10;
	double sumMoney=totalSalad+moneyLeftover;
	System.out.println(sumMoney);
	
	//331 students went on a field trip.
	//Six buses were filled and 7 students traveled in cars. 
	//How many students were in each bus?
	int studentsFieldtrip=331;
	int totalBuses=6;
	int studentsCar=7;
	int totalStudent=(studentsFieldtrip-studentsCar)/totalBuses;
	System.out.println(totalStudent);
	
	//Aliyah had $24 to spend on seven pencils.
	//After buying them she had $10. How much did each pencil cost?
	double totalMoney1=24.00;
	int totalPencils=7;
	double moneyLeft=10.00;
	double pencilCost=(totalMoney1-moneyLeft)/totalPencils;
	System.out.println(pencilCost);
	
	//The sum of three consecutive numbers is 72.
	//What is the smallest of these numbers? //variables are descriptive
	//another way to do it below
	//int sum=72;
	//int smallestNum=(sum -3)/3;
	int mid =72/3;
	int small=mid-1;
	int large=mid+1;
	System.out.println(small +" "+mid+" " + large);
	
//	//The sum of three consecutive even numbers is 48.
//	//What is the smallest of these numbers?
//	int sum=48
//	int smallestNum=(sum-6)/3;
//	
	
	
	
//Maria has boxes. She buys seven more. A week later,
//half of her boxes are destroyed in a fire, leaving her with 22 boxes.
//With how many did she start?
	int remainingBoxes=22;
	int preFireBoxes=remainingBoxes*2;
	int initialBoxes=preFireBoxes-7;
	System.out.println(initialBoxes);
	
//create a 2 didgit num and sum the digits
//ex 25 has a sum of digits of 7
	int startNum= 429;
	int hundredNum=startNum/100;
	int minusNum=startNum%100;
	int minusNum2=minusNum/10;
	int addedNum=minusNum%10;
	int sumNum =hundredNum+minusNum2+addedNum;
	System.out.println(sumNum);
	
	
	
	
	
	
	
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			
	
	
	
	

			
	

	}
	

}
