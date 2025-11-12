package MusicAcadamy;

public class Teacher {
    private final String name;
    private Department department;
    private Student student;

    public Teacher(String name){
        this.name = name;
    }

    // Додаємо студента
    public void addStudent(Student newStudent){
        if(!haveDepartment()){
            System.out.println("Викладач: " + getName() + " не може навчати студента: " + newStudent.getName() + " бо не входить в жоден департамент.");
            return;
        }
        if(newStudent.haveTeacher()){
            System.out.println("Студент: " + newStudent.getName() + " вже навчає викладач: " + newStudent.getTeacher().getName() + ".");
            return;
        }
        if(haveStudent()){
            System.out.println("Викладач: " + getName() + " вже навчає студента: " + student.getName() + ".");
            return;
        }
        student = newStudent;
        newStudent.setTeacher(this);
        System.out.println("Студент: " + newStudent.getName() + " успішно доданий до викладача: " + getName() + ".");
    }

    // Виганяємо студента
    public void removeStudent(Student newStudent){
        if(!haveStudent()){
            System.out.println("Викладач: " + getName() + " не навчає жодного студента.");
            return;
        }
        if(student != newStudent){
            System.out.println("Викладач: " + newStudent + " не навчається у викладача: " + getName());
            return;
        }
        System.out.println("Викладач: " + getName() + " вигнав студента: " + newStudent.getName() + ".");
        newStudent.setTeacher(null);
        student = null;
    }

    public void infoAboutTeacher(){
        if(!haveDepartment()){
            System.out.println("Викладач: " + getName() + "  не входить в жоден департамент.");
            return;
        }
        if(!haveStudent() && haveDepartment()){
            System.out.println("Викладач: " + getName() + " входить в департамент: " + department.getName() + ", але не має студента.");
            return;
        }
        System.out.println("Викладач: " + getName() + " входить в департамент: " + department.getName() + ", і має студента." + student.getName() + ".");
    }

    public boolean haveDepartment(){
        return department != null;
    }

    public boolean haveStudent(){
        return student != null;
    }

    public String getName(){
        return name;
    }

    public Department getDepartment(){
        return department;
    }

    public void setDepartment(Department department){
        this.department = department;
    }
}
