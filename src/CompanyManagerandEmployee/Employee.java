package CompanyManagerandEmployee;

public class Employee {
    private final String name;
    private Manager manager;

    public Employee(String name){
        this.name = name;
    }

    public void quit(){
        if(manager == null){
            System.out.println("Працівник " + getName() + " не має менеджера");
            return;
        }
        System.out.println(getName() + " більше не працює під керівництвом " + manager.getName());
        manager.setEmployee(null);
        this.manager = null;
    }
    public void printManager(){
        if(this.manager == null){
            System.out.println(getName() + " зараз не має менеджера");
            return;
        }
        System.out.println(getName() + " керує менеджером " + this.manager.getName());
    }

    public void assignToManager(Manager manager){
        setManager(manager);
    }

    public String getName(){
        return this.name;
    }
    public Manager getManager(){
        return this.manager;
    }

    private void setManager(Manager manager){ // Chat сказав щоб їх робити приватними
        this.manager = manager;
    }

    public boolean haveManager(){
        return this.manager != null;
    }
}
