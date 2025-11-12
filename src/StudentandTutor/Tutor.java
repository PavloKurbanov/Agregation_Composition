package StudentandTutor;

public class Tutor {
    private final String name;
    private Student student;

    public Tutor(String name) {
        this.name = name;
    }

    public void assignStudent(Student newStudent){
        if (newStudent.isStudenBusy()){
            System.out.println("Студент " + newStudent.getStudentName() + " зайнятий репетитором " + newStudent.getTutor().getTutorName() + " . ");
        } else if(this.student != null){
            System.out.println("Репетирот " + getTutorName() + " вже навчає студента " + student.getStudentName() + " . ");
        } else{
            this.student = newStudent;
            student.setTutor(this);
            System.out.println(" Репетирот " + getTutorName() + " взяв студента " + newStudent.getStudentName() + " . ");
        }
    }
    public boolean isBusy(){
        return this.student != null;
    }

    public void printStudents(){
        if(this.student != null){
            System.out.println("Репетитор " + getTutorName() + " навчає студента " + student.getStudentName() + " . ");
        } else {
            System.out.println(" Репетирот " + getTutorName() + " не навчає жодного студента .");
        }
    }

    public String getTutorName(){
        return name;
    }

    public Student getStudent(){
        return student;
    }

    public void setStudent(Student student){
        this.student = student;
    }
}
