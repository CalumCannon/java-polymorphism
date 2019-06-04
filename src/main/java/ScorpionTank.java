public class ScorpionTank extends Unit implements IVehicle{
    public ScorpionTank(String name, int health, Team team) {
        super("ScorpionTank", 30, Team.UNSC);
    }

    public String drive() {
        return "*tank noises*";
    }

    public String transport(Unit unit) {
        return "transporting: " + unit.getName();
    }
}
