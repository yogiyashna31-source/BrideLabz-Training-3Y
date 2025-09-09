package Level1;
public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double BASE_RATE_PER_DAY = 50.0; // Base rate for rental

    // Default constructor
    public CarRental() {
        this.customerName = "Unknown Customer";
        this.carModel = "Standard";
        this.rentalDays = 1;
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = (customerName != null && !customerName.trim().isEmpty()) ? customerName : "Unknown Customer";
        this.carModel = (carModel != null && !carModel.trim().isEmpty()) ? carModel : "Standard";
        this.rentalDays = (rentalDays > 0) ? rentalDays : 1;
    }

    // Copy constructor
    public CarRental(CarRental other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
    }

    // Getters
    public String getCustomerName() {
        return customerName;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    // Setters
    public void setCustomerName(String customerName) {
        this.customerName = (customerName != null && !customerName.trim().isEmpty()) ? customerName : this.customerName;
    }

    public void setCarModel(String carModel) {
        this.carModel = (carModel != null && !carModel.trim().isEmpty()) ? carModel : this.carModel;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = (rentalDays > 0) ? rentalDays : this.rentalDays;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        double rateMultiplier;
        switch (carModel.toLowerCase()) {
            case "luxury":
                rateMultiplier = 2.0;
                break;
            case "suv":
                rateMultiplier = 1.5;
                break;
            case "standard":
            default:
                rateMultiplier = 1.0;
                break;
        }
        return BASE_RATE_PER_DAY * rateMultiplier * rentalDays;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create rentals using different constructors
        CarRental rental1 = new CarRental(); // Default constructor
        CarRental rental2 = new CarRental("Jane Smith", "Luxury", 5); // Parameterized constructor
        CarRental rental3 = new CarRental(rental2); // Copy constructor

        // Print details and total cost for each rental
        System.out.println("Rental 1 (Default):");
        System.out.println("Customer: " + rental1.getCustomerName());
        System.out.println("Car Model: " + rental1.getCarModel());
        System.out.println("Rental Days: " + rental1.getRentalDays());
        System.out.println("Total Cost: $" + rental1.calculateTotalCost());

        System.out.println("\nRental 2 (Parameterized):");
        System.out.println("Customer: " + rental2.getCustomerName());
        System.out.println("Car Model: " + rental2.getCarModel());
        System.out.println("Rental Days: " + rental2.getRentalDays());
        System.out.println("Total Cost: $" + rental2.calculateTotalCost());

        System.out.println("\nRental 3 (Copy of Rental 2):");
        System.out.println("Customer: " + rental3.getCustomerName());
        System.out.println("Car Model: " + rental3.getCarModel());
        System.out.println("Rental Days: " + rental3.getRentalDays());
        System.out.println("Total Cost: $" + rental3.calculateTotalCost());
    }
}