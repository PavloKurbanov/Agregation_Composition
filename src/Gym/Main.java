package Gym;



import java.util.List;

public class Main {
    public static void main(String[] args){
        Gym gym = new Gym("Evolution");
        Client client = new Client("Pavlo");
        Client client1 = new Client("Roman");
        Trainer trainer = new Trainer("Vlad");
        Trainer trainer1 = new Trainer("Oleh");


        client1.getTrainer(trainer); // Клієнт Roman взяв тренера Vlad
        client1.getTrainer(trainer);
    }
}
