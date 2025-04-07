package interfaces;

public class dog implements Animal{

    @Override
    public void eat() {
        System.out.println("Bob is eating..." );
    }

    @Override
    public void sleep() {
        System.out.println("Bob is sleeping....");
    }
}
