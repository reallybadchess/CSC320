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
    
	public static double Total(double[] inputs) {
		double total;
		total = 0;
		
		for (int i = 0; i < inputs.length; i++) {
			total += inputs[i];
		}
		    return total;
		}
	
	public static double Average(double[] inputs) {
		double average;
		double total = Total(inputs);
		
		average = total/inputs.length;
		return average;
	}
	

	}

}
