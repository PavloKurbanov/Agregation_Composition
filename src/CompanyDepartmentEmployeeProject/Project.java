package CompanyDepartmentEmployeeProject;

import java.util.List;

public class Project {
    private final String name;
    private Employee employees;

    public Project(String name){
        this.name = name;
    }

    public void printEmployee(){
        if(this.employees == null){
            System.out.println("Над проектом " + getName() + " не працює ніхто");
            return;
        }
        System.out.println("Над проектом " + getName() + " працює " + this.employees.getName());
    }

    public boolean haveEmployees(){
        return employees != null;
    }

    public String getName(){
        return name;
    }

    public Employee getEmployees(){
        return employees;
    }

    public void setEmployees(Employee employees){
        this.employees = employees;
    }

}
