package Online_shop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {

    @Test
    void makePayment() {
        Customer customer1 = new Customer("John");
        Products product1 = new Products("Apple",55,"Fruits","Local Fruits");
        Products product2 = new Products("Orange", 100,"Fruits","Foreign Fruits");

        customer1.AddToCart(product1);
        customer1.AddToCart(product2);

        assertEquals(155, customer1.paymnet.MakePayment(customer1.cart.SumTotalPrice()));
    }
}