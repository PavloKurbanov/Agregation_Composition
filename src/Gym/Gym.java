package Gym;

import java.sql.SQLOutput;

public class Gym {
    private final String name;
    private Trainer trainer;

    public Gym(String name) {
        this.name = name;
    }

    public void getTrainer(Trainer trainer) {
        if(this.trainer == null){
            this.trainer = trainer;
            System.out.println("Тренер отриманий у спортзал " + name + ".");

        } else {
            System.out.println("Спортзал " + name + " вже має тренера.");
        }
    }

    public void infoGym(){
        if(this.trainer == null){
            System.out.println("В залі " + getName() + " не має жодного тренера.");
            return;
        }
        System.out.println("В залі " + getName() + " тренер " + trainer.getName() + " тренує " + trainer.getClient().getName());
    }

    public String getName() {
        return name;
    }
}
