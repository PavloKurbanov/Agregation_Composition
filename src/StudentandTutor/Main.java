package StudentandTutor;

public class Main {
    public static void main(String[] args) {
        Student pavlo = new Student("Павло");
        Student vasilyna = new Student("Василина");

        Tutor rocsolana = new Tutor("Роксолана");
        Tutor olena = new Tutor("Олена");

        pavlo.chooseTutor(olena);
        pavlo.printTutor();

    }
}
