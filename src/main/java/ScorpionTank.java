public class ScorpionTank extends Unit implements IVehicle{
    public ScorpionTank() {
        super("Scorpion Tank", 30, Team.UNSC);
    }

    public String drive() {
        return "*tank noises*";
    }

    public String transport(Unit unit) {
        return "I am a " + super.getName() + " and I am transporting a " + unit.getName();
    }

    //Overloading
    public int attack(){
        return 10;
    }
}
