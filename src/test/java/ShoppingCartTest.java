
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {

    @Test
    void testAddItem() {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Laptop", 50000);

        assertEquals(1, cart.getItemCount());
    }

    @Test
    void testCalculateTotal() {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Laptop", 50000);
        cart.addItem("Mouse", 1000);

        assertEquals(51000, cart.calculateTotal(), 0.001);
    }

    @Test
    void testRemoveItem() {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Keyboard", 2000);
        cart.removeItem("Keyboard");

        assertEquals(0, cart.getItemCount());
    }

    @Test
    void testInvalidPrice() {
        ShoppingCart cart = new ShoppingCart();

        assertThrows(
            IllegalArgumentException.class,
            () -> cart.addItem("Laptop", -100)
        );
    }
}