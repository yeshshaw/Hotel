package InnerClass;

public class test {
    public static void main(String[] args) {
    Car car = new Car() ;

    

    car.setModel("Austin Martin");

         Car.Engine engine = car.new Engine();

         engine.start();
         engine.start();

    }
}
