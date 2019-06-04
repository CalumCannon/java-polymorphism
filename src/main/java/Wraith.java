public class Wraith extends Unit implements IVehicle {
    public Wraith() {
        super("Wraith", 120, Team.Covenant);
    }

    public String drive() {
        return "*alien tank noises*";
    }

    public String transport(Unit unit) {
        return "I am a " + super.getName() + " and I amtransporting: " + unit.getName();
    }

    //Overloading
    public int attack(){
        return 15;
    }
}
