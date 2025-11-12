package CompanyManagerandEmployee;

public class Company {
    private final String name;
    private Manager manager;

    public Company(String name){
        this.name = name;
    }

    public void hireManager(Manager newManager){
        if(newManager.haveCompany())
        {
            System.out.println("Менеджер " + newManager.getName() + " вже є в компанії " + newManager.getCompany().getName());
            return;
        }
        if(this.manager != null){
            System.out.println("Компанія " + getName() + " вже має менеджера " + this.manager.getName());
            return;
        }
        this.manager = newManager;
        newManager.assignToCompany(this);
        System.out.println("Компанія " + getName() + " найняла менеджера " + newManager.getName());
    }

    public void showManager(){
        if(this.manager == null){
            System.out.println("Компанія " + getName() + " не має менеджера");
            return;
        }
        System.out.println("Менеджер компанії " + getName() + " : " + this.manager.getName());
    }

    public String getName(){
        return this.name;
    }
}
