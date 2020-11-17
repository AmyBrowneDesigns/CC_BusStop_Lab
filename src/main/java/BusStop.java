import java.util.ArrayList;

public class BusStop {

    private ArrayList<Person> queue;
    private String name;

    public BusStop(String name){
        this.queue = new ArrayList<>();
        this.name = name;
    }

    public void addPassenger(Person person){
        this.queue.add(person);
        }

    public int passengerCount(){
        return this.queue.size();
    }
    public Person removePassenger(){
        return this.queue.remove(0);
    }

    }
