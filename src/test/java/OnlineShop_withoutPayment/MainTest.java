package OnlineShop_withoutPayment;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    static Admin admin;

    @BeforeAll
    static void beforeAll() {
        admin = new Admin("Admin");


        admin.AddProducts("Apple",55,"Fruits","Local Fruits");
        admin.AddProducts("Orange", 100,"Fruits","Foreign Fruits");

    }

    @Test
    void main() {
        assertEquals(2, admin.productsItems.size());
        assertEquals("Apple", admin.productsItems.get(0).name);
        assertEquals("Fruits", admin.productsItems.get(0).group);
        assertEquals("Local Fruits",admin.productsItems.get(0).subgroup);
        assertEquals(1, admin.productsItems.get(0).ID);
        assertEquals(55, admin.productsItems.get(0).price);
    }
}