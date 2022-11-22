package OnlineShop_withoutPayment;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductsTest {

    static Products product1;
    static Products product2;

    @BeforeAll
    static void beforeAll() {
        product1 = new Products("Apple",55,"Fruits","Local Fruits");
        product2 = new Products("Orange", 100,"Fruits","Foreign Fruits");

    }

    @Test
    void setID() {
        product1.setID(1);
        assertEquals(1, product1.ID);
    }

    @Test
    void setPrice() {
        product1.setPrice(70);
        assertEquals(70, product1.price);

    }

    @Test
    void setName() {
        product1.setName("Pear");
        assertEquals("Pear", product1.name);
    }

    @Test
    void setGroup() {
        product1.setGroup("Vegetable");
        assertEquals("Vegetable", product1.group);
    }

    @Test
    void setSubgroup() {
        product1.setSubgroup("Exotic vegetable");
        assertEquals("Exotic vegetable",product1.subgroup);
    }
}