package app;
import java.util.Scanner;

// My program uses multiple methods to determine the requested stats: Total, Average, Min, Max, and Interest (20%)

public class Main {

	public static void main(String[] args) {
		// these variables are for working with the while loop
		int counter = 0;
		double[] inputs;
		inputs = new double[5];
		
		// // scanner input object
		Scanner scnr = new Scanner(System.in);
		
        // while loop for user input
		while (counter < 5) {
		    // I need to ensure this while loop asks the user to input a value 5 times
		    System.out.println("Input a value: ");
		    inputs[counter] = scnr.nextDouble();
		    counter += 1;
		}
		
		// these variable are for holding the method return values
		double total;
		double average;
		double[] minAndMax;
		double interest;
		
		total = total(inputs);
		average = average(total, counter);
		minAndMax = findMinAndMax(inputs);
		interest = interest(total);
		
		// so does main go at the very bottom since that's where i'll be printing from?
		displayStats(total, average, minAndMax, interest);
	}
	
    // this method calculates the sum of the inputs
	public static double total(double[] inputs) {
		double total;
		total = 0;
		
		for (int i = 0; i < inputs.length; i++) {
			total += inputs[i];
		}
		return total;
	}
	
	// this method calculates the average of the sum of inputs
	public static double average(double total, int denominator) {
		double average;
		
		average = total/denominator;
		return average;
	}
	
	// this method calculates the min and max of the inputs
	public static double[] findMinAndMax(double[]inputs) {
		double min;
		double max;
		double[] minAndMax;
		
		min = inputs[0];
		max = inputs[0];
		
		for (int i = 1; i < inputs.length; i++ ) {
			if (inputs[i] < min) {
				min = inputs[i];
			}
			if (inputs[i] > max) {
				max = inputs[i];
			}
		}
		minAndMax = new double[]{min, max};
		return minAndMax;
	}
	
	//this method calculates the 20 interest
	public static double interest(double total) {
		double interestRate;
		double totalInterest;
		
		interestRate = 0.2;
		totalInterest = interestRate * total;
		
		return totalInterest;
	}
	
	// this method prints the requested statistics
	public static void displayStats(double total, double avg, double[] minMax, double interest) {
		
		System.out.println("The sum of the user's inputs is: " + String.format("%.2f", total));
		System.out.println("The average of the user's inputs is: " + String.format("%.2f", avg));
		System.out.println("The min is: " + minMax[0] + " and the max is: " + minMax[1]);
		System.out.println("The total interest at the 20% rate is: " + String.format("%.2f", interest));
	}
		
}
	

