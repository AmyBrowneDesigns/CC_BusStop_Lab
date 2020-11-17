import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    private BusStop busStop;
    private Person person;

    @Before
    public void before (){
        busStop = new BusStop("Leith");
        person = new Person();
    }

    @Test
    public void canAddPersonToQueue(){
        busStop.addPassenger(person);
        assertEquals(1, busStop.passengerCount());
        }


    @Test
    public void canRemovePersonFromQueue(){
        busStop.addPassenger(person);
        busStop.removePassenger();
        assertEquals(0, busStop.passengerCount());

    }
    }

