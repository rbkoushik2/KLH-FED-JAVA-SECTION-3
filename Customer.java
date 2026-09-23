class Customer {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "John Doe", "123-456-7890", "123 Main St");
        customer.display();
    }   

    int customerId;
    String name, phone, address;

    Customer(int customerId, String name, String phone, String address) {
        this.customerId = customerId;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    void display() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
    }
}

