package interfaces;

public class cat implements Animal{
    @Override
    public void eat() {
        System.out.println("Cat is eating...");
    }

    @Override
    public void sleep() {
        System.out.println("cat is sleeping...");
    }
}
