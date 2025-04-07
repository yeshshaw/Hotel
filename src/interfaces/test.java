package interfaces;

public class test {
    public static void main(String[] args) {
        dog DOG = new dog() ;
        cat CAT = new cat() ;
        CAT.sleep() ;
        DOG.eat();
        System.out.println(DOG.age);
        System.out.println(Animal.age);
        Animal.info();
        CAT.run();
    }
}
