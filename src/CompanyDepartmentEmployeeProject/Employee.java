package CompanyDepartmentEmployeeProject;

public class Employee {
    private final String name;
    private Department department;
    private Project project;

    public Employee(String name){
        this.name = name;
    }

    public void assignProject(Project project){
        if(project.haveEmployees()){
            System.out.println("Проект " + project.getName() + " має працівника " + project.getEmployees().getName());
            return;
        }
        if(this.project != null){
            System.out.println("Працівник " + getName() + " має проет " + this.project.getName());
            return;
        }
        this.project = project;
        project.setEmployees(this);
        System.out.println("Працівник " + getName() + " працює на проекті " + project.getName());
    }

    public void printProject(){
        if(this.project == null){
            System.out.println("Працівник " + getName() + " не має жодного проекту");
            return;
        }
        System.out.println("Працівник " + getName() + " працюж на проекті " + this.project.getName());
    }

    public void printDepartment(){
        if(this.department == null){
            System.out.println("Працівник " + getName() + " не входить в жодний департамент");
            return;
        }
        System.out.println("Працівник " + getName() + " працюж в департаменті " + this.department.getName());
    }

    public boolean haveDepartment(){
        return department != null;
    }

    public String getName(){
        return name;
    }

    public Department getDepartment(){
        return department;
    }

    public Project getProject(){
        return project;
    }

    public void setProject(Project project){
        this.project = project;
    }

    public void setDepartment(Department department){
        this.department = department;
    }
}
