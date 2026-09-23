public class Courier {
    public static void main(String[] args) {
        // Create a courier object
        Courier courier = new Courier(1, "John Doe", "123-456-7890", "AB-1234");

        // Display courier details
        courier.displayCourier();
    }
      
    int courierId;
    String courierName;
    String phoneNumber;
    String vehicleNumber;

    // Constructor
    public Courier(int courierId, String courierName,
                   String phoneNumber, String vehicleNumber) {

        this.courierId = courierId;
        this.courierName = courierName;
        this.phoneNumber = phoneNumber;
        this.vehicleNumber = vehicleNumber;
    }

    // Display courier details
    public void displayCourier() {

        System.out.println("----------------------------");
        System.out.println("Courier ID     : " + courierId);
        System.out.println("Courier Name   : " + courierName);
        System.out.println("Phone Number   : " + phoneNumber);
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("----------------------------");
    }
}