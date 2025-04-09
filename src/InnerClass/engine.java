package InnerClass;

public class engine {

      private Car car ;
      public engine(Car car) {
          this.car = car ;
      }

    void start() {
        if (!car.isEngineOn()) {
            car.setEngineOn( true);
            System.out.println(car.getModel() + "Engine Started......");
        } else System.out.println(car.getModel() + "Engine is already Started...");
    }

    void stop () {
        if ( car.isEngineOn() ) {
            car.setEngineOn(false);
            System.out.println(car.getModel() + " Engine is stoped.....");
        }
        else System.out.println(car.getModel() + "Engine is already Stoped....");
    }
}
