package CompanyDepartmentEmployeeProject;

public class Main {
    public static void main(String[] args) {
        Company c = new Company("TechCorp");
        Department d = new Department("IT");
        Employee e = new Employee("Іван");
        Project p = new Project("CRM System");

        Company g = new Company("GO TO-U");
        Department m = new Department("Marketing");
        Employee pavlo = new Employee("Павло");
        Project r = new Project("Reservation");



        c.addDepartment(d);     // Компанія наймає департамент
        d.addEmployee(e);       // Департамент бере працівника
        e.assignProject(p);// Працівнику дають проєкт
        p.printEmployee();
        e.printProject();
        d.printCompany();
        d.addEmployee(pavlo);

        // Додати до проекту більше валідації
        // Департамент не може взяти працівника якщо він не є в компанї

    }
}
