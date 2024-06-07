package KampfDerSterne;

public class Monster {
    private String name;
    private int age;
    private int powerLevel;
    private Object loot;

    public Monster(String name, int age, int powerLevel) {
        this.name = name;
        this.age = age;
        this.powerLevel = powerLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public Object getLoot() {
        return loot;
    }

    public void addLoot(Object item) {
        loot = item;
    }

    public void removeLoot(Object item) {
        loot = null;
    }
}
