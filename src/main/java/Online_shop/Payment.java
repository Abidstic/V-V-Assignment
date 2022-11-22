package Online_shop;

public class Payment {
    public float TotalPrice;


    public Payment() {
        TotalPrice = 0;
    }

    public float MakePayment(float totalPrice){
        System.out.println("Total Price: " + totalPrice);
        System.out.println("Payment Done");
        return totalPrice;
    }
}
