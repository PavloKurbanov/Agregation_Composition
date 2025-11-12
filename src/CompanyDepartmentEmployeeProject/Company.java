package CompanyDepartmentEmployeeProject;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private final String name;
    private Department departments;

    public Company(String name){
        this.name = name;
    }

    public void addDepartment(Department department){
        if(department.haveCompany()){
            System.out.println("Департамент " + department.getName() + " вже є в компанії " + department.getCompany().getName());
            return;
        }
        if(this.departments != null){
            System.out.println("Компанія " + getName() + " вже має департамент " + departments.getName());
            return;
        }
        this.departments = department;
        department.setCompany(this);
        System.out.println("Департамент " + department.getName() + " додано до компанії " + getName());
    }

    public void showDepartment(){
        if(this.departments == null){
            System.out.println("Компанія " + getName() + " не має жодного департаменту");
            return;
        }
        System.out.println("Компанія: " + getName() + " має департамент " + departments.getName());
    }

    public String getName(){
        return name;
    }

    public Department getDepartments(){
        return departments;
    }

    private void setDepartments(Department departments){
        this.departments = departments;
    }

}
