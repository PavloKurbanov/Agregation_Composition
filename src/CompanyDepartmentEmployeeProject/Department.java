package CompanyDepartmentEmployeeProject;


public class Department {
    private final String name;
    private Employee employees;
    private Company company;


    public Department(String name){
        this.name = name;
    }

    public void addEmployee(Employee employee){
        if(employee.haveDepartment()){
            System.out.println("Працівник " + employee.getName() + " має департамент " + employee.getDepartment().getName());
            return;
        }
        if(this.employees != null){
            System.out.println("Департамент " + getName() + " має працівника " + employees.getName());
            return;
        }
        this.employees = employee;
        employee.setDepartment(this);
        System.out.println("Працівник " + employee.getName() + " доданий до департаменту " + getName() );
    }

    public void printEmployees(){
        if(this.employees == null){
            System.out.println("Департамент " + getName() +  " не має працівника");
            return;
        }
        System.out.println("Департамент " + getName() +  " має працівника " + employees.getName());
    }

    public void printCompany(){
        if(this.company == null){
            System.out.println("Департамент " + getName() + " не входить в жодну компанію");
            return;
        }
        System.out.println("Департамент " + getName() + " є в компанії " + company.getName());
    }

    public boolean haveCompany(){
        return company != null;
    }

    public String getName(){
        return this.name;
    }

    public Employee getEmployees(){
        return this.employees;
    }

    public Company getCompany(){
        return this.company;
    }

    public void setEmployees(Employee employees){
        this.employees = employees;
    }

    public void setCompany(Company company){
        this.company = company;
    }
}
