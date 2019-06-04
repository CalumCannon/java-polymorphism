public abstract class Unit {

    private String name;
    private int health;
    private Team team;

    public Unit(String name, int health, Team team){
        this.name = name;
        this.health = health;
        this.team = team;
    }

    public int attack(){
        return 1;
    }

    public void attack(IVehicle vehicle) {
        ((Unit)vehicle).damage(10);
    }

    public void damage(int damage){
        this.health -= damage;
    }

    public String getName(){
        return this.name;
    }

    public int getHealth() {
        return health;
    }

    public Team getTeam(){
        return team;
    }
}
