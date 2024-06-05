package KampfDerSterne;

public class Monster {
    private String name;
    private int alter;
    private int kraft;
    private Gegenstand loot;

    public Monster(String name, int alter, int kraft) {
        this.name = name;
        this.alter = alter;
        this.kraft = kraft;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public int getKraft() {
        return kraft;
    }

    public Gegenstand getLoot() {
        return loot;
    }

    public void addLoot(Gegenstand gegenstand) {
        loot = gegenstand;
    }

    public void removeLoot(Gegenstand gegenstand) {
        loot = null;
    }
}
