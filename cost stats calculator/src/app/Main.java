package app;
import java.util.Scanner;

// My program uses multiple methods to determine the requested stats

public class Main {

	public static void main(String[] args) {
		int counter = 0;
		double[] inputs;
		inputs = new double[5];

		Scanner scnr = new Scanner(System.in);

		while (counter < 5) {
		    // I need to ensure this while loop asks the user to input a value 5 times
		    System.out.println("Input a value: ");
		    inputs[counter] = scnr.nextDouble();
		    counter += 1;
		}
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
	public static double average(double[] inputs) {
		double average;
		double total = total(inputs);
		
		average = total/inputs.length;
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
	public static double interest(double[] inputs) {
		double interestRate;
		double totalInterest;
		
		interestRate = 0.2;
		totalInterest = interestRate * total(inputs);
		
		return totalInterest;
	}
	
	// this method prints the requested stats
	public static String[] diplayStats(String[] args) {
		// 
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}
		
}
	

