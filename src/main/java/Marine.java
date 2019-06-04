public class Marine extends Unit implements ISoldier {

    public Marine() {
        super("Marine", 10, Team.UNSC);
    }

    public void useExplosives(IVehicle vehicle) {
        attack(vehicle);
    }

    public String hide() {
        return "I am hiding";
    }

}
