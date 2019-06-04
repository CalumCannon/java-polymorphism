public class Grunt extends Unit implements ISoldier {
    public Grunt() {
        super("Grunt", 10, Team.Covenant);
    }

    public String hide() {
        return "I am hiding";
    }

    public void useExplosives(IVehicle vehicle) {
        attack(vehicle);
    }

}
