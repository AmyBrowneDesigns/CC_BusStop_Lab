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

    public void pickUpPassengerFromBusStop(BusStop busStop){
        if (countPassengers() < capacity) {
            Person person = busStop.removePassenger();
            this.passengers.add(person);
        }
    }
    public void dropOff(){
        this.passengers.remove(0);
    }

}
