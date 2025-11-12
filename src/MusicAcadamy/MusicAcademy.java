package MusicAcadamy;

public class MusicAcademy {
    private final String name;

    private Department department;

    public MusicAcademy(String name) {
        this.name = name;
    }

    // Додали департамент
    public void addDepartment(Department newDepartment){
        if(newDepartment.haveMusicAcademy()){
            System.out.println("Департамент: " + newDepartment.getName() + " входить до академії: " + newDepartment.getMusicAcademy().getName() + ".");
            return;
        }
        if(haveDepartment()){
            System.out.println("Академія: " + getName() + " вже має департамент: " + this.department.getName() + ".");
            return;
        }
        this.department = newDepartment;
        department.setMusicAcademy(this);
        System.out.println("Департамент: " + newDepartment.getName() + " успішно доданий до академії: " + getName() + ".");
    }

    // Видалити департамент
    public void removeDepartment(Department newDepartment){
        if(!haveDepartment()){
            System.out.println("Академія: " + getName() + " не має жодного департаменту.");
            return;
        }
        System.out.println("Департамент: " + newDepartment.getName() + " видалений з академії " + getName() + ".");
        department.setMusicAcademy(null);
        this.department = null;
    }

    public void infoAboutMusicAcademy(){
        if(!haveDepartment()){
            System.out.println("Академія: " + getName() +  " не має жодного департаменту");
        } else {
            System.out.println("Академія: " + getName() + " має департамент " + department.getName() + ".");
        }
    }

    public boolean haveDepartment(){
        return department != null;
    }

    public String getName(){
        return name;
    }
}
