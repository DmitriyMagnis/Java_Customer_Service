package app;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Customer Service App");

        Customer customer = getCustomer(getData());
        String output = "Customer: " + customer.getName() +
                ",\n phone " + customer.getPhone();
        getOutput(output);
    }

    private static String[] getData() {
        return new String[]{"Dmytro", "+380682991803"};
    }

    private static Customer getCustomer(String[] data) {
        return new Customer(data[0], data[1]);
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
