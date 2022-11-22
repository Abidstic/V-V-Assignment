package OnlineShop_withoutPayment;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    static Customer customer1;
    static Customer customer2;

    static Products product1;
    static Products product2;

    @BeforeAll
    static void beforeAll() {
        customer1 = new Customer("John");
        customer2 = new Customer("Mary");

        product1 = new Products("Apple",55,"Fruits","Local Fruits");
        product2 = new Products("Orange", 100,"Fruits","Foreign Fruits");


        customer1.AddToCart(product1);
        customer1.AddToCart(product2);
    }

    @Test
    void viewCartProducts() {
        assertEquals(2, customer1.cart.cartItems.size());
        assertEquals("Apple", customer1.cart.cartItems.get(0).name);
        assertEquals("Fruits", customer1.cart.cartItems.get(0).group);
        assertEquals("Local Fruits", customer1.cart.cartItems.get(0).subgroup);
        assertEquals(55, customer1.cart.cartItems.get(0).price);

        assertSame(customer1.cart.ViewCart(), customer1.ViewCartProducts());
    }

    @Test
    void addToCart() {
        assertEquals(2, customer1.cart.cartItems.size());
        assertEquals("Apple", customer1.cart.cartItems.get(0).name);
        assertEquals("Fruits", customer1.cart.cartItems.get(0).group);
        assertEquals("Local Fruits", customer1.cart.cartItems.get(0).subgroup);
        assertEquals(55, customer1.cart.cartItems.get(0).price);
    }

    @Test
    void deleteFromCart() {
        customer2.AddToCart(product1);
        customer2.AddToCart(product2);
        assertEquals(2, customer2.cart.cartItems.size());

        customer2.DeleteFromCart(1);
        assertEquals(1, customer2.cart.cartItems.size());
    }
    @Test
    void makePayment() {

    }
}