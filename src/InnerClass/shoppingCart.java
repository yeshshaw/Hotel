package InnerClass;

public class shoppingCart {
    private double totalAmount ;

    public shoppingCart(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void processPayment(payment  paymentMethod) {
        paymentMethod.pay(totalAmount);
    }
}
