package MusicAcadamy;

public class Student {

    private final String name;

    private Teacher teacher;

    private Composition composition;

    public Student(String name){
        this.name = name;
    }

    // Додаємо композицію
    public void addComposition(Composition newComposition){
        if(!haveTeacher()){
            System.out.println("Студент: " + getName() + " не може додати композицію: " + newComposition.getName() + " бо не має викладача.");
            return;
        }
        if(newComposition.haveStudent()){
            System.out.println("Композицію: " + newComposition.getName() + " вже виконує: " + newComposition.getStudent().getName() + ".");
            return;
        }
        if(haveComposition()){
            System.out.println("Студент: " + getName() + " вже виконує композицію: " + composition.getName() + ".");
            return;
        }
        composition = newComposition;
        newComposition.setStudent(this);
        System.out.println("Студент: " + getName() + " виконує композицію: " + newComposition.getName() + ".");
    }

    // Закінчуємо роботу з композицією
    public void finishComposition(Composition newComposition){
        if(!haveComposition()){
            System.out.println("Студент: " + getName() + " не має жодної композиції.");
            return;
        }
        if(composition != newComposition){
            System.out.println("Студент: " + getName() + " не виконує композицію: " + newComposition.getName());
            return;
        }
        System.out.println("Студент: " + getName() + " закінчив роботу над композицією: " + newComposition.getName() + ".");
        newComposition.setStudent(null);
        composition = null;
    }

    public void infoAboutStudent(){
        if(!haveTeacher()){
            System.out.println("Студент: " + getName() + "  не має викладача.");
            return;
        }
        if(!haveComposition() && haveTeacher()){
            System.out.println("Студент: " + getName() + " навчається у викладача: " + teacher.getName() + ", але не має композиції.");
            return;
        }
        System.out.println("Студент: " + getName() + " навчається у викладача: " + teacher.getName() + ", і виконує композицію." + composition.getName() + ".");
    }

    public boolean haveTeacher(){
        return teacher != null;
    }

    public boolean haveComposition(){
        return composition != null;
    }

    public String getName(){
        return name;
    }

    public Teacher getTeacher(){
        return teacher;
    }

    public void setTeacher(Teacher teacher){
        this.teacher = teacher;
    }
}
