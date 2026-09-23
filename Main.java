import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    // Courier details
    static int[] courierId = new int[10];
    static String[] courierName = new String[10];
    static String[] courierPhone = new String[10];
    static String[] vehicleNumber = new String[10];
    static int courierCount = 0;

    // Customer details
    static int[] customerId = new int[10];
    static String[] customerName = new String[10];
    static String[] customerPhone = new String[10];
    static String[] customerAddress = new String[10];
    static int customerCount = 0;

    // Delivery details
    static int[] deliveryId = new int[10];
    static int[] deliveryCustomerId = new int[10];
    static int[] deliveryCourierId = new int[10];
    static String[] pickup = new String[10];
    static String[] destination = new String[10];
    static String[] status = new String[10];
    static int deliveryCount = 0;

    // Route details
    static int[] routeId = new int[10];
    static String[] startingPoint = new String[10];
    static String[] routeDestination = new String[10];
    static double[] distance = new double[10];
    static int routeCount = 0;


    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n======================================");
            System.out.println("   COURIER DELIVERY TRACKING SYSTEM");
            System.out.println("======================================");

            System.out.println("1. Add Courier");
            System.out.println("2. View Couriers");
            System.out.println("3. Search Courier");
            System.out.println("4. Add Customer");
            System.out.println("5. View Customers");
            System.out.println("6. Create Delivery");
            System.out.println("7. Track Delivery");
            System.out.println("8. Update Delivery Status");
            System.out.println("9. View Route");
            System.out.println("10. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addCourier();
                    break;

                case 2:
                    viewCouriers();
                    break;

                case 3:
                    searchCourier();
                    break;

                case 4:
                    addCustomer();
                    break;

                case 5:
                    viewCustomers();
                    break;

                case 6:
                    createDelivery();
                    break;

                case 7:
                    trackDelivery();
                    break;

                case 8:
                    updateStatus();
                    break;

                case 9:
                    viewRoute();
                    break;

                case 10:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 10);
    }


    // 1. ADD COURIER
    static void addCourier() {

        System.out.println("\n===== ADD COURIER =====");

        System.out.print("Enter Courier ID: ");
        courierId[courierCount] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Courier Name: ");
        courierName[courierCount] = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        courierPhone[courierCount] = sc.nextLine();

        System.out.print("Enter Vehicle Number: ");
        vehicleNumber[courierCount] = sc.nextLine();

        courierCount++;

        System.out.println("Courier added successfully!");
    }


    // 2. VIEW COURIERS
    static void viewCouriers() {

        System.out.println("\n===== COURIERS =====");

        if (courierCount == 0) {
            System.out.println("No couriers available.");
        }

        for (int i = 0; i < courierCount; i++) {

            System.out.println("\nCourier " + (i + 1));
            System.out.println("ID       : " + courierId[i]);
            System.out.println("Name     : " + courierName[i]);
            System.out.println("Phone    : " + courierPhone[i]);
            System.out.println("Vehicle  : " + vehicleNumber[i]);
        }
    }


    // 3. SEARCH COURIER
    static void searchCourier() {

        System.out.println("\n===== SEARCH COURIER =====");

        System.out.print("Enter Courier ID: ");
        int id = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < courierCount; i++) {

            if (courierId[i] == id) {

                System.out.println("\nCourier Found!");
                System.out.println("ID       : " + courierId[i]);
                System.out.println("Name     : " + courierName[i]);
                System.out.println("Phone    : " + courierPhone[i]);
                System.out.println("Vehicle  : " + vehicleNumber[i]);

                found = true;
            }
        }

        if (!found) {
            System.out.println("Courier not found!");
        }
    }


    // 4. ADD CUSTOMER
    static void addCustomer() {

        System.out.println("\n===== ADD CUSTOMER =====");

        System.out.print("Enter Customer ID: ");
        customerId[customerCount] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        customerName[customerCount] = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        customerPhone[customerCount] = sc.nextLine();

        System.out.print("Enter Address: ");
        customerAddress[customerCount] = sc.nextLine();

        customerCount++;

        System.out.println("Customer added successfully!");
    }


    // 5. VIEW CUSTOMERS
    static void viewCustomers() {

        System.out.println("\n===== CUSTOMERS =====");

        if (customerCount == 0) {
            System.out.println("No customers available.");
        }

        for (int i = 0; i < customerCount; i++) {

            System.out.println("\nCustomer " + (i + 1));
            System.out.println("ID       : " + customerId[i]);
            System.out.println("Name     : " + customerName[i]);
            System.out.println("Phone    : " + customerPhone[i]);
            System.out.println("Address  : " + customerAddress[i]);
        }
    }


    // 6. CREATE DELIVERY
    static void createDelivery() {

        System.out.println("\n===== CREATE DELIVERY =====");

        System.out.print("Enter Delivery ID: ");
        deliveryId[deliveryCount] = sc.nextInt();

        System.out.print("Enter Customer ID: ");
        deliveryCustomerId[deliveryCount] = sc.nextInt();

        System.out.print("Enter Courier ID: ");
        deliveryCourierId[deliveryCount] = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Pickup Location: ");
        pickup[deliveryCount] = sc.nextLine();

        System.out.print("Enter Destination: ");
        destination[deliveryCount] = sc.nextLine();

        // Every new delivery starts as Booked
        status[deliveryCount] = "Booked";

        // Route details
        System.out.print("Enter Route ID: ");
        routeId[routeCount] = sc.nextInt();
        sc.nextLine();

        startingPoint[routeCount] = pickup[deliveryCount];
        routeDestination[routeCount] = destination[deliveryCount];

        System.out.print("Enter Distance (km): ");
        distance[routeCount] = sc.nextDouble();

        routeCount++;
        deliveryCount++;

        System.out.println("\nDelivery created successfully!");
        System.out.println("Status: Booked");
    }


    // 7. TRACK DELIVERY
    static void trackDelivery() {

        System.out.println("\n===== TRACK DELIVERY =====");

        System.out.print("Enter Delivery ID: ");
        int id = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < deliveryCount; i++) {

            if (deliveryId[i] == id) {

                System.out.println("\nDelivery Found!");
                System.out.println("Delivery ID : " + deliveryId[i]);
                System.out.println("Customer ID : " + deliveryCustomerId[i]);
                System.out.println("Courier ID  : " + deliveryCourierId[i]);
                System.out.println("Pickup      : " + pickup[i]);
                System.out.println("Destination : " + destination[i]);
                System.out.println("Status      : " + status[i]);

                found = true;
            }
        }

        if (!found) {
            System.out.println("Delivery not found!");
        }
    }


    // 8. UPDATE DELIVERY STATUS
    static void updateStatus() {

        System.out.println("\n===== UPDATE DELIVERY STATUS =====");

        System.out.print("Enter Delivery ID: ");
        int id = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < deliveryCount; i++) {

            if (deliveryId[i] == id) {

                found = true;

                System.out.println("\nCurrent Status: " + status[i]);

                System.out.println("\n1. Booked");
                System.out.println("2. In Transit");
                System.out.println("3. Out for Delivery");
                System.out.println("4. Delivered");

                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        status[i] = "Booked";
                        break;

                    case 2:
                        status[i] = "In Transit";
                        break;

                    case 3:
                        status[i] = "Out for Delivery";
                        break;

                    case 4:
                        status[i] = "Delivered";
                        break;

                    default:
                        System.out.println("Invalid choice!");
                        return;
                }

                System.out.println("Status updated!");
                System.out.println("New Status: " + status[i]);
            }
        }

        if (!found) {
            System.out.println("Delivery not found!");
        }
    }


    // 9. VIEW ROUTE
    static void viewRoute() {

        System.out.println("\n===== VIEW ROUTE =====");

        if (routeCount == 0) {
            System.out.println("No routes available.");
            return;
        }

        System.out.print("Enter Route ID: ");
        int id = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < routeCount; i++) {

            if (routeId[i] == id) {

                System.out.println("\nRoute Found!");
                System.out.println("Route ID       : " + routeId[i]);
                System.out.println("Starting Point : " + startingPoint[i]);
                System.out.println("Destination    : " + routeDestination[i]);
                System.out.println("Distance       : " + distance[i] + " km");

                found = true;
            }
        }

        if (!found) {
            System.out.println("Route not found!");
        }
    }
}