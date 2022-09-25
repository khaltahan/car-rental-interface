import java.util.ArrayList;

public class CarRentalAgent {
    private String companyName, address;
    // ArrayList of type Car
    private ArrayList<Car> CarInventory = new ArrayList<>();

    // Constructor method
    public CarRentalAgent(String name, String address) {
        this.companyName = name;
        this.address = address;
    }

    /* Method to add Car object to ArrayList and return true if it is not already found in the list,
    or return false if Car object is already found in the list */
    public Boolean addInventory(Car car) {
        if (car.isSameCar(car)) {
            return this.CarInventory.add(car);
        } else {
            return false;
        }
    }

    // Method to format and print output of inventory
    public void printInventory() {
        System.out.println("Agent name: " + companyName + "\nAgent address: " + address + "\n");
        System.out.printf("%-18s %-11s %-17s %-18s", "Car Model and Make", "Year-color", "VIN", "Category");
        System.out.println("\n------------------ ----------- ----------------- ------------------");
        // Iterate through the list
        for (Car car : CarInventory)
            System.out.println(car);
    }

    /* Method to change the value of the rented field to false and return true if the car used to be in the agent's
    inventory, otherwise method returns false */
    public Boolean returnCar(Car car) {
        if (car.isRented()) {
            car.setRented(false);
            return true;
        } else {
            return false;
        }
    }

    // Method to set rented field to true if the passed car is currently available, otherwise method returns false
    public Boolean rentCar(Car car) {
        if (!car.isRented()) {
            car.setRented(true);
            return true;
        } else {
            return false;
        }
    }

}
