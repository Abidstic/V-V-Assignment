package Online_shop;

public class Main {
    public static void main(String[] args) {
        Products product1 = new Products("Apple",55,"Fruits","Local Fruits");
        Products product2 = new Products("Orange", 100,"Fruits","Foreign Fruits");
        Products product3 = new Products("Banana", 10,"Fruits","Local Fruits");

        Admin admin1 = new Admin("Admin1");

        admin1.AddProducts(product1.name,product1.price,product1.group,product1.subgroup);
        admin1.AddProducts(product2.name,product2.price,product2.group,product2.subgroup);
        admin1.AddProducts(product3.name,product3.price,product3.group,product3.subgroup);


        System.out.println("Admin1:");
        admin1.ViewProducts();
        Customer customer1 = new Customer("Customer1");



        customer1.AddToCart(product1);
        customer1.AddToCart(product2);

        System.out.println("Cart:");
        customer1.ViewCartProducts();

        System.out.println();
        System.out.println("Total Price: " + customer1.cart.SumTotalPrice());


        System.out.println("=====Payment=====");


        customer1.paymnet.MakePayment(customer1.cart.SumTotalPrice());


        System.out.println("Guest Products:");

        Guest guest1 = new Guest();
        guest1.ViewProducts(admin1);
        guest1.GetRegistered("Guest1");

    }
}
