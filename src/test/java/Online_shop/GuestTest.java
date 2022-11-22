package Online_shop;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuestTest {
    static Admin admin;
    static Guest guest;

    @BeforeAll
    static void beforeAll() {
        admin = new Admin("Admin");
        guest = new Guest();

        admin.AddProducts("Apple",55,"Fruits","Local Fruits");
        admin.AddProducts("Orange", 100,"Fruits","Foreign Fruits");

    }

    @Test
    void viewProducts() {
        assertEquals(2, guest.ViewProducts(admin).size());
        assertEquals("Apple", guest.ViewProducts(admin).get(0).name);
    }

    @Test
    void getRegistered() {
        guest.GetRegistered("Guest1");
        assertEquals("Guest1", guest.GetRegistered("Guest1").name);
    }
}