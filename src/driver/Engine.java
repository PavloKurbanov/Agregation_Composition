package driver;

public class Engine{

    private int kilometers;

    public Engine(int kilometers) {
        this.kilometers = kilometers;
    }
    public int getKilometers(){
        return kilometers;
    }

    public void drive(int kilometers) {
        start();
        this.kilometers = getKilometers() + kilometers;
        stop();
    }
    private void stop(){
        System.out.println("driver.Engine stopped after driving " + getKilometers() + " kilometers.");
    }
    private void start(){
        System.out.println("driver.Engine started.");
    }
}
