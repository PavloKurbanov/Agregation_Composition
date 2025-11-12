package MusicAcadamy;

public class Department {
    private final String name;

    private MusicAcademy musicAcademy;

    private Teacher teacher;

    public Department(String name){
        this.name = name;
    }

    // Додаємо викладача
    public void addTeacher(Teacher newTeacher){
        if(!haveMusicAcademy()){
            System.out.println("Департамент: " + getName() + " не може додати викладача: " + newTeacher.getName() + " бо не входить в жодну академію.");
            return;
        }
        if(newTeacher.haveDepartment()){
            System.out.println("Викладач: " + newTeacher.getName() + " викладає в департаменті: " + newTeacher.getDepartment().getName() + ".");
            return;
        }
        if(haveTeacher()){
            System.out.println("Департамент: " + getName() + " вже має викладача: " + teacher.getName() + ".");
            return;
        }
        teacher = newTeacher;
        newTeacher.setDepartment(this);
        System.out.println("Викладач: " + newTeacher.getName() + " успішно доданий до департаменту: " + getName() + ".");
    }

    // Видаляємо викладача
    public void removeTeacher(Teacher newTeacher){
        if(!haveTeacher()){
            System.out.println("Департамент: " + getName() + " не має жодного викладача.");
            return;
        }
        if(teacher != newTeacher){
            System.out.println("Викладач: " + newTeacher + " не належить департаменту: " + getName());
            return;
        }
        System.out.println("Викладач: " + newTeacher.getName() + " успішно видалений з департаменту: " +  getName() + ".");
        newTeacher.setDepartment(null);
        teacher = null;
    }

    public void infoAboutDepartment(){
        if(!haveMusicAcademy()){
            System.out.println("Департамент: " + getName() + "  не входить в жодну академію.");
            return;
        }
        if(!haveTeacher() && haveMusicAcademy()){
            System.out.println("Департамент: " + getName() + " входить в академію: " + musicAcademy.getName() + ", але не має викладача.");
            return;
        }
        System.out.println("Департамент: " + getName() + " входить в академію: " + musicAcademy.getName() + ", і має викладача." + teacher.getName() + ".");
    }

    public boolean haveMusicAcademy(){
        return musicAcademy != null;
    }

    public String getName(){
        return name;
    }

    public MusicAcademy getMusicAcademy(){
        return musicAcademy;
    }


    public void setMusicAcademy(MusicAcademy newMusicAcademy){
        this.musicAcademy = newMusicAcademy;
    }

    private boolean haveTeacher(){
        return teacher != null;
    }
}
