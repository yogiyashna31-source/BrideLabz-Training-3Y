package Level1;
public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBooking() {
        this.guestName = "Unknown Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = (guestName != null && !guestName.trim().isEmpty()) ? guestName : "Unknown Guest";
        this.roomType = (roomType != null && !roomType.trim().isEmpty()) ? roomType : "Standard";
        this.nights = (nights > 0) ? nights : 1;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Getters
    public String getGuestName() {
        return guestName;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getNights() {
        return nights;
    }

    // Setters
    public void setGuestName(String guestName) {
        this.guestName = (guestName != null && !guestName.trim().isEmpty()) ? guestName : this.guestName;
    }

    public void setRoomType(String roomType) {
        this.roomType = (roomType != null && !roomType.trim().isEmpty()) ? roomType : this.roomType;
    }

    public void setNights(int nights) {
        this.nights = (nights > 0) ? nights : this.nights;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create bookings using different constructors
        HotelBooking booking1 = new HotelBooking(); // Default constructor
        HotelBooking booking2 = new HotelBooking("John Doe", "Deluxe", 3); // Parameterized constructor
        HotelBooking booking3 = new HotelBooking(booking2); // Copy constructor

        // Print details of all bookings
        System.out.println("Booking 1 (Default):");
        System.out.println("Guest: " + booking1.getGuestName());
        System.out.println("Room Type: " + booking1.getRoomType());
        System.out.println("Nights: " + booking1.getNights());

        System.out.println("\nBooking 2 (Parameterized):");
        System.out.println("Guest: " + booking2.getGuestName());
        System.out.println("Room Type: " + booking2.getRoomType());
        System.out.println("Nights: " + booking2.getNights());

        System.out.println("\nBooking 3 (Copy of Booking 2):");
        System.out.println("Guest: " + booking3.getGuestName());
        System.out.println("Room Type: " + booking3.getRoomType());
        System.out.println("Nights: " + booking3.getNights());
    }
}