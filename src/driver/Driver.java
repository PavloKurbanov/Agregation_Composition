package driver;

public class Driver {
    private final String driverName;
    private Vehicle vehicle;

    public Driver(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getIntoTheCar(Vehicle vehicle) {
        this.vehicle = vehicle;
        vehicle.setDriver(this);
        return getDriverName() + " is getting into the car " + vehicle.getBrandCar();
    }
    public void startDriving(int distance){
        vehicle.driving(distance);
    }
    public void aboutCar(){
        System.out.println("driver.Driver: " + getDriverName() + " is sat down in the car " + vehicle.getBrandCar());
    }
}
