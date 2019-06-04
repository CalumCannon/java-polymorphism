import java.util.ArrayList;

public class Simulation {

    private ArrayList<Unit> units;
    private ArrayList<IVehicle> vehicles;
    private ArrayList<ISoldier> soldiers;

    public Simulation(){
        units = new ArrayList<Unit>();
        vehicles = new ArrayList<IVehicle>();
        soldiers = new ArrayList<ISoldier>();
    }

    public int getVehicleCount(){
        return vehicles.size();
    }

    public int getUnitCount() {
        return units.size();
    }

    public int getTankCount(){
        return this.vehicles.size();
    }

    public int getSoldierCount(){
        return this.soldiers.size();
    }

    public void addUnit(IVehicle vehicle){
        this.units.add((Unit)vehicle);
        this.vehicles.add(vehicle);
    }

    public void addUnit(ISoldier unit) {
        this.units.add((Unit)unit);
        this.soldiers.add(unit);
    }


}
