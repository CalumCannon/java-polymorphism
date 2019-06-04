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

    public String getName(){
        return this.name;
    }
}
