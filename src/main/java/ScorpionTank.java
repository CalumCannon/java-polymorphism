public class ScorpionTank extends Unit implements IVehicle{
    public ScorpionTank() {
        super("ScorpionTank", 30, Team.UNSC);
    }

    public String drive() {
        return "*tank noises*";
    }

    public String transport(Unit unit) {
        return "I am a " + super.getName() + " and I amtransporting: " + unit.getName();
    }

    //Overloading
    public int attack(){
        return 10;
    }
}
