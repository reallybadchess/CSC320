package portfolioproject;

import java.util.Scanner;

import Automobile;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AutomobileInventory {

    public static void main(String[] args) {
        try {
            // call the automobile class using theparameterized constructor
            Automobile myCar = new Automobile("Honda", "Civic", "Blue", 2020, 35000);

            // list the values and loop through the array to print them
            String[] info = myCar.listVehicleInformation();
            System.out.println("original vehicle information:");
            for (String item : info) {
                System.out.println(item);
            }

            // remove the vehicle to clear the variables
            String removeResult = myCar.removeVehicle("Honda", "Civic", "Blue", 2020, 35000);
            System.out.println(removeResult);

            // add a new vehicle
            String addResult = myCar.addNewVehicle("Toyota", "Corolla", "Red", 2022, 15000);
            System.out.println(addResult);

            // list the new vehicle information
            info = myCar.listVehicleInformation();
            System.out.println("new vehicle information:");
            for (String item : info) {
                System.out.println(item);
            }

            // update the vehicle
            String updateResult = myCar.updateVehicleAttributes("Toyota", "Camry", "Black", 2023, 5000);
            System.out.println(updateResult);

            // list the updated vehicle information
            info = myCar.listVehicleInformation();
            System.out.println("updated vehicle information:");
            for (String item : info) {
                System.out.println(item);
            }

            // ask the user if they want to print the information to a file
            Scanner scanner = new Scanner(System.in);
            System.out.print("do you want to pirnt the information to a file? (y/n): ");
            String response = scanner.nextLine();

            if (response.equalsIgnoreCase("Y")) {
                printToFile(info);
            } else {
                System.out.println("file will not be printed.");
            }

            scanner.close();

        } catch (Exception mistake) {
            System.out.println("an error occurred in the program");
        }
    }

    // prints the vehicle information to a predefined file location
    public static void printToFile(String[] info) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("C:\\Temp\\Autos.txt"));
            for (String item : info) {
                writer.println(item);
            }
            writer.close();
            System.out.println("information printed to file.");
        } catch (IOException mistake) {
            System.out.println("file could not be written");
        }
    }
}
