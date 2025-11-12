package driver;

public class Vehicle {
    private Driver driver;
    private Engine engine;
    private final String brandCar;

    public Vehicle(String brandCar,Engine engine) {
        this.brandCar = brandCar;
        this.engine = engine;
    }

    public void driving(int distance){
        if(driver == null){
            System.out.println("No driver in the car " + brandCar + ". Cannot drive.");
            return;
        }
        engine.drive(distance);
    }

    public void infoAboutTrip(){
        System.out.println("Car brand: " + brandCar + ", driven kilometers: " + engine.getKilometers());
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setDriver(Driver driver){
        this.driver = driver;
    }
}
