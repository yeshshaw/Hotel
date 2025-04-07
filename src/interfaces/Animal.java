package interfaces;

public interface Animal {
    public abstract void eat() ;
    public abstract void sleep() ;
    public static final int age =  12 ;
    public static void info() {
        System.out.println("Animal are th emost quitest person inthe world");
    }

    default void run(){
        this.eat();
        System.out.println("good is good but okkeyy");
    }
}
