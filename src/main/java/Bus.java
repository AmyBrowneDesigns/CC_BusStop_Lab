import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;


    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public int countPassengers(){
        return this.passengers.size();
    }

    public void pickUp(){
        Person person = new Person();
        if (countPassengers() < capacity) {
            this.passengers.add(person);
        }
    }
    public void dropOff(){
        this.passengers.remove(0);
    }

}