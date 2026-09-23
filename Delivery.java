public class Delivery {
    public static void main(String[] args) {
        // Create a delivery object
        Delivery delivery = new Delivery(201, 301, 401, "Warehouse A", "Customer B");

        // Display delivery details
        delivery.displayDelivery();

        // Update the status of the delivery
        delivery.updateStatus("In Transit");
        System.out.println("\nUpdated Status: " + delivery.status);
    }

    int deliveryId;
    int customerId;
    int courierId;
    String pickup;
    String destination;
    String status;

    public Delivery(int deliveryId, int customerId, int courierId,
                    String pickup, String destination) {

        this.deliveryId = deliveryId;
        this.customerId = customerId;
        this.courierId = courierId;
        this.pickup = pickup;
        this.destination = destination;

        // Every new delivery starts as Booked
        this.status = "Booked";
    }

    public void displayDelivery() {

        System.out.println("\n===== DELIVERY DETAILS =====");
        System.out.println("Delivery ID  : " + deliveryId);
        System.out.println("Customer ID  : " + customerId);
        System.out.println("Courier ID   : " + courierId);
        System.out.println("Pickup       : " + pickup);
        System.out.println("Destination  : " + destination);
        System.out.println("Status       : " + status);
    }

    public void updateStatus(String newStatus) {

        status = newStatus;
    }
}