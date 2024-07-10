import java.util.Scanner;
public class Product {
    private String p_code;
    private String p_name;
    private double price;

    // Constructor
    public Product(String p_code, String p_name, double price) {
        this.p_code = p_code;
        this.p_name = p_name;
        this.price = price;
    }

    // Getters
    public String getP_code() {
        return p_code;
    }

    public String getP_name() {
        return p_name;
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
//        // Creating three Product objects
//        Product product1 = new Product("P001", "Product 1", 25.50);
//        Product product2 = new Product("P002", "Product 2", 15.75);
//        Product product3 = new Product("P003", "Product 3", 30.00);
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many products do you want inserting.?");
        int t_prod = scanner.nextInt();
        Product[] products = new Product[t_prod];

        // Creating three Product objects from user input
        for (int i = 0; i < products.length; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");
            System.out.print("Product Code: ");
            String p_code = scanner.next();
            System.out.print("Product Name: ");
            String p_name = scanner.next();
            System.out.print("Product Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            products[i] = new Product(p_code, p_name, price);
        }

        // Finding the product with the lowest price
//        Product[] products = {product1, product2, product3};
        Product lowestPricedProduct = products[0];

        for (int i = 1; i < products.length; i++) {
            if (products[i].getPrice() < lowestPricedProduct.getPrice()) {
                lowestPricedProduct = products[i];
            }
        }

        // Displaying the product with the lowest price
        System.out.println("Product with the lowest price:");
        System.out.println("Code: " + lowestPricedProduct.getP_code());
        System.out.println("Name: " + lowestPricedProduct.getP_name());
        System.out.println("Price: " + lowestPricedProduct.getPrice());
    }
}


