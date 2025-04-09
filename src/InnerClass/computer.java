package InnerClass;

public class computer {
        public String brand ;
        public String model ;
        private OperatingSystem os ;

    public OperatingSystem getOs() {
        return os;
    }

    public computer(String brand, String model, String osName) {
        this.brand = brand;
        this.model = model;
        this.os = new OperatingSystem(osName) ;
    }

     class OperatingSystem {
            private String osName ;

            public OperatingSystem(){

            }
            public OperatingSystem ( String os) {
                this.osName = os ;
            }
            public void dislay(){
                System.out.println("computer Model" + model + "OS" + osName);
            }
        }
}
