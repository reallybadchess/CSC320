package ct_3;
import java.util.Scanner;

public class calc_grocery_bill {

	public static void main(String[] args) {
		// declaring the variables
		double couponAmount;
		double week1;
		double week2;
		double week3;
		double week4;
		double monthlyTotal;
		double weeklyAvg;
		double discountedAvg;
		double discountedTotal;
		
		// instantiating the scanner object 
		Scanner scnr = new Scanner(System.in);
		
		// prompt user to enter the coupon amount
		// a problem here is that there is no way to catch an InputMismatchException if a use enters a string
		System.out.print("Enter a coupon amount between .10 AND 1.0: ");
		couponAmount = scnr.nextDouble();
		System.out.println("You entered: " + couponAmount);
		
		if ((couponAmount < .10) || (couponAmount > 1.0)) {
		    System.out.println("Your coupon entry was not between the provided values. Setting to .10");
		    couponAmount = .10;
		}
		
		// now we request weeks 1 - 4 of grocery bills 
		System.out.print("Enter week 1 grocery bill:");
		week1 = scnr.nextDouble();
		
		System.out.print("Enter week 2 grocery bill:");
		
		week2 = scnr.nextDouble();
		
		System.out.print("Enter week 3 grocery bill:");
		week3 = scnr.nextDouble();
		
		System.out.print("Enter week 4 grocery bill:");
		week4 = scnr.nextDouble();
		
		// calculate the sum of all weeks
		monthlyTotal = week1 + week2 + week3 + week4;
		
		// calculate monthly total with discount
		discountedTotal = monthlyTotal - (monthlyTotal * couponAmount);
			
		// calculate the average bill without coupon discount
		weeklyAvg = monthlyTotal / 4.0;
		
		// calculate the average weekly bill with coupon discount
		discountedAvg = weeklyAvg - (weeklyAvg * couponAmount);
		
		// print the averages with and without coupon discount
		System.out.println("---Totals without coupon discounts---");
		System.out.println("Your monthly total is: " + "$" +  monthlyTotal + " and your weekly average is: " + "$" + weeklyAvg);
		
		System.out.println("---Totals with coupon discounts---");
		System.out.println("Your monthly discounted average is: " + "$" + discountedTotal + " and your discounted weekly average is: " + "$" + discountedAvg);
		
	}

}
