import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Portabello", 3);
        person = new Person();
        busStop = new BusStop("Princes Street");
        busStop.addPassenger(person);

    }

    @Test
    public void checkBusStartsEmpty(){
        assertEquals(0, bus.countPassengers());
    }

    @Test
    public void canAddPassengers(){
        bus.pickUpPassengerFromBusStop(busStop);
        assertEquals(1,bus.countPassengers());
        assertEquals(1, bus.countPassengers());
    }

    @Test
    public void canRemovePassengers(){
        bus.pickUpPassengerFromBusStop(busStop);
        bus.dropOff();
        assertEquals(0, bus.countPassengers());
    }

    @Test
    public void cannotAddMoreThanCapacity(){
        bus.pickUpPassengerFromBusStop(busStop);
        assertEquals(1, bus.countPassengers());

    }
}
