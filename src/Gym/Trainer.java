package Gym;

public class Trainer {
    private String name;
    private Client client;

    public Trainer(String name) {
        this.name = name;
    }

    public void trainClient(Client client) {
        if(this.client == null){
            this.client = client;
            System.out.println("Тренер " + getName() + " тренує клієнта " + client.getName() + ".");
        } else {
            System.out.println("Тренер " + getName() + " вже тренує клієнта " + this.client.getName() + ".");
        }
    }

    public String getName() {
        return name;
    }

    public Client getClient() {
        return client;
    }
}
