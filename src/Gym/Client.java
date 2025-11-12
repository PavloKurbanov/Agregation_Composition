package Gym;

public class Client {
    private final String name;
    private Trainer trainer;

    public Client(String name) {
        this.name = name;
    }

    public void getTrainer(Trainer trainer){
        if(this.trainer == null){
            this.trainer = trainer;
            System.out.println("Клієн " + getName() + " отримав тренера " + trainer.getName() + ".");
        } else {
            System.out.println("Клієн " + getName() + " Вже має тренера " + this.trainer.getName() + ".");
        }
    }

    public void removeTrainer(){
        if(this.trainer != null){
            this.trainer = null;
            System.out.println("Клієнт " + getName() + " більше не має тренера.");
        }
    }

    public void informsTrainer(Trainer trainer){
        if(this.trainer == null){
            System.out.println("Клієн " + getName() + " не має тренера.");
        } else {
            System.out.println("Клієн " + getName() + " тренується з " + this.trainer.getName() + ".");
        }
    }

    public String getName() {
        return name;
    }
}
