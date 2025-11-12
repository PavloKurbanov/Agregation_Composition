package CompanyManagerandEmployee;

public class Main {
    public static void main(String[] args) {
        Company tesla = new Company("Tesla");
        Company gotou = new Company("GO TO-U");

        Manager managerBohdan = new Manager("Богдан");
        Manager managerIlon = new Manager("Ілон");

        Employee pavlo = new Employee("Pavlo");
        Employee lubomir = new Employee("Lubomir");

        tesla.hireManager(managerBohdan);
        managerBohdan.printCompany();
        tesla.hireManager(managerIlon);
        managerIlon.printCompany();
        gotou.hireManager(managerBohdan);
        tesla.showManager();
        gotou.showManager();
        managerBohdan.assignEmployee(pavlo);
        managerBohdan.assignEmployee(lubomir);
        pavlo.printManager();
        lubomir.printManager();
        pavlo.quit();
        managerBohdan.assignEmployee(pavlo);
        managerBohdan.printEmployee();
    }
}
