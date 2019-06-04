import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarineTest {

    Marine marine;

    @Before
    public void setUp() {
        marine = new Marine();
    }

    @Test
    public void testMarineAttack() {
        assertEquals(1, marine.attack());
    }
}
