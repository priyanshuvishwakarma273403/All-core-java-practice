package InnerClasses;

public class Car {
    private String model;
    private boolean isEngineOn;

    public Car(String model) {
        this.model = model;
        this.isEngineOn = false;
    }

    class Engine {
        public void start() {
            if (!isEngineOn) {
                isEngineOn = true;
                System.out.println(model + " engine started...");
            } else {
                System.out.println(model + " engine already started...");
            }
        }

        public void stop() {
            if (isEngineOn) {
                isEngineOn = false;
                System.out.println(model + " engine stopped...");
            } else {
                System.out.println(model + " engine already stopped...");
            }
        }
    }
}
