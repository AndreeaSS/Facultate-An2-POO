package ex1;

interface Engine {
    int getFuelCapacity();
}

class Car {
    static class OttoEngine implements Engine {
        private int fuelCapacity;

        public OttoEngine(int fuelCapacity) {
            this.fuelCapacity = fuelCapacity;
        }

        public int getFuelCapacity() {
            return fuelCapacity;
        }
    }

    public OttoEngine setEngine(int fuelCapacity) {
        OttoEngine engine = new OttoEngine(fuelCapacity);
        return engine;
    }

    public Engine getEngine() {
        Engine engine = new OttoEngine(11);
        return engine;
    }
}

public class Test {
    public static void main(String[] args) {
        Car car = new Car();

        Engine firstEngine = car.getEngine();
        Engine secondEngine = car.setEngine(10);

        System.out.println(firstEngine.getFuelCapacity());
        System.out.println(secondEngine.getFuelCapacity());
    }
}