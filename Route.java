public class Route {
    public static void main(String[] args) {
        // Create a route object
        Route route = new Route(101, "New York", "Los Angeles", 4500.0);

        // Display route details
        route.displayRoute();
    }

    int routeId;
    String startingPoint;
    String destination;
    double distance;

    public Route(int routeId, String startingPoint,
                 String destination, double distance) {

        this.routeId = routeId;
        this.startingPoint = startingPoint;
        this.destination = destination;
        this.distance = distance;
    }

    public void displayRoute() {

        System.out.println("\n===== ROUTE DETAILS =====");
        System.out.println("Route ID       : " + routeId);
        System.out.println("Starting Point : " + startingPoint);
        System.out.println("Destination    : " + destination);
        System.out.println("Distance       : " + distance + " km");
    }
}