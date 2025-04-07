package InnerClass;

public class Car {
    private String model ;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isEngineOn() {
        return isEngineOn;
    }

    public void setEngineOn(boolean engineOn) {
        isEngineOn = engineOn;
    }

    private boolean isEngineOn ;
    public Car(){

    }

    public Car(String name ) {
        this.model = name ;
        this.isEngineOn = false ;
    }

    class  Engine {

        void start() {
            if (!isEngineOn) {
                isEngineOn = true;
                System.out.println(model + "Engine Started......");
            } else System.out.println(model + "Engine is already Started...");
        }

        void stop () {
            if ( isEngineOn ) {
                isEngineOn = false ;
                System.out.println(model + " Engine is stoped.....");
            }
            else System.out.println(model + "Engine is already Stoped....");
        }
    }

}
