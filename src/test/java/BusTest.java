import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;

    @Before
    public void before(){
        bus = new Bus("Portabello", 40);
        person = new Person();

    }

    @Test
    public void checkBusStartsEmpty(){
        assertEquals(0, bus.countPassengers());
    }

    @Test
    public void canAddPassengers(){
        bus.pickUp();
        assertEquals(1,bus.countPassengers());
    }

    @Test
    public void canRemovePassengers(){
        bus.pickUp();
        bus.dropOff();
        assertEquals(0, bus.countPassengers());
    }

}
