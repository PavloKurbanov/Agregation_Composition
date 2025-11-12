package CompanyManagerandEmployee;

public class Manager {
    private final String name;
    private Company company;
    private Employee employee;

    public Manager(String name){
        this.name = name;
    }

    public void assignEmployee(Employee newEmployee){
        if(newEmployee.haveManager()){
            System.out.println("Працівник " + newEmployee.getName() + " зайнятий менеджером " + newEmployee.getManager().getName());
            return;
        }
        if(this.employee != null){
            System.out.println("Менеджер " + getName() + " вже має працівника " + this.employee.getName());
            return;
        }
        this.employee = newEmployee;
        newEmployee.assignToManager(this);
        System.out.println("Менеджер " + getName() + " тепер керує працівником " + newEmployee.getName());
    }

    public void printCompany(){
        if(this.company == null){
            System.out.println(getName() + " немає компанії ");
            return;
        }
        System.out.println(getName() + " працює в компанії " + this.company.getName());
    }

    public void printEmployee(){
        if(this.employee == null){
            System.out.println(getName() + " зараз ніким не керує");
            return;
        }
        System.out.println(getName() + " керує працівником " + this.employee.getName());
    }

    public void assignToCompany(Company newCompany){
        setCompany(newCompany);
    }

    public boolean haveCompany() {
        return company != null;
    }

    public String getName() {
        return name;
    }

    public Company getCompany(){
        return company;
    }

    public void setEmployee(Employee newEmployee) {
        this.employee = newEmployee;
    }

    private void setCompany(Company company) {
        this.company = company;
    }
}
