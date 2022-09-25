class Car implements Comparable{
    private String make, model, color, year, VIN;
    private int noOfDoors, noOfSeats, noOfSuitcases, noOfBags;
    private Boolean rented = false;

    // Constructor method
    public Car(String make, String model, String color, String year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    // Method to assign the passed value to the VIN field.
    public void setVIN(String vin) {
        this.VIN = vin;
    }

    // Method to assign passed values to the oOfDoors and noOfSeats fields
    public void setSize(int door, int seat) {
        this.noOfDoors = door;
        this.noOfSeats = seat;
    }

    // Method to assign passed values to the noOfSuitcases and noOfBags fields
    public void setLuggage(int suitcase, int bag) {
        this.noOfSuitcases = suitcase;
        this.noOfBags = bag;
    }

    // Method to assign passed boolean value to the rented field
    public void setRented(Boolean status) {
        this.rented = status;
    }

    // Method to return the make, model, year and color
    public String getCarInfo() {
        return make + ", " + model + " " + year + "-" + color;
    }

    // Override toString method in the Object class
    public String toString() {
        return String.format("%-18s %-11s %-17s %-18s", make + ", " + model, year + "-" + color, VIN, getCategory());
    }

    // Method to return true if the instance field VIN is equal to the object's VIN value
    public Boolean isSameCar(Car car) {
        if (this.VIN == car.VIN) {
            return true;
        } else {
            return false;
        }
    }

    // Method to determine which category the car falls under
    public String getCategory() {
        if (noOfDoors == 4 && noOfSeats == 5 && noOfSuitcases == 1 && noOfBags == 1) {
            return "Economy";
        } else if (noOfDoors == 4 && noOfSeats == 5 && noOfSuitcases == 1 && noOfBags == 2) {
            return "Compact";
        } else if (noOfDoors == 4 && noOfSeats == 5 && noOfSuitcases == 2 && noOfBags == 1) {
            return "Mid-size(Standard)";
        } else if (noOfDoors == 4 && noOfSeats == 5 && noOfSuitcases == 2 && noOfBags == 2) {
            return "Full-size(Premium)";
        } else if (noOfDoors == 2 && noOfSeats == 4 && noOfSuitcases == 1 && noOfBags == 1) {
            return "Convertible";
        } else {
            return "Undefined";
        }
    }

    // Method to return the field value of rented
    public Boolean isRented() {
        return rented;
    }
}

