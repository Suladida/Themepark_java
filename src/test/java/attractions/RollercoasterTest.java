package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void visitorCannotRide() {
        assertEquals(false, rollerCoaster.isAllowedTo(rollerCoaster.visitor));
    }
    @Test
    public void visitorCanRide() {
        assertEquals(true, rollerCoaster.isAllowedTo(rollerCoaster.visitor2));
    }
    @Test
    public void ticketPriceDoubles(){
        assertEquals(16.80, rollerCoaster.priceFor(rollerCoaster.visitor2), 0.1);
    }

    @Test
    public void ticketPriceDoesNotDouble(){
        assertEquals(8.40, rollerCoaster.priceFor(rollerCoaster.visitor), 0.1);
    }

}
