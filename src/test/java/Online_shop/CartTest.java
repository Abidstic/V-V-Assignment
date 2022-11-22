package Online_shop;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {
    static Cart cart;
    static Cart cart2;
    static Products product1;
    static Products product2;
    static Products product3;

    @BeforeAll
    static void beforeAll() {
        cart = new Cart();
        product1 = new Products("Apple",55,"Fruits","Local Fruits");
        product2 = new Products("Orange", 100,"Fruits","Foreign Fruits");
        product3 = new Products("Banana", 10,"Fruits","Local Fruits");

        cart.AddToCart(product1);
        cart.AddToCart(product2);
        cart.AddToCart(product3);

    }

    @Test
    void addToCart() {
        assertEquals(3, cart.cartItems.size());
        assertEquals("Apple", cart.cartItems.get(0).name);
        assertEquals("Fruits", cart.cartItems.get(0).group);
        assertEquals("Local Fruits", cart.cartItems.get(0).subgroup);
        assertEquals(55, cart.cartItems.get(0).price);
    }

    @Test
    void deleteFromCart() {
        assertEquals(3, cart.cartItems.size());

        cart.DeleteFromCart(1);
        assertEquals(2, cart.cartItems.size());
        assertEquals("Apple", cart.cartItems.get(0).name);
        assertEquals("Fruits", cart.cartItems.get(0).group);
        assertEquals("Local Fruits", cart.cartItems.get(0).subgroup);
        assertEquals(55, cart.cartItems.get(0).price);
    }

    @Test
    void viewCart() {
        cart2 = new Cart();
        cart2.AddToCart(product1);
        cart2.AddToCart(product2);
        cart2.AddToCart(product3);


        assertEquals(3, cart2.cartItems.size());


        assertEquals("Apple", cart.cartItems.get(0).name);
        assertEquals("Fruits", cart.cartItems.get(0).group);
        assertEquals("Local Fruits", cart.cartItems.get(0).subgroup);
        assertEquals(55, cart.cartItems.get(0).price);

        assertEquals("Banana", cart2.cartItems.get(2).name);
        assertEquals("Fruits", cart2.cartItems.get(2).group);
        assertEquals("Local Fruits",cart2.cartItems.get(2).subgroup);
        assertEquals(10, cart2.cartItems.get(2).price);

        assertSame(cart2.cartItems, cart2.ViewCart());
    }

    @Test
    void sumTotalPrice() {
        assertEquals(65, cart.SumTotalPrice());
    }
    @Test
    void makePayment() {
        cart2 = new Cart();
        cart2.AddToCart(product1);
        cart2.AddToCart(product2);
        assertEquals(155, cart2.SumTotalPrice());
    }
}