package StudentandTutor;

public class Student {
    private String name;
    private Tutor tutor;

    public Student(String name){
        this.name = name;
    }

    public void chooseTutor(Tutor newTutor){
        if(newTutor.isBusy()){
            System.out.println("Репетитор " + newTutor.getTutorName() + " вже зайнятий " + newTutor.getStudent().getStudentName() );
        }
        else if(this.tutor != null){
            System.out.println("Студент " + getStudentName() + " вже має репетитора " + tutor.getTutorName() + " . ");
        } else {
            this.tutor = newTutor;
            tutor.setStudent(this);
            System.out.println("Студент " + getStudentName() + " обрав репетитора " + newTutor.getTutorName() + " . ");
        }
    }
    public void stopStudying(){
        this.tutor = null;
        System.out.println("Студент " + getStudentName() + " більше не займається з " + tutor.getTutorName() + " . ");
    }

    public void printTutor() {
        if (this.tutor != null) {
            System.out.println("Студент " + getStudentName() + " навчається в репетитора " + tutor.getTutorName() + " . ");
        } else {
            System.out.println("Студент " + getStudentName() + " не навчається в жодного репетитора .");
        }
    }

    public boolean isStudenBusy(){
        return this.tutor != null;
    }

    public boolean isAvailable(){
        return tutor == null;
    }

    public String getStudentName(){
        return name;
    }

    public Tutor getTutor(){
        return tutor;
    }

    public void setTutor(Tutor tutor){
        this.tutor = tutor;
    }
}
