
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private final Map<String, Double> items = new HashMap<>();

    // Add a product to the cart
    public void addItem(String name, double price) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Product name cannot be empty"
            );
        }

        if (price <= 0) {
            throw new IllegalArgumentException(
                "Price must be greater than zero"
            );
        }

        items.put(name, price);
    }

    // Remove a product from the cart
    public void removeItem(String name) {
        if (!items.containsKey(name)) {
            throw new IllegalArgumentException(
                "Product not found"
            );
        }

        items.remove(name);
    }

    // Calculate the total price
    public double calculateTotal() {
        double total = 0;

        for (double price : items.values()) {
            total += price;
        }

        return total;
    }

    // Count products in the cart
    public int getItemCount() {
        return items.size();
    }
}