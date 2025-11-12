package MusicAcadamy;

public class Composition {
    private final String name;

    private Student student;

    public Composition(String name){
        this.name = name;
    }

    public void printInfo(){
        if(!haveStudent()){
            System.out.println("Композицію: " + getName() + "  не виконує жоден студент.");
            return;
        }
        System.out.println("Композицію: " + getName() + " виконує студент " + student.getName() + ".");
    }

    public boolean haveStudent(){
        return  student != null;
    }

    public String getName(){
        return name;
    }

    public Student getStudent(){
        return student;
    }

    public void setStudent(Student student){
        this.student = student;
    }
}
