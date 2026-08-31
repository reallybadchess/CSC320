import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyTemperature {

    public static void main(String[] args) {

        // Two ArrayLists to hold the data: one for days, one for temperatures
        ArrayList<String> days = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();

        // The day names, in order - used to drive the loop below
        String[] dayNames = {"Monday", "Tuesday", "Wednesday", "Thursday",
                              "Friday", "Saturday", "Sunday"};

        Scanner input = new Scanner(System.in);

        // Ask the user for each day's average temperature and store it
        for (int i = 0; i < dayNames.length; i++) {
            System.out.print("Enter the average temperature for " + dayNames[i] + ": ");
            double temp = input.nextDouble();
            days.add(dayNames[i]);
            temperatures.add(temp);
        }

        input.nextLine(); // clears the leftover newline left behind by nextDouble()

        System.out.println();
        System.out.println("Enter a day of the week (Monday - Sunday),");
        System.out.println("or type \"week\" to see the temperatures for the whole week.");
        System.out.print("Your choice: ");
        String choice = input.nextLine();

        // Decision: did the user ask for the whole week, or just one day?
        if (choice.equalsIgnoreCase("week")) {

            double total = 0;

            // Loop through both ArrayLists and print each day's temperature
            for (int i = 0; i < days.size(); i++) {
                System.out.println(days.get(i) + ": " + temperatures.get(i) + " degrees");
                total = total + temperatures.get(i);
            }

            // Calculate the weekly average, rounded to 1 decimal place
            double average = total / temperatures.size();
            average = Math.round(average * 10) / 10.0;

            System.out.println("Weekly average temperature: " + average + " degrees");

        } else {

            boolean dayFound = false;

            // Loop through the days ArrayList looking for a match
            for (int i = 0; i < days.size(); i++) {
                if (days.get(i).equalsIgnoreCase(choice)) {
                    System.out.println(days.get(i) + ": " + temperatures.get(i) + " degrees");
                    dayFound = true;
                }
            }

            if (!dayFound) {
                System.out.println(choice + " is not a valid day of the week.");
            }
        }

        input.close();
    }
}