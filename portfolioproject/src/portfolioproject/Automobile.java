package portfolioproject;

public class Automobile {

    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

    // default constructor
    public Automobile() {
        try {
            make = "";
            model = "";
            color = "";
            year = 0;
            mileage = 0;
        } catch (Exception mistake) {
            System.out.println("automobile object could not be created");
        }
    }

    // parameterized constructor
    public Automobile(String autoMake, String autoModel, String autoColor, int autoYear, int autoMileage) {
        try {
            make = autoMake;
            model = autoModel;
            color = autoColor;
            year = autoYear;
            mileage = autoMileage;
        } catch (Exception mistake) {
            System.out.println("automobile object could not be created");
        }
    }

    // adds a new vehicle's information to this object
    public String addNewVehicle(String autoMake, String autoModel, String autoColor, int autoYear, int autoMileage) {
        String resultMessage;
        try {
            if (autoYear < 0 || autoMileage < 0) {
                throw new Exception("year and mileage cannot be negative");
            }
            make = autoMake;
            model = autoModel;
            color = autoColor;
            year = autoYear;
            mileage = autoMileage;
            resultMessage = "vehicle added successfully";
        } catch (Exception mistake) {
            resultMessage = "vehicle could not be added";
        }
        return resultMessage;
    }

    // returns the vehicles information as a string array
    public String[] listVehicleInformation() {
        String[] vehicleInfo = new String[5];
        try {
            vehicleInfo[0] = make;
            vehicleInfo[1] = model;
            vehicleInfo[2] = color;
            vehicleInfo[3] = String.valueOf(year);
            vehicleInfo[4] = String.valueOf(mileage);
        } catch (Exception mistake) {
            vehicleInfo[0] = "vehicle information could not be retrieved";
        }
        return vehicleInfo;
    }

    // removes the vehicles information if the passed-in values match what is stored
    public String removeVehicle(String autoMake, String autoModel, String autoColor, int autoYear, int autoMileage) {
        String resultMessage;
        try {
            if (autoMake.equals(make) && autoModel.equals(model) && autoColor.equals(color)
                    && autoYear == year && autoMileage == mileage) {
                make = "";
                model = "";
                color = "";
                year = 0;
                mileage = 0;
                resultMessage = "vehicle removed successfully";
            } else {
                throw new Exception("vehicle information did not match");
            }
        } catch (Exception mistake) {
            resultMessage = "vehicle information did not match, nothing removed";
        }
        return resultMessage;
    }

    // updates the vehicles attributes with new values
    public String updateVehicleAttributes(String autoMake, String autoModel, String autoColor, int autoYear, int autoMileage) {
        String resultMessage;
        try {
            if (autoYear < 0 || autoMileage < 0) {
                throw new Exception("year and mileage cannot be negative");
            }
            make = autoMake;
            model = autoModel;
            color = autoColor;
            year = autoYear;
            mileage = autoMileage;
            resultMessage = "vehicle updated successfully";
        } catch (Exception mistake) {
            resultMessage = "vehicle could not be updated";
        }
        return resultMessage;
    }
}