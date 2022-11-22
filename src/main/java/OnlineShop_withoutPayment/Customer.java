package OnlineShop_withoutPayment;



import java.util.ArrayList;

public class Customer {
    static int customerCount=1;
    private int customeID;
    public String name;
    public Cart cart;
    public Payment paymnet;

    public Customer(String name)
    {
        customeID=customerCount;
        this.name=name;
        customerCount++;
        cart=new Cart();
        paymnet=new Payment();
    }
    public ArrayList<Products> ViewCartProducts(){

        return cart.ViewCart();
    }

    public void AddToCart(Products product){

        cart.AddToCart(product);
    }

    public void DeleteFromCart(int id){
        cart.DeleteFromCart(id);
    }
}
