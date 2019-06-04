import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimulationTest {

    Simulation simulation;

    //UNSC
    Marine marine;
    ScorpionTank tank;
    Warthog humvee;

    //Covenant
    Grunt grunt;
    Wraith alienTank;


    @Before
    public void setUp(){
        simulation = new Simulation();
        marine = new Marine();
        tank = new ScorpionTank();

        grunt = new Grunt();
        alienTank = new Wraith();
    }

    @Test
    public void testGetVehicleCount()
    {
        simulation.addUnit(tank);
        simulation.addUnit(humvee);
        simulation.addUnit(alienTank);
        simulation.addUnit(marine);

        assertEquals(3, simulation.getVehicleCount());
    }

    @Test
    public void testGetSoldierCount()
    {
        simulation.addUnit(tank);
        simulation.addUnit(grunt);
        simulation.addUnit(marine);

        assertEquals(2, simulation.getSoldierCount());
    }

    @Test
    public void testGetTotalUnitCount() {
        simulation.addUnit(tank);
        simulation.addUnit(grunt);
        simulation.addUnit(marine);
        simulation.addUnit(humvee);
        simulation.addUnit(alienTank);

        assertEquals(5, simulation.getUnitCount());
    }

    @Test
    public void testAttack() {
        marine.damage(grunt.attack());
        assertEquals(9,marine.getHealth());
    }

    //Test use explosives - check tank health
    @Test
    public void testUseExplosives() {
        marine.useExplosives(alienTank);
        assertEquals(110,alienTank.getHealth());
    }


}
