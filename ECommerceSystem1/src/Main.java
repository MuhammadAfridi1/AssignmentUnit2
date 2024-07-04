import com.ecommerce.Product;
import com.ecommerce.Customer;
import com.ecommerce.orders.Order;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create Products
        Product product1 = new Product(1, "Laptop", 999.99);
        Product product2 = new Product(2, "Smartphone", 499.99);

        // Create Customer
        Customer customer = new Customer(1567, "Muhammad Afridi");

        // Customer browsing and adding products to cart
        customer.addProductToCart(product1);
        customer.addProductToCart(product2);

        // Display Customer and Cart Details
        System.out.println(customer);
        System.out.println("Shopping Cart: " + customer.getShoppingCart());
        System.out.println("Total Cost: $" + customer.calculateTotalCost());

        // Create Order
        List<Product> cartProducts = new ArrayList<>(customer.getShoppingCart());
        Order order = new Order(179, customer, cartProducts);

        // Display Order Details
        System.out.println(order);
    }
}
