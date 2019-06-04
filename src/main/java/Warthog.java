public class Warthog extends Unit implements IVehicle{
    public Warthog(String name, int health, Team team) {
        super("Warthog", 20, Team.UNSC);
    }

    public String drive() {
        return "*humvee noises*";
    }

    public String transport(Unit unit) {
        return "I am a humvee and I am transporting " + unit.getName();
    }
}
