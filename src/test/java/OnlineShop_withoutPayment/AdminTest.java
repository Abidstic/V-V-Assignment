package OnlineShop_withoutPayment;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminTest {static Admin admin1;
    static Admin admin2;
    static Products product1;
    static Products product2;
    static Products product3;


    @BeforeAll
    static void beforeAll() {
        admin1 = new Admin("admin1");
        admin2 = new Admin("admin2");

        product1 = new Products("Apple",55,"Fruits","Local Fruits");
        product2 = new Products("Orange", 100,"Fruits","Foreign Fruits");
        product3 = new Products("Banana", 10,"Fruits","Local Fruits");

        admin1.AddProducts(product1.name,product1.price,product1.group,product1.subgroup);
        admin1.AddProducts(product2.name,product2.price,product2.group,product2.subgroup);
        admin1.AddProducts(product3.name,product3.price,product3.group,product3.subgroup);

    }
    @Test
    void ProductsItemsSizeIsThree() {
        assertEquals(3, admin1.productsItems.size());
    }

    @Test
    void viewProducts() {
        assertEquals(3, admin1.productsItems.size());

        assertEquals("Apple", admin1.productsItems.get(0).name);
        assertEquals("Fruits", admin1.productsItems.get(0).group);
        assertEquals("Local Fruits",admin1.productsItems.get(0).subgroup);
        assertEquals(4, admin1.productsItems.get(0).ID);
        assertEquals(55, admin1.productsItems.get(0).price);
    }

    @Test
    void addProducts() {
        admin2.AddProducts(product1.name,product1.price,product1.group,product1.subgroup);
        assertEquals(1, admin2.productsItems.size());

        admin2.AddProducts(product2.name,product2.price,product2.group,product2.subgroup);
        assertEquals(2, admin2.productsItems.size());

        admin2.AddProducts(product3.name,product3.price,product3.group,product3.subgroup);
        assertEquals(3, admin2.productsItems.size());
    }

    @Test
    void deleteProducts() {
        admin1.DeleteProducts(1);
        assertEquals(2, admin1.productsItems.size());

        admin1.DeleteProducts(0);
        assertEquals(1, admin1.productsItems.size());
    }

    @Test
    void modifyProducts() {
        admin2.AddProducts(product1.name,product1.price,product1.group,product1.subgroup);
        admin2.AddProducts(product2.name,product2.price,product2.group,product2.subgroup);
        admin2.AddProducts(product3.name,product3.price,product3.group,product3.subgroup);


        admin2.ModifyProducts(0,"Peanut", "Nut", "Small nuts", 30);
        assertEquals("Peanut", admin2.productsItems.get(0).name);
        assertEquals("Nut", admin2.productsItems.get(0).group);
        assertEquals("Small nuts", admin2.productsItems.get(0).subgroup);
        assertEquals(30, admin2.productsItems.get(0).price);
    }
}