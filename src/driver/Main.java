package driver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Driver pavlo = new Driver("Pavlo");
        Vehicle bmw = new Vehicle("BMW", new Engine(0));

        System.out.println(pavlo.getIntoTheCar(bmw));
        pavlo.aboutCar();
        pavlo.startDriving(150);
        pavlo.startDriving(100);
        bmw.infoAboutTrip();
    }
}