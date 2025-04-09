package InnerClass;

public class CreditCard implements payment{

    @Override
    public void pay(double amount) {
        System.out.println("paid " + amount + " using credit card.");
    }
}
